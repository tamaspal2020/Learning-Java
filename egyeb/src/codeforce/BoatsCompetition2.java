package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BoatsCompetition2 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int[] result=new int[tc];
		Map<Integer, LinkedList<Integer>> possibleteams =new HashMap<>();
		LinkedList<Integer> sulyok=new LinkedList<>();	
		for(int i=0; i<tc; i++) {
			sulyok.clear();	
			possibleteams.clear();
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
			for(int j=0;j<n;j++) {
				sulyok.add(sc.nextInt());
			}	
					
			Collections.sort(sulyok);
			int smallestweight=sulyok.get(0)+sulyok.get(1);
			int biggestweight=sulyok.get(sulyok.size()-1)+sulyok.get(sulyok.size()-2);			
			for(int w=smallestweight; w<=biggestweight; w++) {
				possibleteams.put(w, pairswithWweight(w,sulyok));
			}
			result[i]=searchTheLongestArrayListinMap(possibleteams);
		}
			
			}
			
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}

	public static LinkedList<Integer> pairswithWweight(int w, LinkedList<Integer> sortedl) {
		HashSet<Integer> indexes=new HashSet<Integer>();
		LinkedList<Integer> members=new LinkedList<>();
		for(int i=0; i<sortedl.size()-1; i++) {
			for(int j=i+1; j<sortedl.size(); j++) {
				if( (sortedl.get(i)+sortedl.get(j))==w ) {
					if( !(indexes.contains(i))  &&   !(indexes.contains(j))    )
							{
						members.add(sortedl.get(i));
						members.add(sortedl.get(j));
						indexes.add(i);
						indexes.add(j);
							}
				}
			}
		}
		return members;
	}
	public static int searchTheLongestArrayListinMap(Map<Integer, LinkedList<Integer>> m) {
		int max=0;
		for(Integer i: m.keySet()) {
			int meret=m.get(i).size();
			if(meret>max) {
				max=meret;
			}
		}
		return max/2;
	}
	}


