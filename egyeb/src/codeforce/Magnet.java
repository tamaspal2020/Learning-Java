package codeforce;
import java.io.BufferedInputStream;
import java.util.Scanner;
public class Magnet {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		int n=stdin.nextInt();
		int g=1;
		String first="xx";
		String d="xx";
		for(int i=0;i<n;i++) {        	        	
        		d=stdin.next();
        		if(first.charAt(first.length()-1)==(d.charAt(0)))	g++;
        		first=d;
        	}        
        System.out.println(g);				
	}
}
