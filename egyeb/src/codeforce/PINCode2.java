package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
public class PINCode2 {
static Random rand=new Random();
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
			HashSet<Integer> egyedi=new HashSet<>();
			ArrayList<Integer>nemegyedi=new ArrayList<>();
			for(int a=0; a<n;a++) {
				int szam=k[a][0]*1000+k[a][1]*100+k[a][2]*10+k[a][3];
			}
		
			for(int a=0; a<n;a++) {
				boolean[] visited=new boolean[n];
				for(int v=0; v<n;v++) visited[v]=false;
				
				for(int o=0; o<n-1; o++) {
					int ciklus=0;					
					 for(int u=o+1; u<n; u++) {				 
						 if (k[o][0]==k[u][0] &&  k[o][1]==k[u][1] && k[o][2]==k[u][2] &&  k[o][3]==k[u][3] && !visited[u]){					
							 visited[o]=true;   visited[u]=true; 
							 int szam=k[u][0]*1000+k[u][1]*100+k[u][2]*10+k[u][3];
							 while(egyedi.contains(szam)) {
								
							 }
							 
						 }
						}					
					}	
			}
		}
	}
	public static int samenumber(int[][] k, int n) {
		int s=0;
		boolean[] visited=new boolean[n];
		for(int i=0; i<n;i++) visited[i]=false;
		for(int o=0; o<n-1; o++) {	
			int a=0;
			 for(int u=o+1; u<n; u++) {				 
				 if (k[o][0]==k[u][0] &&  k[o][1]==k[u][1] && k[o][2]==k[u][2] &&  k[o][3]==k[u][3] && !visited[u]){					
					 if(a==0) s+=2;
					 if(a!=0) s++;
					 System.out.println(o+","+u+","+s);
					 a++;
					 visited[o]=true;   visited[u]=true; 
				 }
				}					
			}	
		return s;
	}
	public static int digitchange(int i) {
		
		return 5;
	}
}