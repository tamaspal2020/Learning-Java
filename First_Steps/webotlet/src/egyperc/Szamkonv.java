package egyperc;
//Egyperces feladat � Sz�mm� konvert�l�s m�sk�pp
/*
 * �rj programot, amely egy string-k�nt megadott eg�sz sz�mot 
 * �tkonvert�l val�di sz�mm�. Az egyetlen probl�ma, hogy konverzi�s f�ggv�nyeket
 *  (*.parse*) nem haszn�lhatod, az �talak�t�st neked kell meg�rni!*/
public class Szamkonv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String();
s="645347";


System.out.println(convert(s));
	}
public static int convert(String s) {
	int n=0;
	int hossz=s.length();
 int szorzo=10;
	for (int i=0; i<hossz; i++) {
		char betu=s.charAt(i);
		System.out.print(betu);
		int szam=0;
		 szorzo=hossz-i-1;
		switch (betu) {
			case '1': szam=1;
				break;
			case '2':  szam=2;
				break;
			case '3':  szam=3;  
				break;
			case '4':  szam=4;
				break;
			case '5':  szam=5;
				break;
			case '6':  szam=6;
				break;
			case '7':  szam=7;
				break;
			case '8':  szam=8;
				break;
			case '9':  szam=9;
				break;
				default:;				
		}		
	n+=szam*(Math.pow((double)10, (double)szorzo));
	}
	System.out.println();
	return n;
}
}

