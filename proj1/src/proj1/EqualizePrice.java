package proj1;

import java.util.Random;
import java.util.Scanner;

public class EqualizePrice {
public static Random rand=new Random();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0; i<n; i++) {
			int q=sc.nextInt();
			int k=sc.nextInt();
			int min=-1;
			int max=100000001;
			for (int j=0; j<q; j++) {
				int a=sc.nextInt();
				if(a>min) {
					min=a;
				}
				if(a<max) {
					max=a;
				}
			}
			if ((max-min)<=k*2) {
				System.out.println((min+k));
			}
			if ((max-min)>k) {
				System.out.println(-1);
			}
			
		}

	}

}
