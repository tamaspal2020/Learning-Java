package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

public class PINCodes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(x.readLine());
		for(int i=0; i<t; i++) {
			int n=Integer.parseInt(x.readLine());		
			int[][] k=new int[n][4];
			for(int j=0; j<n; j++) {
				 String y=x.readLine();				 
				 k[j][0]=Integer.parseInt(String.valueOf(y.charAt(0)));
				 k[j][1]=Integer.parseInt(String.valueOf(y.charAt(1)));
				 k[j][2]=Integer.parseInt(String.valueOf(y.charAt(2)));
				 k[j][3]=Integer.parseInt(String.valueOf(y.charAt(3)));			 
			}
			int min=0;
			int szamlalo=0;	
			TreeSet<Integer> t1=new TreeSet<>();
			TreeSet<Integer> t2=new TreeSet<>();
			TreeSet<Integer> t3=new TreeSet<>();
			TreeSet<Integer> t4=new TreeSet<>();
			
			for(int o=0; o<n-1; o++) {		
				
			 for(int u=o+1; u<n; u++) {
				    
					if( k[o][0]==k[u][0] &&  k[o][1]==k[u][1] && k[o][2]==k[u][2] &&  k[o][3]==k[u][3] ) {
						
						 			
						if(k[u][szamlalo]==9) {
							k[u][szamlalo]=0;
							
							min++;		
						}
						else {
							k[u][szamlalo]++;
							min++;		
						}
						szamlalo+=1;
						if(szamlalo==4) {
							szamlalo=0;
							
								
						}			
					}	
					/*System.out.println("o:"+o  +"kor"+kor );
					kiir(min,k);*/
				}					
			}		
			kiir(min,k);
		}		
	}
	public static void kiir(int m, int[][] k) {
		System.out.println(m);
		for(int i=0; i<k.length;i++) {
			
			for(int j=0; j<4;j++) {
				System.out.print(k[i][j]);
			}
			System.out.println();
		}
	}
}


