package webotlet;
import java.util.Random;
import java.math.*;
import java.util.Scanner;

public class book {
public int oldalszam=0;
public int min=50;
public int max=150;
public int aktualisoldal=0;
public boolean nyitva=false;
	public book()
	{
		 
		 oldalszam = min + (int) (Math.random() * (max - min));
		 
				
	}
	
	public void hasznal()
	{
		 int valaszt=-1;		
		 Scanner mm;
		 mm = new Scanner(System.in);
		System.out.println("Add meg, mit csin�ljak:1-kinyit, 2-bez�r,3-lapoz, 4-megn�z, 5-kil�p.");
		valaszt = mm.nextInt();
		mm.nextLine();
		while(valaszt!=5)
		{
			int v = valaszt;
			switch (v) {
			  case 1:
			    kinyit();
			    break;
			  case 2:
			    bezar();
			    break;
			  case 3: 
				lapoz();
				break;
			  case 4: 
				  megnez();
				  break;
			  default: 
					  System.out.println("nem j� sz�mot adt�l meg");
			}
			
			 mm = new Scanner(System.in);
				System.out.println("Add meg, mit csin�ljak:1-kinyit, 2-bez�r,3-lapoz, 4-megn�z, 5-kil�p.");
				valaszt = mm.nextInt();
				mm.nextLine();  
				
			}
			if (valaszt==5)
			{
				System.out.println("K�nyvhaszn�lat v�ge.");
			}
		}
		
	
	public void kinyit()
	{
		if(nyitva) System.out.println("A k�nyv ki van nyitva");
		else 
		{
			aktualisoldal= min + (int) (Math.random() * (oldalszam - min));
			System.out.println("Kinyitom a k�nyvet a "+aktualisoldal+". oldalon.");
			nyitva=true;
		}
	}
	public void bezar()
	{
		if(!nyitva) System.out.println("A k�nyv m�r be van z�rva.");
		else 
		{
			System.out.println("Bez�rom a k�nyvet");
			nyitva=false;
		}
	}
	
	public void lapoz() {
		
		if(nyitva)
		{
		int szam=-1;		
		 Scanner sc;
		 sc = new Scanner(System.in);
		 
		System.out.println("Add meg, milyen ir�nyban lapozzak: 0-bal, 1-jobb, 2-v�ge.");
		szam = sc.nextInt();
		sc.nextLine();
		
		
		while(szam!=2 && nyitva!=false)
		{			
			
			if(szam!=1 && szam!=0 && szam!=2)
			{
				System.out.println("Nem j�");
			}
			if (szam==0)
			{
				System.out.println("Balra fogok lapozni a"+aktualisoldal+". oldalt�l:");
				Scanner sc1;
				 sc1 = new Scanner(System.in);
				System.out.println("Add meg h�ny lapot lapozzak:");
				int hanylap = sc1.nextInt();
				sc1.nextLine();
				while(hanylap>aktualisoldal)
				{
					System.out.println("T�l nagy sz�m, ennyit nem tudok balra lapozni, a k�ny a "+aktualisoldal+". oldalon van nyitva.");
					System.out.println("Add meg h�ny lapot lapozzak:");
					hanylap = sc1.nextInt();
					sc1.nextLine();
					
				}
				
				for(int i=hanylap; i>0; i--)
				{
					aktualisoldal-=1;
					System.out.print(aktualisoldal+",");					
				}
				if(aktualisoldal==0) 
				{
				System.out.println("A k�nyv elej�re �rtem, bez�rom.");
					nyitva=false;
				}
				
				
			}
			if (szam==1)
			{
				System.out.println("Jobbra fogok lapozni a"+aktualisoldal+". oldalt�l:");
				Scanner sc2;
				 sc2 = new Scanner(System.in);
				System.out.println("Add meg h�ny lapot lapozzak:");
				int hanylap = sc2.nextInt();
				sc2.nextLine();
				while(hanylap>oldalszam-aktualisoldal)
				{
					System.out.println("T�l nagy sz�m, ennyit nem tudok jobbra lapozni, a k�ny a "+aktualisoldal+". oldalon van nyitva.");
					System.out.println("A k�ny a "+oldalszam+"oldalas �gy csak"+(oldalszam-aktualisoldal)+" oldalt tudok jobbra lapozni.");
					System.out.println("Add meg h�ny lapot lapozzak:");
					hanylap = sc2.nextInt();
					sc2.nextLine();
					
					
				}
				for(int i=hanylap; i>0; i--)
				{
					aktualisoldal+=1;
					System.out.print(aktualisoldal+",");					
				}
				if(aktualisoldal==oldalszam) 
				{
				System.out.println("A k�nyv v�g�re �rtem, bez�rom.");
					nyitva=false;
				}
			
			}
			if(nyitva)
			{
			System.out.println("Add meg, milyen ir�nyban lapozzak: 0-bal, 1-jobb, 2-v�ge.");
			szam = sc.nextInt();
			sc.nextLine();
			}
			
		}
		System.out.println("V�ge a lapoz�snak");
		
	}
		else  
		{
			System.out.print("El�bb ki kell nyitni a k�nyvet, hogy lapozni lehessen.");
		}	
	}
	public void megnez()
	{
		System.out.println("A k�nyv oldalainak sz�ma: "+oldalszam);
		if (nyitva)
		{
			System.out.println("A k�nyv nyitva van a "+aktualisoldal+". oldalon.");
		}
		if(!nyitva)
		{
			System.out.println("A k�nyv be van csukva");
		}
	}

}
