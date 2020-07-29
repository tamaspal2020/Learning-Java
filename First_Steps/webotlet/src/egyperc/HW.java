package egyperc;

import java.io.IOException;
import java.io.RandomAccessFile;

public class HW {
public static String s="x";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filebol();
		nagybetu(s);
		
		
	}
	public static void nagybetu(String s) {
		char csere='a'; String cs="x+";
		StringBuilder str=new StringBuilder(s);
		
		for(int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)==' ')  {
				
				///String.valueOf(s.charAt(i+1)).toUpperCase();
			str.setCharAt(i+1, Character.toUpperCase(s.charAt(i+1)));
			}
			str.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		}		
		System.out.println(str);
}
	public static void filebol() {
		RandomAccessFile raf;
		try {
			raf=new RandomAccessFile("forrasok/nagybetu.txt","r");
			raf.seek(0);
			String sor=null;
			  for(sor=raf.readLine(); sor!=null; sor=raf.readLine()) {   
				    /*Fontos, hogy a readLine() metódus, mindig egész sort olvas be (a sorvégjelig)
				     és az úgynevezett fájlmutató (hogy éppen hol tartok a fájlban) automatikusan a következõ sor elejére kerül, 
				     a sor hosszától függetlenül.*/
		    	s+=sor+"\n";
		    }
			raf.close();
		}
		catch (IOException e){
			e.getMessage();
		}
	}	
	/*public static void filebol() {
		RandomAccessFile raf;
		try {
			raf=new RandomAccessFile("forrasok/nagybetu.txt","rw");
			raf.seek(0);
			String sor=null;
			  for(sor=raf.readLine(); sor!=null; sor=raf.readLine()) {   
				    /*Fontos, hogy a readLine() metódus, mindig egész sort olvas be (a sorvégjelig)
				     és az úgynevezett fájlmutató (hogy éppen hol tartok a fájlban) automatikusan a következõ sor elejére kerül, 
				     a sor hosszától függetlenül.
		    	s+=sor;
		    }
			raf.close();
		}
		catch (IOException e){
			e.getMessage();
		}*/
	}	

