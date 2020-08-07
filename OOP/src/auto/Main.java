package auto;
import java.util.Random;

import auto.Auto;
import auto.Telep;
public class Main {
	public static enum genre {szemelyauto, kisbusz, busz};
	public static Random rand=new Random();
	public static void main(String[] args) {
		Telep t=new Telep();
		feltolt(t);
		t.kiirAutok();
		
		/*for (int i=0; i<1000; i++) {
			System.out.println(publicLicenceGenerator());
		}
		System.out.println("-------------");*/
	

	}
public static void feltolt(Telep t) {
	for (int i=0; i<50; i++) {
		Auto a=null;
		double atlag=rand.nextInt(27)+3;
		double tank=rand.nextInt(80)+20;
		double akt_benzin=rand.nextInt((int)tank);
		int genreindex=rand.nextInt(3);
		String tipus=genre.values()[genreindex].toString();
		boolean matrica=false;
		int m=rand.nextInt(1);
		if(m==0) {
			matrica=true;
		} 
		String rendsz=publicLicenceGenerator();
		a=new Auto(atlag, tank, akt_benzin , tipus, matrica, rendsz);
		t.addAuto(a);
	}
}
public static String publicLicenceGenerator1() {
	String characters="QWERTZUIOPLKJHGFDSAMNBVCXY";
	String pl="xxxzyyy";
	for(int i=0; i<3; i++) {
		Random rand1=new Random();
		int r=rand1.nextInt(characters.length());
		char randomcharacter=characters.charAt(r);
		pl=pl.replace(pl.charAt(i), characters.charAt(r));
		char randomnumber=(char)(rand.nextInt(10)+'0');///converts int to char
		pl=pl.replace('y', randomnumber);
	}
	pl=pl.replace('z', '-');
	return(pl);
}
public static  String publicLicenceGenerator() {
	String characters="QWERTZUIOPLKJHGFDSAMNBVCXY";
	String pl="xerzybh";
	for(int i=0; i<3; i++) {
		Random rand1=new Random();
		int r=rand1.nextInt(characters.length());
		char randomcharacter=characters.charAt(r);
		pl=pl.replace(pl.charAt(i), characters.charAt(r));
		char randomnumber=(char)(rand.nextInt(10)+'0');///converts int to char
		pl=pl.replace(pl.charAt(4+i),randomnumber);		
	}
	pl=pl.replace('z', '-');
	return pl;

}
}
