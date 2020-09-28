package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Draw3 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
	    z.readLine();
		int c=1;
		int n=0;
		int m=0;
		String s;
		for (byte q=0;(s=z.readLine())!=null;q++) {	
			 StringTokenizer r = new StringTokenizer(s);
			 int a=Integer.parseInt(r.nextToken());
			 int b=Integer.parseInt(r.nextToken());
			 c+=Math.max((Math.min(Math.abs(n-m),1)+Math.min(a,b)-Math.max(n, m)), 0);
			 n=a;
			 m=b;			
		}
		System.out.println(c);	
		System.out.println(c+2);
		
	}
}
