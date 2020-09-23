package codeforce;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	public class Tokens {
		public static void main(String[] args) throws NumberFormatException, IOException  {
			BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(z.readLine());
			int c=1;
			int n=0;
			int m=0;
			String s = z.readLine();
			StringTokenizer r = new StringTokenizer(s);
			while(r!=null ||r.hasMoreTokens()) {	        
				 int a=Integer.parseInt(r.nextToken());
				 int b=Integer.parseInt(r.nextToken());
				System.out.println("a:"+a+"b:"+b);
				n=a;
				m=b;
				r=new StringTokenizer(z.readLine());
			}
			System.out.println(c);	
		}
	}