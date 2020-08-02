package oop;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class Palinka {
private int af;
private String gy;
private int m;
private int ev;
private int ar;
public Palinka(int af, String gy, int m, int ev,int ar) {
	setaf(af);
	setgy(gy);
	setm(m);
	setev(ev);
	setar(ar);
}
public void kivetel(String s) throws Exception{
	NullPointerException e=new NullPointerException(s);
	throw e;
}

public void setaf(int a){
	try 
	{
		if(a>30 && a<87) {
			this.af=a;
		}
	}
	catch(Exception e){
		System.out.println("30-87 k�z�tt legyen"+e.getMessage());
	}
}
public void setgy(String gy) {
	try { 
		if(gy!=null && gy.length()>3 && gy.length()<20)
			this.gy=gy;
	}
	catch(Exception e) {
		System.out.println("30-87 k�z�tt legyen"+e.getMessage());
	}	
}
public void setm(int m) {
	try{
		if (m>-1 && m<51) 	this.m=m;
	}
	catch(Exception e) {
		System.out.println("0-50 k�z�tt legyen"+e.getMessage());
	}
}
public void setev(int ev)  {
	try {
		if(ev>1999 && ev<Year.now().getValue()+1) 	this.ev=ev;
	}
	catch(Exception e) {
		System.out.println("2000 �s mostani �v k�z�tt lehet"+e.getMessage());
	}	
}
public void setar(int ar)  {
	try {
		if(ar>50 && ar<1000) 	this.ar=ar;
	}
	catch(Exception e) {
		System.out.println("50 �s 1000 k�z�tt lehet"+e.getMessage());
	}		

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Palinka> lista=new ArrayList<Palinka>();
		feltolt(lista);
		kiir(lista);
		Simulator(lista);
		//kiir(lista);
	}
public static void feltolt(ArrayList<Palinka> P) {
	Random rand=new Random();
	for (int i=0; i<20; i++) {
		int alk=rand.nextInt(56)+30;
		int me=rand.nextInt(48)+1;
		int kev=rand.nextInt(Year.now().getValue()-2000)+2000;
		int ara=rand.nextInt(950)+50;
		Palinka p=new Palinka(alk, veletlengyumolcs(), me, kev, ara);
		P.add(p);
		
	}
}
public static String veletlengyumolcs() {
	String gy=null;
	RandomAccessFile raf;
	
	int hossz=0;
	String sor=null;
	try {
	raf=new RandomAccessFile("forrasok/gyumolcs.txt", "r");
		for(sor=raf.readLine(); sor!=null; sor=raf.readLine())
		{
			hossz++;
		}
	}
	
	catch(IOException e) {
		e.getMessage();
	}
	try {
		raf=new RandomAccessFile("forrasok/gyumolcs.txt", "r");
		Random rand=new Random();
		int index=rand.nextInt(hossz-1);
			for(int i=0; i<index; i++)
			{
				gy=raf.readLine();
			}
		}
		catch(IOException e) {
			e.getMessage();
		}
	return gy;
}
public static void kiir(ArrayList<Palinka> P) {
	
	for (int i=0; i<P.size(); i++) {
System.out.println(i+".");
System.out.println("alkoholfok:"+ P.get(i).af);
System.out.println("gy�m�lcs: "+P.get(i).gy);
System.out.println("mennyiseg: "+P.get(i).m);
System.out.println("k�sz�t�s �ve: "+P.get(i).ev);
System.out.println("�r: "+P.get(i).ar);
System.out.println("----------------");
		
	}
}
public static int sumpal(ArrayList<Palinka> P) {
	int sum=0;
for(int i=0; i<P.size(); i++) {
		sum+=P.get(i).m;
	}
	return sum;
}
public static void Simulator(ArrayList<Palinka> P) {
	Random r=new Random();
	int index=0;
	int mennyiseg=0;
	int osszbevetel=0;
	double liter=0;
	System.out.println("Az �sszes p�linka mennyis�ge: "+sumpal(P));
	for(int i=0; i<20; i++) {
		index=r.nextInt(P.size());
		System.out.println(index+". : "+P.get(index).m+"deciliter");
		mennyiseg=r.nextInt(20);
		
		if(mennyiseg<=P.get(index).m) {
			P.get(index).m-=mennyiseg;
			System.out.println("A fogyasztott mennyis�g: "+mennyiseg);
			System.out.println("Az ital �ra(Ft/deciliter) "+P.get(index).ar);
			osszbevetel+=mennyiseg*P.get(index).ar;
		}
		else {
			System.out.println("T�bbet nem lehet inni, mint amennyi van");
		}
		System.out.println("A "+index+". p�linka �j mennyis�ge: "+P.get(index).m+"deciliter");
		System.out.println("Az �sszes p�linka mennyis�ge most: "+sumpal(P)+"deciliter ("+(Double.parseDouble(String.valueOf(sumpal(P)))/10)+"liter)");
		
		System.out.println("Az �sszes bev�tel"+osszbevetel);
	}
}
}