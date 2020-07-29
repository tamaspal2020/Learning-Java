package webotlet;
import java.util.Random;
import java.math.*;

public class Haladotomb3 {
public static int[]tomb=new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tf();
		System.out.println("-----");
		duplak();
		
	}
	public static void tf() {
		int min=0; int max=9;
		for(int i=0; i<tomb.length; i++) {			
			tomb[i]=min + (int) (Math.random() * (max - min));
			System.out.print(tomb[i]+",");			
		}
	}
	public static void duplak() {
		int szamlalo=0;
		int[] ujtomb=new int[10];
		for(int j=0; j<tomb.length; j++) {
			ujtomb[j]=-1;
		}
		for(int i=0; i<tomb.length; i++) {		
			szamlalo=0;
			for(int j=0; j<tomb.length; j++) {	
				if(tomb[i]==tomb[j]) szamlalo+=1;
				
			}
			if (szamlalo>1) {
				System.out.print(tomb[i]+",");
				int db=0;
				for(int h=0; h<ujtomb.length; h++)
				{
					if(ujtomb[h]==tomb[i]) db+=1;
				}
				if(db==0)  ujtomb[i]=tomb[i];
			}
				
		}
		System.out.println("-----");
		for(int j=0; j<tomb.length; j++) {
			if(ujtomb[j]!=-1) System.out.print(ujtomb[j]+",");
		}
	}
}
