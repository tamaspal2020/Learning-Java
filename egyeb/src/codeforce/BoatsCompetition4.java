package codeforce;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BoatsCompetition4 {

public static int maxTeams(int[] t , int n) {
	int max=0;
	LinkedList<Integer>usedindex=new LinkedList<>();
	for(int sulyosszeg=2;sulyosszeg<=100; sulyosszeg++) {
		usedindex.clear();
		int teams=0;
		for(int x=0; x<n-1;x++)
		{
			for(int y=x+1; y<n;y++)
			{
				if( !usedindex.contains(x) &&   !usedindex.contains(y) ) {
					if(t[x]+t[y]==sulyosszeg) {
						teams++;
						usedindex.add(x);
						usedindex.add(y);
						max = Math.max(max, teams);
						break;
					}
				}
			}
		}
	}
	return max;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();

		while(tc-- > 0) {
			int n=sc.nextInt();
			int[] tomb = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				tomb[i] = sc.nextInt();    
				max = Math.max(max, tomb[i]);///a legnagyobb elem
			}
			Arrays.sort(tomb);
			System.out.println(maxTeams(tomb,n));
		}
	}
}
		/*
		 * /*
		 * for(int i=0; i<tc; i++) {			
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
					w=new int[n];
					int maxsuly=0;
					int minsuly=51;
					for(int j=0;j<n;j++) {				
						w[j]=sc.nextInt();
						maxsuly=Math.max(maxsuly, w[j]);
						minsuly=Math.min(minsuly, w[j]);					
			}
			Arrays.sort(w);		
			maxsuly=maxsuly*2;			
			minsuly=minsuly*2;		

			int teams=0;
			int max=0;
			int s=minsuly;
			
		
			result[i]=m(s, maxsuly, n);
				}
			
			}
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}
	public static int m(int s, int maxsu, int n) {
		int v=0;
		int ret=0;
		while(s!=maxsu && v!=n/2){
			
			
			
			v=Math.max(countteams(s),v); 
			s++;
		}
		ret=v;
		return v;
	}
	public static int countteams(int n) {
		int teams=0;
		LinkedList<Integer>usedindex=new LinkedList<>();
		for(int x=0; x<w.length-1;x++)
		{
			for(int y=x+1; y<w.length;y++)
			{
				if( !usedindex.contains(x) &&   !usedindex.contains(y) ) {
					if(w[x]+w[y]==n) {
						teams++;
						usedindex.add(x);
						usedindex.add(y);
					}
				}
			}
		}
		return teams;
	}

}

		 * */
		 