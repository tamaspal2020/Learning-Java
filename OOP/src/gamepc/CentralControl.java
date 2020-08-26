package gamepc;
import gamepc.Room;
import gamepc.Computer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import books.Main.genre;
public class CentralControl {
public static Random rand =new Random();
public static enum proce{AMD, INTEL}
static int[] memvalues= {1,2,4,6,8,12,16};
static int[] magszam= {1,2,4,8,16};

	public static void main(String[] args) {
		Room r = new Room();
		r.szabadgepek=roomFeltolt();
		gui(r);
		
	}
public static  ArrayList<Computer> roomFeltolt() {
	ArrayList<Computer> complist =new ArrayList<Computer>();
	for (int i=0; i<15; i++) {
		int memo=rand.nextInt(memvalues.length);
		int mag=rand.nextInt(magszam.length);
		int dij=200+100*(rand.nextInt(19));
		
			Computer c=new Computer(memo, mag, dij, proce.values()[rand.nextInt(2)]);
			complist.add(c);
		
	}
	return complist;
}
public static  void kiirGepek(Room r){
	
	System.out.println("A szabad g�pek list�ja: ");
	for(int i=0; i<r.szabadgepek.size(); i++) 
	{
		System.out.println(i+1);
		egyGepkiir(r.szabadgepek.get(i));
		System.out.println("------------------------------------------------");
	} 
	System.out.println("A foglalt g�pek list�ja: ");
	for(int i=0; i<r.foglaltgepek.size(); i++) 
	{
		egyGepkiir(r.foglaltgepek.get(i));
	}
}
public static void egyGepkiir(Computer c) {
	/*public int memory;
	public String proc;
	public int magszam;
	public int oradij;
	public int jatszottorak;
	public int keresettpenz;
	public int berleskezdete;
	public int berlesvolt() {*/
	System.out.println("Mem�ria: "+c.memory);
	System.out.println("Processzor: "+c.proc);
	System.out.println("Magok sz�ma: "+c.magszam);
	System.out.println("B�rl�s d�ja �r�nk�nt: "+c.oradij);
	System.out.println("B�rl�s kezdete"+c.berleskezdete);
	System.out.println("B�rl�s v�ge"+c.berlesvege);
}
public static void gui(Room r) {
	int valaszt=-1;
	Scanner sc=new Scanner(System.in);
	while(valaszt!=0) {
		System.out.println("Foglal�s - 1");
		System.out.println("G�p adatok - 2");
		System.out.println("Kil�p�s - 0"); 
		valaszt=sc.nextInt();
		switch  (valaszt) {
			case 1:
				foglalas(r);
				break;
			case 2:
				
				kiirGepek(r);
				break;
			default:
			break;
		}	
	}
	sc.close();
}
public static void foglalas(Room r) {
	System.out.println("Adja meg a g�p sorsz�m�t:");
	Scanner sc=new Scanner(System.in);
	int sorsz=sc.nextInt()-1;	
	System.out.println("Adja meg, mikort�l szeretn� lefoglalni (8-20): ");
	Scanner sc2=new Scanner(System.in);
	int tol=sc.nextInt();
	System.out.println("Adja meg, h�ny �r�ra szeretn� lefoglalni:");
	Scanner sc3=new Scanner(System.in);
	int orakszama=sc.nextInt();
	r.szabadgepek.get(sorsz).berleskezdete=tol;
	r.szabadgepek.get(sorsz).berlesvege=tol+orakszama;
}
}
