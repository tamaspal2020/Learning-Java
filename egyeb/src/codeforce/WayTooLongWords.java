package codeforce;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class WayTooLongWords {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		Scanner t = new Scanner(System.in);
		int x=t.nextInt();
		for(int i=0; i<x+1; i++) {
			String s=t.nextLine();
			int y=s.length();
			if(y>10) {
				s=String.valueOf(s.charAt(0))+String.valueOf(s.length()-2)+String.valueOf(s.charAt(s.length()-1));
				l.add(s);
			}
			if(y<=10) l.add(s);
		}
		for(int i=0; i<x+1; i++) {
			System.out.println(l.get(i));
		}
	}
}
