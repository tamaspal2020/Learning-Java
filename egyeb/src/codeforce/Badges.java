package codeforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Badges {
	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	        
	        int b=Integer.parseInt(x.readLine());
	        int g=Integer.parseInt(x.readLine());
	        int n=Integer.parseInt(x.readLine());
	        int sum=0;
	        int a=0;
	        int l=0;
	        if(b<=n && g>=n) {
	        	a=n-b;
	        }
	        if(g<=n && b>=n) {
	        	a=n-g;
	        	
	        }	       
	        if(b<n && g<n && b!=g) {
	        	if (b<g) {
	        		a=n-g;
	        		l=n-b;
	        	}
	        	if (g<b) {
	        		a=n-b;
	        		l=n-g;
	        	}
	        }
	        for(int i=0; i<n+1; i++){        	
	        	if(b<=n && g>=n) {	   
	        		if(i>=a) {
	        			sum++;
	        		}
	        	}
	        	if(g<=n && b>=n) {	   
	        			
	        		if(i>=a) {
	        			
	        			sum++;
	        			
	        		}
	        	}
	        	if(b<n && g<n && b!=g) {
	        	
		        		if(i>=a && (n-i)>=l) {
		        			sum++;		        			
		        		}	        	
	        	}
	        }
	        if(b>n && g>n) sum=n+1; 	        
	        if(b==n && g==n) sum=b+1;
	        if(b<n && g<n && b==g && n%2==0) sum=1+(b-(n/2))*2;
	        if(b<n && g<n && b==g && n%2==1) sum=(b-(n/2))*2;
	        System.out.println(sum);
	}
}
