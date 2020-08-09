package fishing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fishing.Fish;
import fishing.Fisherman;
import fishing.Lake;

public class StartCompetition {
public static Random rand=new Random();
public StartCompetition() {
	
}	
public void start( ArrayList<Fish> Fishlist ,  ArrayList<Fisherman> FishermanList) {
	int kor=2;
	for (int i=0; i<kor; i++) {
		int[] voltmar=new int[]{-1,-1,-1,-1,-1};
		int s=0;
		System.out.print("Az "+(i+1)+". k�rben r�szt vesznek:");
		while(s<5) {
			Random ra=new Random();
			int sorsz=ra.nextInt(FishermanList.size());
			int szamlalo=0;
			for (int j=0; j<5; j++) {   //5 fisherman will try...
				if(voltmar[j]==sorsz) {
					szamlalo++;
				}
			}
				if(szamlalo==0) {
					voltmar[s]=sorsz;
					s++;
				}
				
					
		}
		for(int k=0; k<voltmar.length; k++) {
			System.out.print(voltmar[k]+",");
			System.out.println();
		}
		for (int l=0; l<voltmar.length; l++) {
		fishing(FishermanList.get(voltmar[l]), Fishlist);
		}
	}
}
public int randomfishindex (ArrayList<Fish> Fishlist) {
	return rand.nextInt(Fishlist.size());
}
public void fishing(Fisherman fisherman, ArrayList<Fish> Fishlist) {
	
	boolean success=false;
	int num=0;
	int melyseg=fisherman.csaliMelyseg();
	while(!success ||  num<5) {
			//System.out.println("<<"+fivefish[num]+">>");
			int ind=randomfishindex(Fishlist);
			if(Fishlist.get(ind).harap(melyseg)  && (Fishlist.get(ind).suly+fisherman.sumWeightFishes)<=(fisherman.teherbiras) ) {
			success=true;
			fisherman.sumWeightFishes+=Fishlist.get(ind).suly;
			System.out.println("Az "+fisherman.neve+ "nev� j�t�kos fogott egy halat.");
			System.out.println("A kifogott hal adatai:");
			System.out.println("A kifogott hal sorsz�ma: "+ind);
			System.out.println("Faj:"+Fishlist.get(ind).faj);
			System.out.println("�hs�g: "+Fishlist.get(ind).ehes);
			System.out.println("M�lys�g: "+Fishlist.get(ind).depth);
			System.out.println("S�ly: "+Fishlist.get(ind).suly);
			System.out.println("A bedobott csali m�lys�ge: "+melyseg);
			System.out.println("A sz�k jelenlegis s�lya: "+ fisherman.sumWeightFishes);
			System.out.println("------------------------------------------------");
			Fishlist.remove(Fishlist.get(ind));
			num++;
		}	
		else num++;
	}	
	}
}



