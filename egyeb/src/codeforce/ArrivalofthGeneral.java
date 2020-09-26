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
		for(int i=0;i<t;i++) {
			a=s.nextInt();
			if (a<min) {minindex=i;
			}
		
		}
		System.out.println(a);

}
}
