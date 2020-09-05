package codeforce;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BoatCompetition3 {

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
public static int maxTeams(int[] t , int n) {
		int max=0;
		
		for(int sulyosszeg=2;sulyosszeg<=100; sulyosszeg++) {
		
			boolean[] indexes= new boolean[n+1];
			int teams=0;
			for(int x=0; x<n-1;x++)
			{
				for(int y=x+1; y<n;y++)
				{
					if(indexes[y]) {
						continue;
					}
					if(indexes[x]) {
						break;
					}
						
						if(t[x]+t[y]==sulyosszeg) {
							teams++;
							indexes[x]=true;
							indexes[y]=true;
							max = Math.max(max, teams);
							break;
						}
					}
				}
			}
		
		return max;
	}
}
