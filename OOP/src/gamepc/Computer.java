package gamepc;

public class Computer {
	public int memory;
	public String proc;
	public int magszam;
	public int oradij;
	public int jatszottorak;
	public int keresettpenz;
	public int berleskezdete;
	public int berlesvolt() {
		int berleshossza=0;
		return berleshossza;
	}
	public Computer(int m, int mag, int dij, String proc) {
		this.memory=m;
		this.magszam=mag;
		this.oradij=dij;
		this.proc=proc;
	}
	/*
	konstruktor a processzor és bérleti díj paraméterrel, memória 8 Gb, magok száma 2
	konstruktor a bérleti díj paraméterrel, elõzõeken felül Intel a processzor*/
}
