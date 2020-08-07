package auto;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import auto.AutoLista;
import auto.Auto;

public class Telep {
private static AutoLista<Auto> lista = new AutoLista<Auto>();
public static void addAuto(Auto a) {
	if(!lista.containsThatLicencePlate(a.getRendszam())) {
		lista.add(a);
	}
	else {
		System.out.println("Van már ilyen rendszám a rendszerben");
	}
			
}
public static void removeAuto(Auto a) {
	
}
public int getIndexByLicencePalte(String r) {
	int ind=0;
	for(int i=0;i<lista.size(); i++) {
		if(r==lista.get(i).getRendszam()) ind=i;
	}
		return ind;
	}
public void kiirAutok() {
	for (int i=0; i<lista.size(); i++) {
		System.out.println(lista.get(i).rendszam);
		System.out.println(lista.get(i).tipus);
		System.out.println(lista.get(i).akt_benz);
		System.out.println(lista.get(i).atlag);
		System.out.println(lista.get(i).matrica);
		System.out.println(lista.get(i).tank);
		System.out.println("--------------------------");
	}
	}
}


