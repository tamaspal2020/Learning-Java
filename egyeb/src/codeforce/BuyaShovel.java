package codeforce;
import java.util.Scanner;
public class BuyaShovel{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		if(k<r && r%k==0) {System.out.println(r/k); }
		else
		{
		if (k==r || k==10) {System.out.println(1); }
		else {
		if(k<10 || k>10){
			int sum=10;
			int n=1 ;
		while(((sum+r)%k)!=0 && sum!=k*10 && sum%k!=0){
			sum+=10;
		}
			if(sum==k*10) System.out.println(10);
			if (sum!=k*10) System.out.println((sum+r)/k);
		}
		}}
}
}
