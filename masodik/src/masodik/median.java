package masodik;
import java.util.ArrayList;
import java.util.Random; 
public class median {
	/*Feladat: random elemmel növekvõ sorozat mediánértékét kiírni, minden új elem után
	 * 
	 */
	public static  ArrayList<Integer> lista = new ArrayList<Integer>();
	public static void main(String[] args){
		feltolt(10);
		System.out.println("---------------------");
		kiir1(lista);
		System.out.println("---------------------");
}
	public static void feltolt(int n)
	{
			  
		for (int i=0; i<n; i++)
		{				
			System.out.println();
				Random rand = new Random();
				int elem=rand.nextInt(100);
				System.out.print((i+1)+". generált elem: "+elem);
				if (i>-1)
				{
					for(int j=0; j<i; j++)
					{
						if(elem<lista.get(j))
						{
							int csere=lista.get(j);
							lista.set(j, elem);
							elem=csere;
						}
					
					}
					lista.add(elem);
				}
				else lista.add(elem);
				
			System.out.println();
			System.out.print("A lista jelenlegi állapota:");
			kiir1(lista);
			System.out.print("Az aktuális medán:");
			double m=0;
			if(i%2!=0 && i!=0)
			{
				
				int m1=i/2;
				int m2=m1+1;
				m=(lista.get(m1)+lista.get(m2))/2;
				
			}
			if (i%2==0)
			{
				m=lista.get((i+1)/2);
			}
			if (i==0) m=lista.get(0);
			System.out.print(m);
			System.out.println();
		}

	}

	public static void kiir1( ArrayList<Integer> l )
	{
		System.out.print("Lista: ");
		for (int i=0; i<l.size(); i++)
		{			
			System.out.print(l.get(i)+",");
		}
		System.out.println();
	}
	
	public static int medianszamito( ArrayList<Integer> l)
	{
		int m=0;
		return m;
	}
	
}
