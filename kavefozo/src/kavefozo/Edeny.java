package kavefozo;

public class Edeny {
	public  int mennyiseg=0;
	public static int maxmennyiseg=20;
	public String minoseg="good";   /// good, bad, strong
	public  Edeny()	{
		
	}
	public  void kostol(int vizmennyiseg, int kavemennyiseg, int hasznaltkavemennyiseg) {
		if (hasznaltkavemennyiseg>0) minoseg="bad";
		if (minoseg=="good" && hasznaltkavemennyiseg==0 && kavemennyiseg>vizmennyiseg) minoseg="strong";
		if (minoseg=="good" && hasznaltkavemennyiseg==0 && kavemennyiseg<=vizmennyiseg) minoseg="good";
		if (minoseg=="strong" && hasznaltkavemennyiseg==0 && kavemennyiseg>vizmennyiseg) minoseg="strong";
		if (minoseg=="strong" && hasznaltkavemennyiseg==0 && kavemennyiseg<=vizmennyiseg) minoseg="strong";
		if (minoseg=="bad" && hasznaltkavemennyiseg==0 && kavemennyiseg>vizmennyiseg) minoseg="bad";
		if (minoseg=="bad" && hasznaltkavemennyiseg==0 && kavemennyiseg<=vizmennyiseg) minoseg="bad";
		if (mennyiseg==0 && hasznaltkavemennyiseg==0 && kavemennyiseg>vizmennyiseg) minoseg="strong";
		if (mennyiseg==0 && hasznaltkavemennyiseg==0 && kavemennyiseg<=vizmennyiseg) minoseg="good";

	}
		public  void kiont() {
			mennyiseg=0;
			System.out.println("A lefõtt kávét kiöntöttem, most"+mennyiseg+" kávé van benne.");
			minoseg="good";
	}
}
