package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class AaD {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String[] y=x.readLine().split(" ");
        int k2=Integer.parseInt(y[0]);
        int k3=Integer.parseInt(y[1]);
        int k5=Integer.parseInt(y[2]);
        int k6=Integer.parseInt(y[3]);
        int sum=Math.min(k6,Math.min(k2,k5))*256 +Math.min(k3, k2-Math.min(k6,Math.min(k2,k5)))*32;
        System.out.println(sum);
	}
}
