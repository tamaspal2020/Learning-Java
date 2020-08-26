package codeforce;

import java.util.Scanner;
public class DiagonalWalking {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[] s=sc.next().toCharArray();	
	for(int i=0; i<n-1; i++) {
		if (s[i]!=s[i+1]) {
			n--;
		}
	}
	System.out.println(n+1);  ///456345634563543453453
}
}


/*
 * fsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgsklfsidfhsdfkjghslkdfjghls
 * sdfksgjdlfksgjf
 * skdfjhgskl
 * */
 */