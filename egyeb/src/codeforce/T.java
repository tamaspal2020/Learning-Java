package codeforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class T {
	public static void main(String[] args) throws IOException {		
		    BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
	        String[] y=x.readLine().split(" ");
	        int n=Integer.parseInt(y[0]);
	        int m=Integer.parseInt(y[1]);
	        int a=Integer.parseInt(y[2]);
	        int b=Integer.parseInt(y[3]);					
	        System.out.print((b/m>=a)?n*a:n<m?(b<n*a?b:a):n%m!=0?(b<a?(n/m)*b+b:(n/m)*b+a*(n%m)):(n/m)*b);   //nested ternary operators
	}
}
