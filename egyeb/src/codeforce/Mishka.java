package codeforce;

import java.util.Scanner;
public class Mishka {
	public static void main(String[] args) {
	Scanner t = new Scanner(System.in);
	int x=t.nextInt();
	int m=0;
	int c=0;
	int msz=0;
	int csz=0;
		for(int i=0; i<x; i++) {
			m=t.nextInt();
			c=t.nextInt();
			if(m>c) msz++;
			if(c>m) csz++;
			}
		if (msz>csz) System.out.append("Mishka");
		if (csz>msz) System.out.println("Chris");
		if (msz==csz) System.out.println("Friendship is magic!^^");
	

		}
			}

