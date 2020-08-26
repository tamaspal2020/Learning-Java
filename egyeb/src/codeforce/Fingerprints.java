package codeforce;
import java.util.Scanner;
public class Fingerprints {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int[] l=new int[n];
	int[] l2=new int[m];
	for(int i=0; i<l.length; i++) {
			l[i]=s.nextInt();
	}
	for(int i=0; i<l2.length; i++) {
		l2[i]=s.nextInt();
	}
	String sz="";
	for(int i=0; i<l.length; i++) {
		for(int j=0; j<l2.length; j++) {
			if(l[i]==l2[j]) {
				sz=String.valueOf(l[i]);
				System.out.print(sz+" ");
			}
		}
	}
	
}
}
