package egyperc;
import java.util.ArrayList;

import egyperc.Kutya;
public class Listatorles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Kutya> kutyak = new ArrayList<Kutya>();
		 
		kutyak.add( new Kutya("tacsko", 3, "fekete") );
		kutyak.add( new Kutya("vizsla", 6, "arany") );
		kutyak.add( new Kutya("vizsla", 3, "fekete") );
		kutyak.add( new Kutya("labrador", 7, "zsemle") );
		kutyak.add( new Kutya("labrador", 5, "arany") );
		kutyak.add( new Kutya("vizsla", 3, "arany") );
		kutyak.add( new Kutya("labrador", 7, "fekete") );
		kutyak.add( new Kutya("vizsla", 3, "barna") );
		kutyak.add( new Kutya("labrador", 7, "barna") );
		kutyak.add( new Kutya("labrador", 1, "zsemle") );
		kutyak.add( new Kutya("tacsko", 2, "fekete") );
		
		
		for(int i=0; i<kutyak.size(); i++) {
			System.out.print(kutyak.get(i).getFajta()+" ");
			System.out.print(kutyak.get(i).getKor()+" ");
			System.out.print(kutyak.get(i).getSzin()+" ");
			System.out.println();
		}
			
		for(int i=0; i<kutyak.size(); i++) {
			if(kutyak.get(i).getFajta()=="vizsla") {
				kutyak.remove(i);
				i=i-1;
			}			
		}
		System.out.println();
		for(int i=0; i<kutyak.size(); i++) {
			System.out.print(kutyak.get(i).getFajta()+" ");
			System.out.print(kutyak.get(i).getKor()+" ");
			System.out.print(kutyak.get(i).getSzin()+" ");
			System.out.println();
		}
	}

}

