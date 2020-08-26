package gamepc;
import gamepc.CentralControl;
public class Computer {
	public int memory;
	public String proc;
	public int magszam;
	public int oradij;
	public int jatszottorak;
	public int keresettpenz;
	public int berleskezdete;
	public int berlesvege;
	public int berlesvolt() {
		int berleshossza=0;
		return berleshossza;
	}
	public Computer(int m, int mag, int dij, CentralControl.proce p) {
		this.memory=m;
		this.magszam=mag;
		this.oradij=dij;
		this.proc=p.toString();
	}
	/*
	konstruktor a processzor és bérleti díj paraméterrel, memória 8 Gb, magok száma 2
	konstruktor a bérleti díj paraméterrel, elõzõeken felül Intel a processzor*/
}
