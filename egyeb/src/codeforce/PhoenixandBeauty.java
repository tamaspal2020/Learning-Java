package codeforce;
import java.util.ArrayList;
import 	java.util.Scanner;

public class PhoenixandBeauty {
	public static void main(String[] args)  {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			int n=sc.nextInt();
			int k=sc.nextInt();
			for(int i=0; i<n;i++) {
				ArrayList<Integer> a=new ArrayList<>();
				for(int j=0; j<n;j++) {
					a.add(sc.nextInt());
				}				
			} 		
	}
	public static  boolean b(ArrayList<Integer> a, int k) {
		int m=0;
		for(int i=0; i<k; i++) {
			m+=a.get(i);
		}
		System.out.println(m);
		for(int i=1; i<a.size()-k+1; i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				sum+=a.get(j);
			}
			System.out.println(sum);
			if(sum!=m) {
				return false;
			}			
		}
		return true;
	}
}
