package egyperc;

import java.util.Comparator;

public class Kutya2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sfdgsdfg");
		Kutya2[] kutyak =
			  {
			    new Kutya2("tacsko", 3),
			    new Kutya2("labrador", 7),
			    new Kutya2("labrador", 5),
			    new Kutya2("vizsla", 1),
			    new Kutya2("labrador", 2),
			    new Kutya2("vizsla", 3),
			    new Kutya2("labrador", 1),
			    new Kutya2("tacsko", 2)
			  };
		for (int i=0; i<kutyak.length; i++) {
			System.out.println(kutyak[i]);
			}
		rendez(kutyak);
		System.out.println("-----------");
		for (int i=0; i<kutyak.length; i++) {
			System.out.println(kutyak[i]);
			}
		
		}	
	
	
	
	
		
	public static void rendez(Kutya2[] k) {
		int minindex=0;
		for(int i=0; i<k.length; i++) {
			minindex=i;
			for (int j=i; j<k.length; j++) {
				if(k[j].getFajta().compareTo(k[minindex].getFajta())<0) {
					minindex=j;
				}
			}
			String csere=k[minindex].getFajta();
			
			k[minindex].fajta=k[i].getFajta();
			
			k[i].fajta=csere;
		}
		for(int i=0; i<k.length; i++) {
			minindex=i;
			for (int j=i; j<k.length; j++) {
				if(k[j].getKor()<k[minindex].getKor()) {
					minindex=j;
				}
			}
			int csere=k[minindex].getKor();
			
			k[minindex].kor=k[i].getKor();
			
			k[i].kor=csere;
		}
	
	}
	private String fajta;
	  private int kor;
	  public Kutya2( String f, int k )
	  {
	    fajta = f;
	    kor = k;
	  }
	  public String getFajta()
	  {
	    return fajta;
	  }
	 
	  public int getKor()
	  {
	    return kor;
	  }
	  @Override
	  public String toString()
	  {
	    return "Kutya{" + "fajta=" + fajta + ", kor=" + kor + '}';
	  }
}
