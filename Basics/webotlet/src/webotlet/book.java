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
		System.out.println("Add meg, mit csináljak:1-kinyit, 2-bezár,3-lapoz, 4-megnéz, 5-kilép.");
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
					  System.out.println("nem jó számot adtál meg");
			}
			
			 mm = new Scanner(System.in);
				System.out.println("Add meg, mit csináljak:1-kinyit, 2-bezár,3-lapoz, 4-megnéz, 5-kilép.");
				valaszt = mm.nextInt();
				mm.nextLine();  
				
			}
			if (valaszt==5)
			{
				System.out.println("Könyvhasználat vége.");
			}
		}
		
	
	public void kinyit()
	{
		if(nyitva) System.out.println("A könyv ki van nyitva");
		else 
		{
			aktualisoldal= min + (int) (Math.random() * (oldalszam - min));
			System.out.println("Kinyitom a könyvet a "+aktualisoldal+". oldalon.");
			nyitva=true;
		}
	}
	public void bezar()
	{
		if(!nyitva) System.out.println("A könyv már be van zárva.");
		else 
		{
			System.out.println("Bezárom a könyvet");
			nyitva=false;
		}
	}
	
	public void lapoz() {
		
		if(nyitva)
		{
		int szam=-1;		
		 Scanner sc;
		 sc = new Scanner(System.in);
		 
		System.out.println("Add meg, milyen irányban lapozzak: 0-bal, 1-jobb, 2-vége.");
		szam = sc.nextInt();
		sc.nextLine();
		
		
		while(szam!=2 && nyitva!=false)
		{			
			
			if(szam!=1 && szam!=0 && szam!=2)
			{
				System.out.println("Nem jó");
			}
			if (szam==0)
			{
				System.out.println("Balra fogok lapozni a"+aktualisoldal+". oldaltól:");
				Scanner sc1;
				 sc1 = new Scanner(System.in);
				System.out.println("Add meg hány lapot lapozzak:");
				int hanylap = sc1.nextInt();
				sc1.nextLine();
				while(hanylap>aktualisoldal)
				{
					System.out.println("Túl nagy szám, ennyit nem tudok balra lapozni, a köny a "+aktualisoldal+". oldalon van nyitva.");
					System.out.println("Add meg hány lapot lapozzak:");
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
				System.out.println("A könyv elejére értem, bezárom.");
					nyitva=false;
				}
				
				
			}
			if (szam==1)
			{
				System.out.println("Jobbra fogok lapozni a"+aktualisoldal+". oldaltól:");
				Scanner sc2;
				 sc2 = new Scanner(System.in);
				System.out.println("Add meg hány lapot lapozzak:");
				int hanylap = sc2.nextInt();
				sc2.nextLine();
				while(hanylap>oldalszam-aktualisoldal)
				{
					System.out.println("Túl nagy szám, ennyit nem tudok jobbra lapozni, a köny a "+aktualisoldal+". oldalon van nyitva.");
					System.out.println("A köny a "+oldalszam+"oldalas így csak"+(oldalszam-aktualisoldal)+" oldalt tudok jobbra lapozni.");
					System.out.println("Add meg hány lapot lapozzak:");
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
				System.out.println("A könyv végére értem, bezárom.");
					nyitva=false;
				}
			
			}
			if(nyitva)
			{
			System.out.println("Add meg, milyen irányban lapozzak: 0-bal, 1-jobb, 2-vége.");
			szam = sc.nextInt();
			sc.nextLine();
			}
			
		}
		System.out.println("Vége a lapozásnak");
		
	}
		else  
		{
			System.out.print("Elõbb ki kell nyitni a könyvet, hogy lapozni lehessen.");
		}	
	}
	public void megnez()
	{
		System.out.println("A könyv oldalainak száma: "+oldalszam);
		if (nyitva)
		{
			System.out.println("A könyv nyitva van a "+aktualisoldal+". oldalon.");
		}
		if(!nyitva)
		{
			System.out.println("A könyv be van csukva");
		}
	}

}
