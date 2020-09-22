package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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
			
			for(int o=0; o<n-1; o++) {		
				
			 for(int u=o+1; u<n; u++) {
				    
					if( k[o][0]==k[u][0] &&  k[o][1]==k[u][1] && k[o][2]==k[u][2] &&  k[o][3]==k[u][3] && !allDifferent(k,n) ) {						 			
						if(k[u][szamlalo]==9) {
							if(goodNumber(u, szamlalo, 0,k, n))
							{
								k[u][szamlalo]=0;
							}
							else 
								k[u][szamlalo]=2;							
							min++;		
						}
						else {
							
							
							/*if(goodNumber(u, szamlalo, 1,k, n)) {
								k[u][szamlalo]++;
							}
							else k[u][szamlalo]+=2;*/
							int v=1;
							while(!goodNumber(u, szamlalo,v, k, n))							{
								
								v++;
							}
							//if(v==1) k[u][szamlalo]++;
							if (v==1 && k[u][szamlalo]==1) {
								k[u][szamlalo]--;
							}							
							else k[u][szamlalo]=v;
							min++;		
						}
						szamlalo+=1;
						if(szamlalo==4) {
							szamlalo=0;
							
								
						}			
					}	
					/*System.out.println("o:"+o);
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
	public static boolean allDifferent(int[][] k, int n) {		
		HashSet<Integer> szamok=new HashSet<>();
		int szorzo=1;
		for(int i=0;i<n;i++) {
			int szam=k[i][0]*1000+k[i][1]*100+k[i][2]*10+k[i][3];
			szamok.add(szam);
		}
		if(szamok.size()==n) return true;
		return false;
	}
	public static boolean goodNumber(int o, int s, int number, int[][] k, int n) {
			int[][] k2=k;
			k2[o][s]=number;
		    if (!thereIsaSame(k2, o, n)) return true;
		return false;
	}
	public static boolean thereIsaSame(int[][] k, int o,int n) {	
		int szam1=k[o][0]*1000+k[o][1]*100+k[o][2]*10+k[o][3];
		int g=0;
		for(int i=1; i<n;i++) {
			int  szam2=k[i][0]*1000+k[i][1]*100+k[i][2]*10+k[i][3];
			if(szam1==szam2) g++;
		}
		if (g>1) return true;
		return false;
	
	}
}


