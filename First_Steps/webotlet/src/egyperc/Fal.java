package egyperc;
/*
 * Adott 3 v�ltoz�:
s: small, vagyis kis t�gl�k darabsz�ma, magass�guk egyenk�nt 1 egys�g
b: big, vagyis nagy t�gl�k darabsz�ma, magass�guk egyenk�nt 5 egys�g
w: wall, vagyis a fal magass�ga

A feladat az, hogy vizsg�ld meg, a rendelkez�sre �ll� t�gl�kb�l meg�p�thet�-e az adott falmagass�g. Nem alacsonyabb, nem magasabb, pontosan annyi. Hi�ba van 4 nagy t�gl�d, abb�l csak 5-10-15-20 magass�g� falakat �p�thetsz, de 17-est, 8-ast, 14-est, stb nem.

A feladat megold�sa sor�n nem haszn�lhatsz semmilyen ciklust, vagy be�p�tett oszt�lyt!

A k�vetkez� adatokkal tesztelheted a programod. A sz�mok sorrendje kicsi, nagy, fal:*/
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
