package fishing;

import java.util.ArrayList;
import java.util.Random;
import fishing.*;
import fishing.StartCompetition;

public class Lake {
	public static Random rand=new Random();
	public static String[] haltipus= new String[] {"ponty", "keszeg", "csuka", "amur", "busa", "kárász", "harcsa"};
	public static void main(String[] args) {
		fillFishList();
		Fishlistprint();
		fillFishermanlist();
		Fishermanlistprint();
		StartCompetition S=new StartCompetition();
		S.start(Fishlist, Fishermanlist);
		//Fishlistprint();

	}
	public static ArrayList<Fish> Fishlist =new ArrayList<Fish>();
	public static ArrayList<Fisherman> Fishermanlist =new ArrayList<Fisherman>();
	public static void fillFishList() {
		for(int i=0; i<100; i++) {
			double s=rand.nextInt(49)+1;
			String halfaj=haltipus[rand.nextInt(haltipus.length)];
			int d=rand.nextInt(100);
			int h=rand.nextInt(10);
			Fish f=new Fish(s, halfaj, d, h);
			Fishlist.add(f);
			
			
		}
	}
	public static void Fishlistprint() {
		for(int i=0; i<Fishlist.size(); i++) {
			System.out.println(i+":");
			System.out.println("faj: "+Fishlist.get(i).faj);
			System.out.println("úszási mélység: "+Fishlist.get(i).depth);
			System.out.println("éhség mértéke: "+Fishlist.get(i).ehes);
			System.out.println("súly: "+Fishlist.get(i).suly);
			
			
		}
	}
	public static void fillFishermanlist() {
		for(int i=0; i<10; i++) {
			String nev=String.valueOf(i);
			double t=rand.nextInt(80);
			Fisherman fm=new Fisherman(nev, t);
			Fishermanlist.add(fm);				
		}
	}
	public static void Fishermanlistprint() {
		for(int i=0; i<Fishermanlist.size(); i++) {
			System.out.println(i+":");
			System.out.println("nev: "+Fishermanlist.get(i).neve);
			System.out.println("teherbiras: "+Fishermanlist.get(i).teherbiras);				
		}
	}
}
