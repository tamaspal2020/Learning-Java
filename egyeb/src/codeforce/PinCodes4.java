package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
public class PinCodes4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(x.readLine());		
		for(int i=0; i<t; i++) {
			int n=Integer.parseInt(x.readLine());		
			int[][] k=new int[n][4];
			TreeSet<Integer> l=new TreeSet<>();
			int count=0;
			for(int j=0; j<n; j++) {
				 String y=x.readLine();				 
				 k[j][0]=Integer.parseInt(String.valueOf(y.charAt(0)));
				 if(j==0) l.add(k[j][0]);
				 k[j][1]=Integer.parseInt(String.valueOf(y.charAt(1)));
				 k[j][2]=Integer.parseInt(String.valueOf(y.charAt(2)));
				 k[j][3]=Integer.parseInt(String.valueOf(y.charAt(3)));		
				 if(j>0) {
					 if ( (k[0][0]==k[j][0] &&  k[0][1]==k[j][1] && k[0][2]==k[j][2] &&  k[0][3]==k[j][3]) ){
						 int digit=0;
						 System.out.println("gsfdgsf");
						 	while(l.contains(digit)) {
						 		digit++;
						 	}
						 	l.add(digit);
						 	k[j][0]=digit;
						 	count++;
					 }
				 }
			}			
			/*
			boolean[] visited=new boolean[n];
			for(int v=0; v<n;v++) visited[v]=false;
			for(int o=0; o<n-1; o++) {					
				 for(int u=o+1; u<n; u++) {				 
						 if ( (k[o][0]==k[u][0] &&  k[o][1]==k[u][1] && k[o][2]==k[u][2] &&  k[o][3]==k[u][3]) && !visited[u] ){
							 	int digit=0;
							 	while(l.contains(digit)) {
							 		digit++;
							 	}
							 	l.add(digit);
							 	k[o][0]=digit;
							 	count++;
							 	visited[o]=true;
							 }
							 
					 }
			}	*/
			System.out.println(count);
			for(int z=0; z<k.length;z++) {				
				for(int j=0; j<4;j++) {
					System.out.print(k[z][j]);
				}
				System.out.println();
			}		
	}
}
}