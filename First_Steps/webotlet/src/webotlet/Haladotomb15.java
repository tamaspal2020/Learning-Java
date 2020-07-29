package webotlet;
// 16. feladat
public class Haladotomb15 {
	public static int[][] tomb=new int[10][10] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tf();
		balsarok(tomb);
}
public static void tf() {
	int min=0; int max=9;
	for(int i=0; i<tomb.length; i++) {			
		for(int j=0; j<tomb.length; j++) {			
			tomb[i][j]=(min + (int) (Math.random() * (max - min)));
			System.out.print(tomb[i][j]);
		}
		System.out.println();
	
	}
}
public static void balsarok(int[][] t) {
	int[][] v=t;
	int szamlalo=0;
	int maxosszeg=-1;
	int sorszam=0;
	int balfelsoi=0;
	int balfelsoj=0;
	for(int i=0;i<v.length-2;i++) {
		for(int j=0;j<v.length-2;j++) {
			int osszeg=0;
			for (int a=0; a<3; a++) {
				for (int b=0; b<3; b++) {
					osszeg+=tomb[i+a][j+b];
				} 
			}
			if (osszeg>maxosszeg) {
				maxosszeg=osszeg;
				sorszam=szamlalo;
				balfelsoi=i;
				balfelsoj=j;
			}	
			szamlalo+=1;
			System.out.println(szamlalo+". : "+osszeg+" -  i : "+ i+" j : "+j);
			
		}
	}
	System.out.println("A legnagyobb összeg:"+maxosszeg);
	System.out.println("Ez a "+sorszam+". 3x3-as négyzet.");
	System.out.println("A bal felsõ sarok koordinátái: "+balfelsoi+","+balfelsoj);
}
}
