package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class N {
	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	        
	        int b=Integer.parseInt(x.readLine());
	        int g=Integer.parseInt(x.readLine());
	        int n=Integer.parseInt(x.readLine());
	        System.out.println((b>n&&g>n)?n+1:(b==n&&g==n)||(b<=n&&g>=n)?b+1:(b<n&&g<n)?1+b+g-n:(g<=n&&b>=n)?g+1:0); 
	}
}