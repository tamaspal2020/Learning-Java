package webotlet;

public class Haladotomb12 {
public static int[] tomb=new int[20] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			tf();
			System.out.println();
			tr();
	}
	public static void tf() {
		int min=-10; int max=10;
		for(int i=0; i<tomb.length; i++) {			
			tomb[i]=min + (int) (Math.random() * (max - min));
			System.out.print(tomb[i]+",");			
		}
	}
	public static void tr() {
			
			for(int j=0; j<tomb.length-1; j++) {			
				for(int g=j+1; g<tomb.length; g++) {			
					if(tomb[g-1]%2!=0 && tomb[g]%2==0) {					
						int csere=tomb[g-1];
						tomb[g-1]=tomb[g];
						tomb[g]=csere;
					}
				}
				}
			for(int i=0; i<tomb.length; i++) {			
				
				System.out.print(tomb[i]+",");
			}
	}
}
