package codeforce;

import java.util.Scanner;
public class AS {
	public static void main(String[] args) {
		 Scanner x=new Scanner(System.in);	        
	        int b=x.nextInt();
	        int c=x.nextInt();
	        int d=x.nextInt();
	        System.out.println((b>d&&c>d)?d+1:(b==d&&c==d)||(b<=d&&c>=d)?b+1:(b<d&&c<d)?1+b+c-d:(c<=d&&b>=d)?c+1:0); 
	}
}