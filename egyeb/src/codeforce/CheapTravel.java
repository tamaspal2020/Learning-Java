package codeforce;
import java.util.Scanner;
public class CheapTravel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int m=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		if(b/m>=a) {
			System.out.println(n*a);			
		}
		else {		
			if(n<m) {				
				if(b<n*a) sum=b;
				if (b>=n*a) sum=a;
			}
			if(n>=m) {			
				sum=(n/m)*b;	System.out.println(1);			
				if(n%m!=0) {
					int maradek=n%m;				
					if(b<a) { sum+=b; System.out.println(1);	}
					if (b>=a) { sum+=a*maradek; System.out.println(1);	}
				}	
			}
			System.out.println(sum);
		}	
		sc.close();		
	}
}

