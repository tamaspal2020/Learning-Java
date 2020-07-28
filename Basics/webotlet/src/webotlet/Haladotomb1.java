package webotlet;
import java.util.Random;
import java.util.HashMap;
import java.math.*;

public class Haladotomb1 {
	
public static int k=0;
public static int[] tomb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tombletrehoz();
	
	

	}
public static void tombletrehoz() {
	Random rand=new Random();
	int min=0; int max=10000000;
	int szam = min + (int) (Math.random() * (max - min));
	k=szam;
	System.out.println(szam);
	System.out.println(szamjegyekszama(szam));
	int sz=szamjegyekszama(szam);
	tomb=new int[sz];
	for (int i=0; i<sz; i++) {
		tomb[i]=szam%10;
		szam=(szam-szam%10)/10;
	}
	for (int i=0; i<tomb.length; i++) {
		System.out.print(tomb[i]+",");
		
	}
	System.out.println();
	hashfeltolt(tomb);
	}

public static  int szamjegyekszama(int i) {
	int m=0;
	int szam=i;
	while(szam>10) {
		m+=1;
		szam=(szam-szam%10)/10;
	}
	return m+1;
}
public static void hashfeltolt(int[] tomb){    ///nemok
	HashMap<Integer , Integer> szamoknegyzete = new HashMap<Integer, Integer>();
	for (int i=0; i<tomb.length; i++) {
		System.out.print(tomb[i]+",");
		Integer key = tomb[i];
	    Integer value  = (int)Math.pow(tomb[i],2);
		szamoknegyzete.put(key, value);
	}
	System.out.println(szamoknegyzete);
	}
	
}
