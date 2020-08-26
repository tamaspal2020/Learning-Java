package algo;

import java.util.Random;

public class rendezes {
public static int[] tomb =new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rendezes r=new rendezes();
r.tf(tomb); r.tout(tomb); r.buborekrendezes(tomb); r.tout(tomb);
r.tf(tomb); r.tout(tomb); r.kivalasztas(tomb); r.tout(tomb);
	}

	public rendezes() {
		
	}
	public void tf(int[] t) {
		Random rand=new Random();
		int szam=0; 
		for (int i=0; i< tomb.length; i++) {
			szam=rand.nextInt(100)+1;
			tomb[i]=szam;
		}
	}
	public void tout(int[] t) {
			for (int i=0; i< tomb.length; i++) {
			System.out.print(tomb[i]+",");
		}
		System.out.println();
	}
	public void buborekrendezes(int[] t ) {
		boolean voltcsere=true;
		for(int i=t.length-1; i>0 && voltcsere; i--) {
			voltcsere=false;
			for (int j=0; j<i; j++) {
				if (tomb[j]>tomb[j+1]) {
					int csere=tomb[j];
					tomb[j]=tomb[j+1];
					tomb[j+1]=csere;
					voltcsere=true;
				}
			}
		}
	}
	public void kivalasztas(int[] t ) {
		int minindex=0;
		for(int i=0; i<tomb.length; i++) {
			minindex=i;
			for (int j=i; j<tomb.length; j++) {
				if(tomb[j]<tomb[minindex]) {
					minindex=j;
				}
			}
			int csere=tomb[minindex];
			tomb[minindex]=tomb[i];
			tomb[i]=csere;
		}
	}
}

