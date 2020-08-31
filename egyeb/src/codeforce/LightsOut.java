package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class LightsOut {
	public static List<Integer> lista=new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			String s=br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			 while (st.hasMoreTokens()) {
		         lista.add(Integer.valueOf(st.nextToken()));
		     }
		}
		kiir(paros(0));
		kiir(paros(1));
		kiir(paros(2));
		System.out.println();
		kiir(paros(3));
		kiir(paros(4));
		kiir(paros(5));
		System.out.println();
		kiir(paros(6));
		kiir(paros(7));
		kiir(paros(8));		
	}
	public static boolean paros(int e) {
		int sum=0;
		List<Integer> l=szomszedos(e);
		for(int i=0; i< l.size(); i++) {
			sum+= lista.get(l.get(i)); 
			}
		return (sum%2==0) ? true : false;
	}
	public static List<Integer> szomszedos(int i) {
		if(i==0)  return Arrays.asList(0,1,3);
		if(i==1)  return Arrays.asList(1,0,2,4);
		if(i==2)  return Arrays.asList(2,1,5);
		if(i==3)  return Arrays.asList(0,3,4,6);
		if(i==4)  return Arrays.asList(1,3,4,5,7);
		if(i==5)  return Arrays.asList(2,4,5,8);
		if(i==6)  return Arrays.asList(3,6,7);
		if(i==7)  return Arrays.asList(7,6,4,8);
		if(i==8)  return Arrays.asList(8,7,5);
		return Arrays.asList(1,2);
	}
	public static void kiir(boolean b) {
		System.out.print(b ?  1 : 0);		
	}
}
