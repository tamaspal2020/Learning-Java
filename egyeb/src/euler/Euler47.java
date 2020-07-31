package euler;

import java.util.ArrayList;

public class Euler47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=640;
			while(! ( negyprimszorzata(i) && negyprimszorzata(i+1) && negyprimszorzata(i+2) && negyprimszorzata(i+3)))
					{
						i=i+1;
					}
				System.out.println(i);
		}

public static boolean negyprimszorzata(int szam) {
		int szamlalo=0;
		for(int i=2; i<(szam/2)+1; i++) {
			if(szam%i==0) {
				//System.out.print(i+" ");
				if(prime(i)) {
					szamlalo+=1;	
					//System.out.print(prime(i)+" "+"szamlalo"+szamlalo);
				}
				//System.out.println();
			}
			
			}
		return (szamlalo==4);
		}
		

public static boolean prime(int szam) {
	for(int i=2; i<(szam/2)+1; i++) {
		if(szam%i==0) return false;
	}
	return true;
}
}

