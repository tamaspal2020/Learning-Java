package egyperc;
/*Sokszor találkozunk olyan feladatokkal, amikor nem egy tulajdonság alapján kell megszámolni valamit. Tegyük fel van egy számtömbünk, mely tudjuk, hogy a [0;10] intervallumból tartalmaz csak értékeket. Adjuk meg egyszerûen, hogy melyik szám hányszor szerepel a tömbben.

Ez egy megszámlálás feladat, de elég macerás lenne 11 külön for ciklussal megszámolni, és 11 változóban tárolni a darabszámokat.

Adott tehát a feladat: Írd ki, hogy melyik szám hányszor szerepel a tömbben!

Java forrás:

int[] tomb = { 2,5,4,0,10,1,4,8,5,2,8,1,9,10,
               7,7,3,5,2,4,3,8,0,8,10,8,1,1,8,
               10,7,7,3,8,3,6,6,7,5,8,9,3,9,3,
               5,9,9,5,2,8,10,4,1,0,4,9,2,5,5 };*/
public class töbsszmegsz {
public töbsszmegsz(){}

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
				System.out.println(elem+" értékû elembõl"+(sz)+"db van a tömbben.");
				sz=0;
			}
			
		}
		System.out.println(elem+" értékû elembõl"+(sz+1)+"db van a tömbben.");
		}
	
	
		
	
}

