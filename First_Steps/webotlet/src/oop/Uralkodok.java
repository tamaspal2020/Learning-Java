package oop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Uralkodok {
private int k;
private int h;
private int e;

public Uralkodok(int k, int h, int e) {
	this.k=k;
	this.h=h;
	this.e=e;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Uralkodok> L=new ArrayList<Uralkodok>();
		feltolt(L);
		kiir(L);
		Vizsgalat(L);
		}
public static void feltolt(ArrayList<Uralkodok> U) {
	for (int i=0;i<30; i++)
	{
	
		Random rand=new Random();
		 int k=rand.nextInt(1900);
		 int h=rand.nextInt(60);
		 int e=rand.nextInt(10);
		 Uralkodok u=new Uralkodok(k, h, e);
		 U.add(u);
		 
	}
}	
public static void kiir(ArrayList<Uralkodok> U) {
	for (int i=0;i<U.size(); i++)
	{
		System.out.println((i+1)+".\t Uralkodo ("+U.get(i).k+"-"+(U.get(i).k+U.get(i).h)+")\t"+U.get(i).h+"év,\t  elégedettség: "+U.get(i).e);
	}
}	
	
public static boolean atfedes(Uralkodok u1,Uralkodok u2) {
	boolean atfed=false;
		if (  (u1.k>u2.k && u1.k<u2.k+u2.h)  ||
				((u1.k+u1.h)>u2.k && (u1.k+u1.h)<(u2.k+u2.h) ))
			return atfed=true;
	return atfed;
}
public static void Vizsgalat(ArrayList<Uralkodok> U) {
	for (int i=0; i<U.size()-1; i++) {
		for (int j=i+1; j<U.size(); j++) {
			Uralkodok u1=U.get(i);
			Uralkodok u2=U.get(j);
			if(atfedes(u1,u2)) {
				String atfedesek=((i+1)+". és "+(j+1)+".");
				System.out.println(atfedesek);
				FileOutputStream fout = null;
				try {
					fout=new FileOutputStream("forrasok/uralkodok.txt");
					fout.write(atfedesek.getBytes());
				}
				catch(IOException e) {
					e.getMessage();
				}
				
			}
		}
	}
}
}
