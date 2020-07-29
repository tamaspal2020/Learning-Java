package egyperc;

import java.util.Random;

public class Atlok {

 public static int n=10;
public static int[][] atlotomb=new int[n][n];
	
public Atlok() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atlok a=new Atlok();
		a.tf(atlotomb);a.to(atlotomb);
		
		a.maxatlo(atlotomb);
		
	}
	public void tf(int[][] t) {
		Random rand=new Random();
		int szam=0; 		
		for (int i=0; i< t.length; i++) {
			for (int j=0; j< t.length; j++) {
				szam=rand.nextInt(100)+1;
				t[i][j]=szam;
			}
		}
		t[0][2]=1000;
	}
	public void to(int[][] t) {
		
		for (int i=0; i< t.length; i++) {
			for (int j=0; j< t.length; j++) {
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void maxatlo(int[][] t) {
		
		int maxosszeg=0;
		int szamlalo=0;
		int sz=0;
		int maxsorsz=0;
		for (int i=0; i<t.length; i++) {
			 int m=0;
			 int osszeg=0;
			 szamlalo++;
			for (int j=t.length-i-1; j<t.length; j++) {
				//System.out.println(j+","+m++);
				System.out.print(t[j][m]+"\t");
				osszeg+=t[j][m];
				
				m++;
			}	
			if (osszeg>maxosszeg) {
				maxosszeg=osszeg;
				maxsorsz=szamlalo;
				System.out.println();
			}
			else{
				System.out.println();
			}
			}
		
		
		
		for (int x=0; x<t.length; x++) {
			 int m=0;
			 int osszeg=0;
			 szamlalo++;
			for (int y=x+1; y<t.length; y++) {
				//System.out.println(y+","+m++);
				System.out.print(t[m][y]+"\t");
				osszeg+=t[m][y];
				
				m++;
			}	
			if (osszeg>maxosszeg) {
				maxosszeg=osszeg;
				maxsorsz=szamlalo;
				System.out.println();
			}
			else {
				System.out.println();
			}
			}
		System.out.println("max atloosszeg (sorszam)"+maxosszeg+"("+maxsorsz+")");
		}
	
	}

