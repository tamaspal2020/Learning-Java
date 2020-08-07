package gamepc;
import gamepc.Room;
import gamepc.Computer;

import java.util.ArrayList;
import java.util.Random;

import books.Main.genre;
public class CentralControl {
public static Random rand =new Random();
public static enum proce{AMD, INTEL}
static int[] memvalues= {1,2,4,6,8,12,16};
static int[] magszam= {1,2,4,8,16};

	public static void main(String[] args) {
		Room r = new Room();
		r.szabadgepek=roomFeltolt();
		kiirGepek(r);
		
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
	
	System.out.println("A szabad gépek listája: ");
	for(int i=0; i<r.szabadgepek.size(); i++) 
	{
		egyGepkiir(r.szabadgepek.get(i));
	} 
	System.out.println("A foglalt gépek listája: ");
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
	System.out.println("Memória: "+c.memory);
	System.out.println("Processzor: "+c.proc);
	System.out.println("Magok száma: "+c.magszam);
	System.out.println("Bérlés díja óránként: "+c.oradij);
}
public static void gui() {
	int valaszt=-1;
	while(valaszt!=0) {
		System.out.println("Foglalás - 1");
		System.out.println("Gép adatok - 2");
		System.out.println("Kilépés - 0"); 
		switch  (valaszt) {
			case 1:
				break;
			case 2:
				break;
			default:
			break;
		}					
	}
}
public void foglalas() {
	
}
}
