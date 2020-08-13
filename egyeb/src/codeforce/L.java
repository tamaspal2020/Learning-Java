package codeforce;

import java.util.*;
public final class L
{
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int n=br.nextInt();
		int M=0,C=0;
		for(int i=0;i<n;i++)
		{
			int m=br.nextInt();
			int c=br.nextInt();
			if(m>c)
				M++;
			if(c>m)
				C++;
 
		}
		if(M==C)
		System.out.print("Friendship is magic!^^");
		else
			System.out.print(M>C?"Mishka":"Chris");
 
	}
}