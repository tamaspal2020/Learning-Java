package auto;

public class Auto {
	public double atlag;
	public double tank;
	public double akt_benz;
	public String tipus;
	public boolean matrica;
	public String rendszam;
	public static enum genre {  mese, regény, történelem, szakkönyv, külföldi }

public Auto( double atlag, double tank, double akt_benz, String tipus, boolean matrica, String rendszam) {
	this.atlag=atlag;
	this.tank=tank;
	this.akt_benz=akt_benz;
	this.tipus=tipus;
	this.matrica=matrica;
	this.rendszam=rendszam;
}

public int hanykm() {
	int km=0;
	return km;
}
public String getRendszam() {
	return this.rendszam;
}
}
