package codeforce;
import java.util.Scanner;
public class Equality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		//sc.close();
		//Scanner sc2=new Scanner(System.in);
		String s=sc.next();
		int[] sums=new int[k];
		for(int i=0; i<k; i++) {
			char c=Character.toUpperCase(alphabet[i]);	
			int sum=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)==c) {
					sum++;
				}
				sums[i]=sum;
			}
		}
		GenNum<Integer> g=new GenNum<>();
		g.szam=n+1;
		int min=g.szam;		
		for(int i=0; i<sums.length; i++) {
			if(sums[i]<min) {
				min=sums[i];
			}			
		}
		if(min==0) {
			System.out.println(0);
		}
		if(min>0) {
			System.out.println(min*k);
		}
	}
}
class GenNum<T>{
	public T szam; 
}
