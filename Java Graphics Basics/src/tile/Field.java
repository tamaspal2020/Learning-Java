package tile;
import tile.Soldier;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import tile.InfoPanel;
public class Field {
public static ArrayList<Soldier> soldierlist=new ArrayList<Soldier>();
public static Random rand=new Random();
	public  void populate(JLabel[][] labelek) {
		for (int i=0; i<300; i++) {
			int x=rand.nextInt(20);
			int y=rand.nextInt(20);
			int s=rand.nextInt(10);
			String szin=null;
			if(i<150) szin="white";
			else {
				szin="black";
			}
			Soldier soldier=new Soldier(szin,s, x, y );
			soldierlist.add(soldier);
			if (szin=="white") {
				labelek[x][y].setBackground(Color.WHITE);
				labelek[x][y].setForeground(Color.BLACK);
			}
			else {
				labelek[x][y].setBackground(Color.BLACK);
				labelek[x][y].setForeground(Color.WHITE);
			}
			
			String ero=Integer.toString(s);
			labelek[x][y].setHorizontalAlignment(SwingConstants.CENTER);
			labelek[x][y].setText(ero);
			labelek[x][y].setFont(new Font("Serif", Font.PLAIN, 30));
			
			
		}
		
	}
/*public boolean coordinateexists(ArrayList<Soldier>lista, int x, int y) {
	boolean ex=false;
	for (int i=0; i<lista.size();i++)
	{
		if (  (lista.get(i).X==x) && (lista.get(i).Y==y) ) {
			return true;
		}
	}
	return false;
}*/
public  void chooseASoldier() {
	Soldier s=soldierlist.get(rand.nextInt(soldierlist.size()));
	String x=Integer.toString(s.X);
	String y=Integer.toString(s.Y);
	String ero=Integer.toString(s.strength);
	String message="A katona koordinátái: "+x+","+y+"\n"+"Ereje: "+ero;
	InfoPanel.l2.setText(message);
	
}
public  void enemiesAroundASoldier() {
	
}
public  void comradesAroundASoldier() {
	
}
}
