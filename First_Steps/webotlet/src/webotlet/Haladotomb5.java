package webotlet;
import java.util.Random;
import java.math.*;

public class Haladotomb5 {
public static int[]tomb=new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tf();
		System.out.println("-----");
		jobbracsaknagyobb();
		
	}
	public static void tf() {
		int min=0; int max=9;
		for(int i=0; i<tomb.length; i++) {			
			tomb[i]=min + (int) (Math.random() * (max - min));
			System.out.print(tomb[i]+",");			
		}
	}
	
	public static void jobbracsaknagyobb() {
		for(int i=0; i<tomb.length-1; i++) {			
			int ok=1;
			for(int j=i+1; j<tomb.length; j++) {			
					if(tomb[i]>tomb[j]) ok=0;		
			}	
			if (ok==1 && !(i==tomb.length-2 && tomb[i]==tomb[i+1])) System.out.println(tomb[i]+"-"+i);
		}
	}
	
	}

