package codeforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BoatCompetition3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int[] result=new int[tc];		
		for(int i=0; i<tc; i++) {			
			int n=sc.nextInt();
			if(n==1 ) {
				int x=sc.nextInt();				
				result[i]=0;
			}
			else {
				if(n==2)
				{					
					int y=sc.nextInt();
					y=sc.nextInt();
					result[i]=1;
				}
				else {
					int[] w=new int[n];
					int maxsuly=0;
					int minsuly=51;
					for(int j=0;j<n;j++) {				
						w[j]=sc.nextInt();
						if(w[j]>maxsuly) {
							maxsuly=w[j];
						}
						if(w[j]<minsuly) {
							minsuly=w[j];
						}
			}
					for(int f=0; f<w.length; f++) {
						System.out.println(w[f]);
					}
			 maxsuly=maxsuly*2;
			int teams=n/2;
			minsuly=minsuly*2;
			System.out.println(maxsuly+","+teams);
			ArrayList<Integer> members=new ArrayList<Integer>();
			ArrayList<Integer> usedindex=new ArrayList<>();
			int suly=1;
			boolean ok=false;
				while(!ok) {
					ok=false;
					usedindex.clear();
					members.clear();
					System.out.println("teams"+teams);
					
					for(int x=0; x<w.length-1;x++) {
						for (int y=x+1; y<w.length; y++) {
							if(  !usedindex.contains(x)   && !usedindex.contains(y) ) {
								System.out.println("minsuly"+minsuly+"w[x]"+w[x]+"w[y]"+w[y]);								
								if(w[x]+w[y]==minsuly) {								
									System.out.println(w[x]+","+w[y]+","+minsuly);
									usedindex.add(x);
									usedindex.add(y);
									members.add(w[x]);
									members.add(w[y]);
									System.out.println("memberssisez"+members.size());
								}
							}
							
						}
						System.out.println(members.size()+"---"+teams);
					}
					System.out.println(minsuly+","+members);
					System.out.println(usedindex);
					if (members.size()/2==teams) ok=true;
					teams--;
					minsuly++;
					
				}
				result[i]=teams;
				}
			
			}
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();

	}

}
