package webotlet;
import java.util.Random;
import java.math.*;
public class Haladotomb2 {
public static int[] tomb=new int[200];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0; int max=200;
		for(int i=0; i<tomb.length; i++) {
			
			tomb[i]=min + (int) (Math.random() * (max - min));
			System.out.print(tomb[i]+",");
			
			
		}
		System.out.println();
		tombelemduplaja(tomb);		
	}
	public static void tombelemduplaja(int[] t) {
for(int i=0; i<t.length; i++) {
	
			for (int j=0; j<t.length; j++) {
				if(tomb[j]==tomb[i]*2) {
					System.out.println("A tomb "+i+". eleme:"+tomb[i]);
					System.out.println("A tomb "+j+". eleme ennek duplája:"+tomb[j]);
					System.out.println("-----------------");
				}
			}
				
		}
	}

	
}
