package proj1;
import java.util.Scanner;
public class Chips {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int last=0;
		while(m>=0) {
			for(int i=1; i<n+1; i++) {
				
				if(m>0 && (m-i)<0) 
				{
					last=m;
				}
				
				m=m-i;
				
				
			}
		}
		if(m==0) {
			System.out.println(0);
		}
		if(m<0) {
			System.out.println(last);
		}
	}

}
