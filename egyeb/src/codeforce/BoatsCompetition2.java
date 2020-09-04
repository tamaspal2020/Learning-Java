package codeforce;

import java.util.LinkedList;
import java.util.Scanner;

public class BoatsCompetition2 {
/// Map<Integer, HashSet<Integer>> possibleteams =new HashMap<>();    ///  key weight  (from sum(two smallest), sum(two biggest) 
	///value: if(hashset !contains a b and a+b weight = key then put int hashset)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int[] result=new int[tc];
		LinkedList<Integer> sulyok=new LinkedList<>();
		for(int i=0; i<tc; i++) {
			sulyok.clear();		
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				sulyok.add(sc.nextInt());
			}
			
		}
	}

	}


