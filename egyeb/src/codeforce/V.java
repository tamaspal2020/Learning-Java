package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class V {
	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	        
	        int b=Integer.parseInt(x.readLine());
	        int g=Integer.parseInt(x.readLine());
	        int n=Integer.parseInt(x.readLine());
	        int sum=0;
	        if(b<=n && g>=n) {
	        	sum=b+1;
	        }
	        if(g<=n && b>=n) {
	        	sum=g+1;	        	
	        }	       
	        if(b<n && g<n && b!=g) {	        
	        	sum=g+b-n+1;
	        }	       
	        if(b>n && g>n) sum=n+1; 	        
	        if(b==n && g==n) sum=b+1;
	        if(b<n && g<n && b==g && n%2==0) sum=1+(b-(n/2))*2;
	        if(b<n && g<n && b==g && n%2==1) sum=(b-(n/2))*2;
	        System.out.println(sum);
	}
}
