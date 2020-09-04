package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BoatsCompetition {
public static void o(Object o) {System.out.println(o);}
	public static void main(String[] args) throws IOException {
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
			fillresult(sulyok);
		}
	}
	public static void fillresult(LinkedList<Integer> sulyok) {
		LinkedList<Integer> s=new LinkedList<>();
		for(int i=0; i<sulyok.size()-1; i++)
		{
			for(int j=i+1; j<sulyok.size(); j++)
			{
				int e=sulyok.get(i)+sulyok.get(j);	
				s.add(e);			
			}			
		}
		
		o(s);
		maxeq(s);
	}
	public static void maxeq(LinkedList<Integer>  s) {
		LinkedList<Integer> sortedlist=s;
		Collections.sort(sortedlist);
		o(sortedlist);
		int sumindex=1;
		ArrayList<Integer> sums=new ArrayList<>();
		for(int i=0; i<sortedlist.size()-1; i++) {
			if(sortedlist.get(i)!=sortedlist.get(i+1))
			{
				sums.add(sumindex);
				sumindex=1;
				if(i==sortedlist.size()-2) {
					
					sums.add(1);
				}
			}
			else {
				sumindex++;
				if(i==sortedlist.size()-2) {
					System.out.println("sdfgs");
					sums.add(sumindex);
					///sums.set(sums.size()-1,  sums.get(sums.size()-1)+1);
				}
			}
		}
		o(sums);
	}
}


