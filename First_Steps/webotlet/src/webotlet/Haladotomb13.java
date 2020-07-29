package webotlet;

public class Haladotomb13 {
public static int[] tomb=new int[200] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			tf();
			System.out.println();
			System.out.println(novekvo(1014));
	}
	public static void tf() {
		int min=1; int max=10000;
		for(int i=0; i<tomb.length; i++) {			
			tomb[i]=min + (int) (Math.random() * (max - min));
			System.out.println(tomb[i]+"-("+novekvo(tomb[i])+") ,");			
		}
	}
	public static  boolean novekvo(int s) {
		boolean b=true;
		int szam=s;
		int szamjegy1=szam%10;
		while(szam>=10 && b==true) {
			szam=(szam-szamjegy1)/10;
			int szamjegy2=szam%10;
			if(szamjegy1<=szamjegy2) b=false;
			else
			{
				szamjegy1=szamjegy2;
			}
			
			
		}
		return b;	
	}
	
}
