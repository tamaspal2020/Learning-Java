package codeforce;


import java.util.Scanner;

public class Draw2 {
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int c=1;
		int l=0;
		int n=0;
		int m=0;
		for (int i=0;i<t;i++){
			int a=s.nextInt();
			int b=s.nextInt();
			int o=(l==0)?0:1;
			c=l<=0?a<=b?c+o*1+a-n:b>=n?c+o*1+b-n:c:l>0?b<=a?c+1+b-m:a>=m?c+1+a-m:c:0;					
			l=b-a;
			n=a;
			m=b;	
			
		}
		System.out.println(c);
	
	}
}

