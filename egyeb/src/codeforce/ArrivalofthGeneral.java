package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;

public class ArrivalofthGeneral {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		int a=0;
		int min=100;
		int minindex=0;
		int maxindex=0;
		int max =0;
		int c=0;
		int tavbal=0;
		int tavjobb=0;
		for(int i=0;i<t;i++) {
			a=s.nextInt();
			tavbal=i;
			tavjobb=t-i-1;
			if (a<min) {
				minindex=i;
				min=a;
			}
			if(a==min) {
				if (tavjobb<minindex) {
					minindex=t-tavjobb-1;
					
				}
			}
			if (a>max) {
				maxindex=i;
				max=a;
			}
			if(a==max) {
				if(tavjobb<maxindex) {
					maxindex=t-tavjobb-1;
				}
			}
			System.out.println(min+","+minindex);
		}
		if (minindex<maxindex) {
			c+=minindex-1+(t-maxindex);
		}
		if (minindex<maxindex) {
			c+=minindex-1+(t-maxindex);
		}
		if (minindex==maxindex) {
			c=0;
		}
	}
}
