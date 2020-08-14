package codeforce;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AD {
	 	public static void main(String[] args) {
	 		A a=new A();
	 		a.szamol(a);
	 		C c=new C();
	 		c.filebairo(a);
	 		System.out.print(a.l);
	 		
	 		
	 	}		
	 	
}
interface I1{
	int l=1500;
	void writeFriend();
}
interface I2 extends I1{
	void writeDanik();
}
interface I3 extends I2 {
	void writeAnton();
}
interface I4 extends I3, I2, I1{   

}


class A extends B implements I4{
	public void writeFriend() {
		System.out.println("Friendship");
		this.nev="Friendship";
	}
	public void writeDanik() {
		System.out.println("Danik");
		this.nev="Danik";
	}
	public void writeAnton() {
		System.out.println("Anton");
		this.nev="Anton";
	}
	public void szamol() {
		super.szamol(this);
		//System.out.println("név A ban"+this.nev);
	
	}
}


class B{
	public String nev;
	void szamol(I4 y) {
	Scanner stdin = new Scanner(System.in);
	int m=stdin.nextInt();
	String s=stdin.next();
	int sum=0;
	int h=0;
	if(s.length()%2==0) {
		h=s.length()/2;
		}
	else {
		h=(s.length()+1)/2;
	}
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='A')sum++;
	}
	if (s.length()%2==0) {
		if(sum==h) { 
			y.writeFriend();}
		else {
			if(sum>h) {
				y.writeAnton();
			}
			else {
				y.writeDanik();
			}
		}
	}
	if (s.length()%2!=0) {
		if(sum>=h) { 
			y.writeAnton();}
		else {
			
			y.writeDanik();
			}		
}
	stdin.close();
}
}

class C{
	public void filebairo(A a) {
		System.out.println(a.nev);
		String s=a.nev;
		RandomAccessFile raf=null;
		try {
		raf=new RandomAccessFile("forrasok/nev.txt","rw");
		System.out.println("okkkk");
		for( int i=0; i<s.length(); i++ )
		  {
		    raf.writeBytes(Character.toString(s.charAt(i)));
		  }
		}
		 
		catch (IOException e) {
			e.getMessage();
			
		}
		
		
	}
	
}

