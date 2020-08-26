package codeforce;
import java.util.Scanner;
public class SystemAdministrator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int suma=0;
		int sumb=0;
		for(int i=0; i<n; i++) {
			int t=sc.nextInt();
			if(t==1) {
				suma+=sc.nextInt();
				suma-=sc.nextInt();
			}
			if(t==2) {
				sumb+=sc.nextInt();
				sumb-=sc.nextInt();
			}
		}
		System.out.println((suma>=0)?"LIVE":"DEAD");
		System.out.println((sumb>=0)?"LIVE":"DEAD");
	}
}
