package codeforce;
import java.util.Scanner;
public class insomnia
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    int k=sc.nextInt();
		    int l=sc.nextInt();
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		int sum=0;
		if(k<d || l<d || m<d || n<d || (k==l && l==m && m==n)) {
		for (int j=1;j<=d;j++){
		    if (j%k==0) {
		        sum++;
		    }
		    else
		    {
		        if(j%l==0 && l!=k){
		            sum++;
		        }
		        else {
		             if(j%m==0 && m!=k && m!=l){
		            sum++;
		        }
		        else {
		             
		             if(j%n==0 && n!=m && n!=l && n!=k){
		            sum++;
		        }
		        }
		    }
		}
	
		
	}
		}
		System.out.println(sum);
	}
}
