package javaprog_halado;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Fajlkezeles21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf;
	    String sor;
	    ArrayList<String>szavak=new ArrayList<String>();
	    try {
	    raf=new RandomAccessFile("forrasok/forras.txt", "r");
	    for(sor=raf.readLine(); sor!=null; sor=raf.readLine()) {   
			    /*Fontos, hogy a readLine() metódus, mindig egész sort olvas be (a sorvégjelig)
			     és az úgynevezett fájlmutató (hogy éppen hol tartok a fájlban) automatikusan a következõ sor elejére kerül, 
			     a sor hosszától függetlenül.*/
	    	szavak.add(sor);	 
	    }
	    raf.close();
	    }
	    catch(IOException e){
	    	System.out.println(e.getMessage());
	    }
	    for(int i=0;i<szavak.size();i++) {
	    	System.out.println(szavak.get(i));;
	    }
	}

}
