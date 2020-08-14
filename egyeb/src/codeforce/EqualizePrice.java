package codeforce;

import java.util.Random;
import java.util.Scanner;
public class EqualizePrice {
public static Random rand=new Random();
	public static void main(String[] args) {
		int[] ar;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ar=new int[n];
		for (int i=0; i<n; i++) {
			int q=sc.nextInt();
			int k=sc.nextInt();
			int first=sc.nextInt();
			int min=first;
			int max=first;
			for (int j=0; j<q-1; j++) {
				int a=sc.nextInt();
				if(a<min) {
					min=a;
				}
				if(a>max) {
					max=a;
				}
			}
			if ((max-min)<=k*2) {
				ar[i]=min+k;
			}
			if ((max-min)>k*2) {
				ar[i]=-1;
			}			
		}
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}