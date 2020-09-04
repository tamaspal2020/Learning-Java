package codeforce;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BoatsCompetition2 {
/// Map<Integer, HashSet<Integer>> possibleteams =new HashMap<>();    ///  key weight  (from sum(two smallest), sum(two biggest) 
	///value: if(hashset !contains a b and a+b weight = key then put int hashset)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int[] result=new int[tc];
		Map<Integer, HashSet<Integer>> possibleteams =new HashMap<>();
		LinkedList<Integer> sulyok=new LinkedList<>();
		
		
		for(int i=0; i<tc; i++) {
			sulyok.clear();	
			possibleteams.clear();
			int n=sc.nextInt();
			if(n==1 ) {
				System.out.println(1);
			}
			else {
			for(int j=0;j<n;j++) {
				sulyok.add(sc.nextInt());
			}
		
			Collections.sort(sulyok);
			int smallestweight=sulyok.get(0)+sulyok.get(1);
			int biggestweight=sulyok.get(sulyok.size()-1)+sulyok.get(sulyok.size()-2);			
			System.out.println(smallestweight+"+"+biggestweight);
			for(int w=smallestweight; w<=biggestweight; w++) {
				possibleteams.put(w, pairswithWweight(w,sulyok));
			}
		}
			
		}
		System.out.println(possibleteams);
	}

	public static HashSet<Integer> pairswithWweight(int w, LinkedList<Integer> sortedl) {
		HashSet<Integer> teams=new HashSet<Integer>();
		for(int i=0; i<sortedl.size()-1; i++) {
			for(int j=i+1; j<sortedl.size(); j++) {
				if( (sortedl.get(i)+sortedl.get(j))==w ) {
					if( !(teams.contains(sortedl.get(i)))  &&   !(teams.contains(sortedl.get(i)))    )
							{
						teams.add(sortedl.get(i));
						teams.add(sortedl.get(j));
							}
				}
			}
		}
		return teams;
	}

	}


