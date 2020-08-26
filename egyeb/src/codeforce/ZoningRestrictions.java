package codeforce;
import java.util.Scanner;
public class ZoningRestrictions {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int h=sc.nextInt();
	int m=sc.nextInt();
	int[] heights=new int[n];
	for (int i=0; i<n; i++) {
		heights[i]=-1;			
		}

	for (int i=0; i<m; i++) {
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();	
		for (int j=l-1; j<=(r-1); j++) {
			if(heights[j]!=-1) {
				if(heights[j]<=x) {}
				if(heights[j]>x) {heights[j]=x;}
			}
			if(heights[j]==-1) {
				heights[j]=x;
			}
				
			}
		
		}
	int sum=0;
	for (int i=0; i<n; i++) {
		if(heights[i]==-1) {
			heights[i]=h;
		}	
		
		}
	for (int i=0; i<n; i++) {
		sum+=heights[i]*heights[i];			
		}
	System.out.println(sum);
	}
	
}
