package tablets;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;
import tablets.Tablet;
import tablets.Raktar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raktar r=new Raktar();
		createResolution();
		int rX=0;
		int rY=0;
		for (int i=0 ; i<40; i++) {
			int resindex=rand.nextInt(3);
		
			Enumeration<Integer> e=resolution.keys();
			System.out.println(i+". "+e.nextElement());
			int szamlalo=0;
			/*for (int j=0; j<resindex; j++) {
					rX=e.nextElement();
					rY=resolution.get(rX);
				}*/
			boolean k=false;
			boolean g=true;
			double andr=4.2;
			int ar=rand.nextInt(800000)+10000;
			Tablet t=new Tablet(rX, rY, k,g, andr, ar);
			r.tabletAddToList(t);
			System.out.println(i+". "+e.nextElement());
			}
	
		int xx=0;
		for (int h=0; h<r.lista.size();h++) {
			System.out.println(xx+".");
			System.out.println(r.lista.get(h).getresX());
			System.out.println(r.lista.get(h).getresY());
			System.out.println(r.lista.get(h).getkamera());
			System.out.println(r.lista.get(h).getandroid());
			System.out.println(r.lista.get(h).getar());
			System.out.println(r.lista.get(h).getgps());
			System.out.println("*----------------*");
			xx++;
		}
	}
	public static Random rand=new Random();
	public	static Hashtable<Integer , Integer> resolution = 
				new Hashtable<Integer, Integer>(); 

		public  static void createResolution() {
			resolution.put(640, 480);
			resolution.put(800, 600);
			resolution.put(1024, 768);
		}
	}


		
		
	



