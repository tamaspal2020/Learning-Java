package egyeb;

import java.util.Scanner;

public class TicTac {
public static String[][]  tabla=new String[3][3];
public static char gyoztes='d';
public static boolean van=false;
	public static void main(String[] args) {
		game();
			
	}
public static void rajzol() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(tabla[i][j]);
			if(j<2) System.out.print("|");
		}
		System.out.println();
		System.out.println("-----");
		
	}
		
}
public static void tablafeltolt() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			tabla[i][j]=" ";
		}
		
	}
}
public static void game() {
	tablafeltolt();
	rajzol();
	System.out.println(gyoztes);
	int szam=0;		
	Scanner sc;
	sc = new Scanner(System.in);	
	System.out.println("Adj meg egy számot:");
	szam = sc.nextInt();
	sc.nextLine();
	int p=2;
	while(!tele(tabla)) {
		if(van) break;
		if(p%2==0) {
			int szamlalo=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					szamlalo+=1;
					if (szam==szamlalo) { 
						tabla[i][j]="o";
					}
				}
			
			}
			rajzol();
			if(van) break;
			vangyoztes();
			p+=1;
		}
		else {
			vangyoztes();
			if(van) break;
			if(!tele(tabla)) {
				vangyoztes();
				if(van) break;
				geplep();
				rajzol();
				vangyoztes();
				if(van) break;
				sc = new Scanner(System.in);	
				System.out.println("Adj meg egy számot:");
				szam = sc.nextInt();
				sc.nextLine();			
				p+=1;
			vangyoztes();if(van) break;
			}
		}
		vangyoztes();
		if(van) break;
	}
	
	System.out.println("Játszma vége");
	System.out.println(gyoztes);
}
public static boolean tele(String[][] t) {
	int szamlalo=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(tabla[i][j]==" ") szamlalo+=1;
		}
		
	}
	if (szamlalo==0) return true;
	return false;
}
public static void geplep() {
	boolean jomezo=false;
	int min=1; int max=9;
	int lepes=-1;
	int joi=0;
	int joj=0;
	while(!jomezo) {
		lepes=min + (int) (Math.random() * (max - min));
		int szaml=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				szaml+=1;
				if (lepes==szaml) { 
					if(tabla[i][j]==" ") {
						jomezo=true; 
						joi=i; joj=j;
						}
				}
			}
		
		}
	}	
				tabla[joi][joj]="x";
		
}
public static void vangyoztes() {
	//sorok
	
	
	if(!van) {
	for (int i=0; i<3; i++) {
		String sor="";
		for (int j=0; j<3; j++) {
			sor+=tabla[i][j];
		}
		if (azonosak(sor)) {
			gyoztes=sor.charAt(0);
			System.out.println("van jó sor");
			van=true;
		}
		}
	}
	if(!van) {
	//oszlopok
	
	for (int i=0; i<3; i++) {
		String oszlop="";
		for (int j=0; j<3; j++) {
			oszlop+=tabla[j][i];
		}	
		
		if (azonosak(oszlop)) {
			gyoztes=oszlop.charAt(0);
			System.out.println("van jó oszlop");
			van=true;
		}
		}
	
	}
	if(!van) {	
	//atlok
	String atlo1="";
			for (int i=0; i<3; i++) {
				atlo1+=tabla[i][i];
			}
	
	if (azonosak(atlo1)) {
		gyoztes=atlo1.charAt(0);
		System.out.println("van jó atlo");
		van=true;
	}
	}
	if(!van) {
	String atlo2="";
	for (int i=0; i<3; i++) {
		atlo2+=tabla[2-i][i];
	}
	if (azonosak(atlo2)) {
		gyoztes=atlo2.charAt(0);
		System.out.println("van jó atlo");
		van=true;
	}
	}
	
}
public static boolean azonosak(String s) {
	if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2) && s.charAt(0)!=' ')
		return true;
	return false;
}
}
