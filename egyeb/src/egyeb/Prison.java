package egyeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prison {
public static Random rand=new Random();
	public static void main(String[] args) {
		List<Integer> info=new ArrayList<Integer>();
		listfeltolt(info);
		listakiir(info);
		System.out.println(sumwall(info));
		System.out.println(sumpower(info));
	}
	public static void listfeltolt(List<Integer> lista) {
		int numberofcells =rand.nextInt(10)+1;
		for (int i=0; i<numberofcells; i++) {
			int thickness=rand.nextInt(15)+5;
			int storage=rand.nextInt(thickness)+1;
			int battery=rand.nextInt(storage)/2;
			lista.add(battery); 
			lista.add(storage);
			lista.add(thickness);
		}
	}
	public static void listakiir(List<Integer> lista) {
		for (int i=0; i<lista.size(); i++) {
			System.out.print(lista.get(i)+",");
			if((i+1)%3==0) 	System.out.println();
			
				}
			}
	public static int sumwall(List<Integer> lista) {
		int sum=0;
		for (int i=0; i<lista.size(); i++) {
			if((i+1)%3==0) 	sum+=lista.get(i);
			}
		return sum;
	}
	public static int sumpower(List<Integer> lista) {
		int sum=0;
		for (int i=1; i<lista.size()-1; i+=3) {
			sum+=lista.get(i);
			}
		return sum;
	}
	
}


