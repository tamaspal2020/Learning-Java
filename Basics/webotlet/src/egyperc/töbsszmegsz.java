package egyperc;
/*Sokszor tal�lkozunk olyan feladatokkal, amikor nem egy tulajdons�g alapj�n kell megsz�molni valamit. Tegy�k fel van egy sz�mt�mb�nk, mely tudjuk, hogy a [0;10] intervallumb�l tartalmaz csak �rt�keket. Adjuk meg egyszer�en, hogy melyik sz�m h�nyszor szerepel a t�mbben.

Ez egy megsz�ml�l�s feladat, de el�g macer�s lenne 11 k�l�n for ciklussal megsz�molni, �s 11 v�ltoz�ban t�rolni a darabsz�mokat.

Adott teh�t a feladat: �rd ki, hogy melyik sz�m h�nyszor szerepel a t�mbben!

Java forr�s:

int[] tomb = { 2,5,4,0,10,1,4,8,5,2,8,1,9,10,
               7,7,3,5,2,4,3,8,0,8,10,8,1,1,8,
               10,7,7,3,8,3,6,6,7,5,8,9,3,9,3,
               5,9,9,5,2,8,10,4,1,0,4,9,2,5,5 };*/
public class t�bsszmegsz {
public t�bsszmegsz(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tomb = { 2,5,4,0,10,1,4,8,5,2,8,1,9,10,
	               7,7,3,5,2,4,3,8,0,8,10,8,1,1,8,
	               10,7,7,3,8,3,6,6,7,5,8,9,3,9,3,
	               5,9,9,5,2,8,10,4,1,0,4,9,2,5,5 };
		
		kivalasztas(tomb); tout(tomb); tsz(tomb);
	}
	public static void kivalasztas(int[] t ) {
		int minindex=0;
		for(int i=0; i<t.length; i++) {
			minindex=i;
			for (int j=i; j<t .length; j++) {
				if(t [j]<t [minindex]) {
					minindex=j;
				}
			}
			int csere=t [minindex];
			t [minindex]=t[i];
			t [i]=csere;
		}
	}
	public static void tout(int[] t) {
		for (int i=0; i< t.length; i++) {
		System.out.print(t[i]+",");
	}
	System.out.println();
	}
	public static void  tsz(int[] t) {
		int sz=0;
		int elem=0;
		for (int i=0; i< t.length-1; i++) {
			elem=t[i]; sz++;
			if(elem<t[i+1]) {
				System.out.println(elem+" �rt�k� elemb�l"+(sz)+"db van a t�mbben.");
				sz=0;
			}
			
		}
		System.out.println(elem+" �rt�k� elemb�l"+(sz+1)+"db van a t�mbben.");
		}
	
	
		
	
}

