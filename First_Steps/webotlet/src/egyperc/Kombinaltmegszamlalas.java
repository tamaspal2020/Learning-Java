package egyperc;


import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Kombinaltmegszamlalas {
public static ArrayList<String> hivasok = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		feltolthivasok();
		kiiras();	
	
	}
public static void feltolthivasok() {
	Path ut=Paths.get("forrasok/kombihivasok2.csv");
try (BufferedReader br=Files.newBufferedReader(ut);){
	String sor=null;
	while((sor=br.readLine()) != null && sor.length()>3){
		/*String[] values = sor.split(";");
		 * 
				hivasok.add(Arrays.asList(values));*/
		hivasok.add(sor);
		
	}
}
catch(IOException e) {
	e.getMessage();
}
hivasok.forEach((n)->System.out.println(n));
}
public static void kiiras() {
	for(int i=0; i<25; i++) {
		System.out.println(i+". ora: "+csucsido(i)+", "+nemcsucsido(i)+", "+mobil(i)[0]+", "+mobil(i)[1]); 
	}
}
public static int csucsido(int i) {
	int sum=0;
	for (int a=1; a<hivasok.size(); a++) {
		
		int pvindex=hivasok.get(a).indexOf(";")+1; 
		int kpindex=hivasok.get(a).indexOf(":");
		///System.out.println(pvindex+","+kpindex);
		String s=hivasok.get(a).substring((pvindex),kpindex);
		int ertek=Integer.parseInt(s);
		if (ertek>8  && ertek<18 && ertek==i) sum++;
		
	}
	return sum;
}
public static int nemcsucsido(int i) {
	int sum=0;
	for (int a=1; a<hivasok.size(); a++) {
		
		int pvindex=hivasok.get(a).indexOf(";")+1; 
		int kpindex=hivasok.get(a).indexOf(":");
		///System.out.println(pvindex+","+kpindex);
		String s=hivasok.get(a).substring((pvindex),kpindex);
		int ertek=Integer.parseInt(s);
		if ((ertek<8 || ertek>17) && ertek==i) sum++;
		
	}
	return sum;
}
public static int[]  mobil(int i) {
	int[] sum={0,0};
	for (int a=1; a<hivasok.size(); a++) {
		int pvindex=hivasok.get(a).indexOf(";")+1; 
		int kpindex=hivasok.get(a).indexOf(":");
		String ora=hivasok.get(a).substring((pvindex),kpindex);
		int oraszam=Integer.parseInt(ora);
		String s=hivasok.get(a).substring(2,4);
		int ertek=Integer.parseInt(s); ///System.out.print("*"+oraszam+"-"+ertek+"*");
		if ((oraszam==i) && ((ertek==31) || (ertek==21) || (ertek==71) )) sum[0]++;
		if ((oraszam==i) && ((ertek!=31)) && (ertek!=21) && (ertek!=71) ) sum[1]++;
	}
	return sum;
}
}
