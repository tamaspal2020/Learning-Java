package codeforce;


import java.util.Scanner;
public class DiagonalWalking {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[] s=sc.next().toCharArray();	
	int x=n;
	for(int i=0; i<n-1; i++) {
		if (s[i]!=s[i+1]) {
			x--;
			i++;		
		}
	}
	System.out.println(x);
}
}