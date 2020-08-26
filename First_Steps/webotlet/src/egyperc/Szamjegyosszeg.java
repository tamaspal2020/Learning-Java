package egyperc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Random;

public class Szamjegyosszeg {
public static int szam;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		szam=r.nextInt(1000000);
		System.out.println(szam);
		filebair(szam);
		kiszamol();
	}
	public static void kiszamol() {
		int szam2=0;
		try {
		RandomAccessFile elsosor=new RandomAccessFile("forrasok/szamjegyosszeg.txt","r");
		elsosor.seek(0);
		String es=elsosor.readLine();
		
		szam2=Integer.parseInt(es);
		elsosor.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
		while(szam2>=10) {
			int osszeg=0;
			int ujszam=szam2;
			while(ujszam>=10) {
				osszeg+=ujszam%10;
				ujszam=(ujszam-(ujszam%10))/10;
			}
			osszeg+=ujszam;
			szam2=osszeg;
			try {
				RandomAccessFile r=new  RandomAccessFile("forrasok/szamjegyosszeg.txt","rw");
				r.seek( r.length() );     /// file végére ugrás
				r.writeBytes(String.valueOf(szam2)+"\n");
				r.close();
				}
				catch(IOException e) {
					e.getMessage();
				}
			System.out.println(szam2);
		}
	}
	public static void filebair(int  n) {
		try {
			filetorlo();
		RandomAccessFile r;
		r=new  RandomAccessFile("forrasok/szamjegyosszeg.txt","rw");
		r.writeBytes(String.valueOf(n)+"\n");
		r.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
public static void filetorlo() {
		
		PrintWriter p;
		File file = new File("forrasok/szamjegyosszeg.txt");
		try {
			p= new PrintWriter(file);
			p.close();
			}
		
		catch(IOException e) {
			e.getMessage();
		}
	}

}
