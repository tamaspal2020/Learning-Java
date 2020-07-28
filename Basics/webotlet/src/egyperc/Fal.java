package egyperc;
/*
 * Adott 3 változó:
s: small, vagyis kis téglák darabszáma, magasságuk egyenként 1 egység
b: big, vagyis nagy téglák darabszáma, magasságuk egyenként 5 egység
w: wall, vagyis a fal magassága

A feladat az, hogy vizsgáld meg, a rendelkezésre álló téglákból megépíthetõ-e az adott falmagasság. Nem alacsonyabb, nem magasabb, pontosan annyi. Hiába van 4 nagy téglád, abból csak 5-10-15-20 magasságú falakat építhetsz, de 17-est, 8-ast, 14-est, stb nem.

A feladat megoldása során nem használhatsz semmilyen ciklust, vagy beépített osztályt!

A következõ adatokkal tesztelheted a programod. A számok sorrendje kicsi, nagy, fal:*/
public class Fal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;  int sszorzo=1;
		int b=5;  int bszorzo=4;
		int w=9;  
		
		boolean ok =(((w)%(b*bszorzo))%(s*sszorzo)==0);
		System.out.println(ok);
	}
}
