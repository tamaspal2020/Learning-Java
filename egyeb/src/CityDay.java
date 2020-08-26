import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CityDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[] amounts=new int[n];
		List<Integer> jok=new ArrayList<>();
		for (int i=0; i<n; i++) {
			amounts[i]=sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			if(i-x<=0) {
				if(i+y>=n) {
					if(notsorainy(0, i, n-1, amounts)) jok.add(i);
				}
				if(i+y<n) {
					if (notsorainy(0, i, i+y, amounts)) jok.add(i);
				}
			}
		}
		for (int i=0; i<n; i++) {
			if(i-x>0) {
				if(i+y>=n) {
					if (notsorainy(i-x, i, n-1, amounts)) jok.add(i);
				}
				if(i+y<n) {
					if (notsorainy(i-x, i, i+y, amounts)) jok.add(i);
				}
			}
		}		
			System.out.println(jok.get(0)+1);		
	}
	public static boolean notsorainy(int k, int d, int v, int[] amounts) {
		boolean nsr=false;
		boolean before=true;		
		boolean after=true;
		for(int i=k; i<d; i++) {
			if(amounts[i]<amounts[d]) before=false;
			///System.out.print(amounts[i]+",");
		}
		///System.out.print(">>> "+d+":"+amounts[d]+" <<<");
		for(int i=d+1; i<v+1; i++) {
			if(amounts[i]<amounts[d]) after=false;
			///System.out.print(amounts[i]+",");
		}
		System.out.println();
		if(before && after) nsr=true;
		return nsr;
	}
}
