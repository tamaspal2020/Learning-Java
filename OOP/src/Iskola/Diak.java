package Iskola;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class Diak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	}
private int kor;
private String szak; /// enum
private String neve;
private double tatlag;
private ArrayList<String> felvetttargyak;
private static RandomAccessFile raf;
private static Random rand=new Random();

public Diak(String nev, int kor, String szak, double atlag) {
	setkor(kor);
	setnev(nev);
	setatlag(atlag);
	setszak();
		
}

public Diak(String nev, int kora, String szak, double atlag, String targy1, String targy2) {
	setkor(kor);
	setnev(nev);
	setatlag(atlag);
	setszak();
	settargy(targy1);
	settargy(targy2);
	
}
public Diak(String nev, int kor, String szak, double atlag, String targy1) {
	setkor(kor);
	setnev(nev);
	setatlag(atlag);
	setszak();
	settargy(targy1);
}
public Diak(String nev, String szak) {
	
}



public void settargy(String targy) {
/*try {
		int x=rand.nextInt(sorokszamaszovegfileban("forrasok/targyak.txt"));
		String sor=null;
		raf=new RandomAccessFile("forrasok/targyak.txt", "r");
		for(int i=0; i<x; i++) {
			sor=raf.readLine();
		}
		this.felvetttargyak.add(sor);
	}
	catch(IOException e) {
		e.getMessage();	
}*/
	this.felvetttargyak.add(targy);
}

public void setkor(int kor) {
try {
	if (kor>18 || kor<60) {
		this.kor=kor;
	}  
	}
	catch(Exception e){
		System.out.println("Az életkor 18-60"+e.getMessage());
	}
}

public void setnev(String nev) {
try {
	if (nev.length()>3 || nev.length()<50) {
		this.neve=nev;
	}  
}
catch(Exception e){
	System.out.println("A név 3-50"+e.getMessage());
}
}

public void setatlag(double atlag) {
try {
	if (atlag>1 || atlag<5) {
		this.tatlag=atlag;
	}  
}
catch(Exception e){
	System.out.println("Átlag 1-5"+e.getMessage());
}
}

public void setszak() {
try {
		int x=rand.nextInt(sorokszamaszovegfileban("forrasok/szakok.txt"));
		String sor=null;
		raf=new RandomAccessFile("forrasok/szakok.txt", "r");
		for(int i=0; i<x; i++) {
			sor=raf.readLine();
		}
		this.szak=sor;
	}
	catch(IOException e) {
		e.getMessage();	
}
}

public int getkor() {
	return this.kor;
}
public String getszak() {
	return this.szak;
}
public String getneve() {
	return this.neve;
}

public double gettatlag () {
	return this.tatlag;
}
public ArrayList<String> getfelvetttargyak() {
	return this.felvetttargyak;
}
public static int sorokszamaszovegfileban(String filenev) {
	int szam=0;
	try {
		
		String sor;
		raf=new RandomAccessFile(filenev, "r");
		sor=raf.readLine();
		System.out.println("ok");
		while(sor!=null) {
			szam++;
			sor=raf.readLine();
		}
	}
	catch(IOException e) {
		e.getMessage();
	}
	return szam; 
}
}

