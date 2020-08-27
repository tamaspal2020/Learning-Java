package codeforce;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Squares {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer> alist=new LinkedList<>();
		for(int i=0; i<n; i++) {
			int m=sc.nextInt();
			alist.add(m);
		}		
		sc.close();
		Collections.sort(alist);
		System.out.println(  (k>n) ? -1: alist.get(alist.size()-k)+" "+0);		
}
}


