package egyperc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Random;

public class Lnreszosszeg {
public static int tombhossz=20;
public static int[] tomb=new int[tombhossz];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tfeltoltfileba();  ////
		filekiir();
		tombfeltolt(tomb);
		tombkiir(tomb);
		lnreszosszegszamol();
	}

	public static void tfeltoltfileba() {
		
		RandomAccessFile r;
		Random rand=new Random();
		try {
			r=new RandomAccessFile("forrasok/lnreszosszeg.txt","rw");
			for (int i=0; i<tombhossz; i++) {
			int szam=rand.nextInt(50)-10;
			r.writeBytes(String.valueOf(szam)+"\n");
			}
			
		}
		catch (IOException e){
			e.getMessage();
		}		
	}
	public static void filetorlo() {
		
		PrintWriter p;
		File file = new File("forrasok/lnreszosszeg.txt");
		try {
			p= new PrintWriter(file);
			p.close();
			}
		
		catch(IOException e) {
			e.getMessage();
		}
	}
	public static void filekiir() {
		
		RandomAccessFile raf;
		String sor;
		try {
			raf=new RandomAccessFile("forrasok/lnreszosszeg.txt", "r");
			for(sor=raf.readLine(); sor!=null;  sor=raf.readLine()) {
				System.out.println(sor);
			}
			}
		
		catch(IOException e) {
			e.getMessage();
		}
	}
	public static void tombfeltolt(int[] t) {
		t=tomb;
		RandomAccessFile raf;
		String sor;
		int i=0;
		try {
			raf=new RandomAccessFile("forrasok/lnreszosszeg.txt", "r");
			for(sor=raf.readLine(); sor!=null; sor=raf.readLine()) {
				if(sor!="") t[i]=Integer.valueOf(sor); i++;
			}
			 raf.close();
		}
		
		catch(IOException e) {
			e.getMessage();
		}
	}
	public static void tombkiir(int[] t) {
		
		for(int i=0; i<tomb.length; i++) {
			System.out.print(tomb[i]+",");
		}
	}
	public static void lnreszosszegszamol() {
		int max=0;
		int maxindex=0;
		for(int i=0; i<tomb.length; i++) {
			int osszeg=0;
			for(int j=0; j<i; j++) {
				osszeg+=tomb[j];
			}
			System.out.println(osszeg);
			if(osszeg>max) {
				maxindex=i;
				max=osszeg;
			}
		}
		System.out.println("A legnagyobb:"+maxindex+". : "+max);
	}
	}
	

