package codeforce;

import java.util.Scanner;

public class Draw {
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int count=1;
		int l=0;
		int e=0;
		int ea=0;
		int eb=0;
		for (int i=0;i<t;i++){
			int a=s.nextInt();
			int b=s.nextInt();	
		
			count=(l<0)?(a<b)?(count+1+(a-ea)):(a==b)?count+1+(a-ea):(b>=ea)?count+1+b-ea:count:
			(l>0)?(b<a)?(count+1+(b-eb)):(a==b)?count+1+(b-eb):(a>=eb)?count+1+a-eb:count:
				(i==0)?Math.min(a, b)+1:(a==b)?count+(a-ea):(a>b)?count+(b-eb):count+(a-ea);  //ha az elozo egyenlo volt sor
			l=b-a;
			e=(l==0)?a:0;
			ea=a;
			eb=b;					
		}
		System.out.println(count);
	
	}
}

