package codeforce;
import java.util.Scanner;
public class BuyaShovel{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		if(k<r) {
			if(r%k==0) System.out.println(r/k);
			if(r%k!=0) {	
				if(10%k==0) {System.out.println(10/k);}
				else {
					int x=k; int y=1;
					while(x%10!=0 && (x+r)%k!=0) {
						x+=k; y++;
					}
					System.out.println(y);
				}
			
				
			}
			}
	}
}
