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
	public Computer(int m, int mag, int dij) {
		this.memory=m;
		this.magszam=mag;
		this.oradij=dij;
	}
	/*
	konstruktor a processzor �s b�rleti d�j param�terrel, mem�ria 8 Gb, magok sz�ma 2
	konstruktor a b�rleti d�j param�terrel, el�z�eken fel�l Intel a processzor*/
}
