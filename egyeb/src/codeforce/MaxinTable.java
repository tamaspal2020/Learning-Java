package codeforce;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxinTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0 ;i<n; i++) {

			for(int j=0 ;j<n; j++) {
			   if(i==0 || j==0) {
				   System.out.print(1+"\t");
				   list.add(j);
			   }
			   else {
				   b+=list.get(j)+list.get(j-1);
				   System.out.print(b+"\t");
				   list.set(j, b);
				   

			   }
			   
			}
			   System.out.println();

		}

	}

}
