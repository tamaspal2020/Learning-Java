
package harmadik;
import java.util.ArrayList;
import java.util.Random; 

public class webotletaltalanosharomutolso {
	public static ArrayList<Long> lista = new ArrayList<Long>();
	public static void main(String[] args){
		

	
		long min=999999999;
	 long max=9000000001L;	  
	 long szam = min + (long) (Math.random() * (max - min));
	 System.out.println("---------------------");
	 System.out.println("A szám:"+szam);
	 kiir(szam);
	 szamjegybenne(lista);
	
	}
	
	public static void kiir(long n)
	{
		long szam1=n; 
		
		 int length = String.valueOf(n).length();
		 System.out.println(length);
		 for (int i=0; i<length ; i++)
		 {
			 long elem=(szam1)%10;
			 System.out.print("elem"+":"+elem+",");
			 
			 lista.add(elem);
			 szam1=(szam1-(szam1%10))/10;
		 }
		 
	}
	public static void szamjegybenne(ArrayList<Long> l )
	{
		System.out.println();
		ArrayList<Long> lista=l; 
		ArrayList<Integer> nincs=new ArrayList<Integer>(); 
		boolean nincs_hianyzo=true;
		
		for (int i=1; i<3; i++)
		{
			int ok=0;
			for (int j=0; j<l.size(); j++)
			{
				if (lista.get(j)==i)
				{
					ok=1;
					nincs_hianyzo=false;
				}
			}
			if (ok==0)
			{
				nincs.add(i);
			}
		}
		if (!nincs_hianyzo) System.out.println("Minden keresett számjegy (1 és 2) megtalálható benne."); 
		else kiir2(nincs);
		
	}
	public static void kiir1( ArrayList<Long> l )
	{
		System.out.print("Lista: ");
		for (int i=0; i<l.size(); i++)
		{			
			System.out.print(l.get(i)+",");
		}
		System.out.println();
	}
	public static void kiir2( ArrayList<Integer> l )
	{
		System.out.print("Ami nincs benne: ");
		for (int i=0; i<l.size(); i++)
		{			
			System.out.print(l.get(i)+",");
		}
		System.out.println();
	}
}
