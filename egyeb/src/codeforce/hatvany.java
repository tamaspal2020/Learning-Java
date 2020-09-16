package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hatvany {
	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	        
	        int b=Integer.parseInt(x.readLine());
	        int g=Integer.parseInt(x.readLine());
	        int n=Integer.parseInt(x.readLine());
	        int y=b+g-n;
	        System.out.println (      		(b>n && g>n) ? n+1 :
	        		((b==n && g==n)|| (b<=n && g>=n)) ? b+1 :
	        		(b<n && g<n && b==g && n%2==0) || ((b<n && g<n && b!=g) ) ? y+1 :
	        		(b<n && g<n && b==g && n%2==1) ? y :	        		
	        		(g<=n && b>=n) ? g+1 : 0	    
	        		);
 
	}
}