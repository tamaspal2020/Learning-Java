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
	konstruktor a processzor �s b�rleti d�j param�terrel, mem�ria 8 Gb, magok sz�ma 2
	konstruktor a b�rleti d�j param�terrel, el�z�eken fel�l Intel a processzor*/
}
