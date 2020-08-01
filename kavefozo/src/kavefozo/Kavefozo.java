package kavefozo;

import java.util.Scanner;
import kavefozo.Edeny;

public class Kavefozo {
public  static int kave;
public  static int viz;
public static Edeny e=new Edeny();
public static int lezofottadag=0;

public static int hasznaltkave=0;
	
	public Kavefozo() {
		kave=0;
		viz=0;	
		
	}
	public  void Vezerles()
	{
		System.out.println("A kavefozo mûködik");
		int szam=-1;		
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Mit szeretne tenni:");
		System.out.println("1 - feltölt");
		System.out.println("2 - kiurit");
		System.out.println("3 - fõz");
		System.out.println("4 - megnéz");
		System.out.println("5 - edény kiöntése");
		System.out.println("0 - kikapcsol");
		szam = sc.nextInt();
		sc.nextLine();
		while (szam!=0)
		{
			int v = szam;
			switch (v) {
			  case 1:
				  System.out.println("Mit szeretnél beletölteni:");
				  System.out.println("1 - kávé");
				  System.out.println("2 - víz");
				  int anyag=-1;		
					Scanner sca;
					sca = new Scanner(System.in);
					anyag = sca.nextInt();
					sca.nextLine();
					boolean ktele=false;
					boolean vtele=false;
					int ok=0;
					while (ok==0 &&  anyag!=1 && anyag!=2)
					{
						
						if (anyag!=1 && anyag!=2) {
							System.out.println("Nem jó számot adtál meg.");
							
						}
						if ((!ktele || !vtele) ) 
						{
						 System.out.println("Mit szeretnél beletölteni:");
						  System.out.println("1 - kávé");
						  System.out.println("2 - víz");
							anyag=-1;		
							sca = new Scanner(System.in);
							anyag = sca.nextInt();
							sca.nextLine();
							if (anyag==1 || anyag==2) ok=1;
						}
					}
					if (anyag==1 && ((kave+hasznaltkave)==6)) 
					{	
						System.out.println("A kávétartály tele van, nem lehet tölteni bele."); ktele=true;
						
					}
					if (anyag==2 && viz==10) {
						System.out.println("A víztartály tele van, nem lehet tölteni bele."); vtele=true;
						
					}
					
					if ( (anyag==1 && !ktele) || (anyag==2 && !vtele) ) {
						int m=anyag;
					System.out.println("Add meg a mennyiséget");
					 int mennyiseg=-1;		
						Scanner scm;
						scm = new Scanner(System.in);
						mennyiseg = scm.nextInt();
						scm.nextLine();
						int kavemennyiseg=0;
						if (kave>0) kavemennyiseg+=kave;
						if (hasznaltkave>0) kavemennyiseg+=hasznaltkave;
							while ((anyag==1 && mennyiseg>6-kavemennyiseg) || (anyag==2 && mennyiseg>10-viz) || (mennyiseg<1))
							{
								if (anyag==1 && mennyiseg>6-kavemennyiseg)  System.out.println("Kávé max "+(6-kave));
								if (anyag==2 && mennyiseg>10-viz)  System.out.println("Víz max "+(10-viz));
								try{
									if  (mennyiseg>0){
								    }else{
								           throw new Exception();
								    }
								 }catch(Exception  e){
								    System.out.println(e + "1-nél kisebb mennyiség");
								 }
								System.out.println("Add meg a mennyiséget");
								scm = new Scanner(System.in);
								mennyiseg = scm.nextInt();
								scm.nextLine();
								
							}
						int me=mennyiseg;
						feltolt(m, me);
					}
					
			    break;
			  case 2:
			 kiurit();
			    break;
			  case 3: 
				  foz();
					break;
			  case 4: 
				  megnez();
				break;
			  case 5: 
				  e.kiont();
				  System.out.println("Az edénybõl kiöntöttem a kész kávét, most üres");
				break;
			  case 6: 
				  
				break;
			  case 0: 
				  
				  break;
			  default: 
					  System.out.println("nem jó számot adtál meg");
			}
			sc = new Scanner(System.in);
			System.out.println("Mit szeretne tenni:");
			System.out.println("1 - feltölt");
			System.out.println("2 - kiurit");
			System.out.println("3 - fõz");
			System.out.println("4 - megnez");
			System.out.println("5 - edény kiöntése");
			System.out.println("0 - kikapcsol");
			szam = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("A kavefozo kikapcsol");
		
	}
	public static void feltolt(int mi, int mennyi) {
		 int m=mi;
		 int mennyiseg=mennyi;
		 if (m==1) kave+=mennyiseg;
		 if (m==2) viz+=mennyiseg;
	}
	public static void kiurit() {
		 hasznaltkave=0;
	}
	public static void foz() {
		boolean kesz=false;
		
		if(kave==0 && hasznaltkave==0) System.out.println("Nincs benne kávé, fel kell tölteni");
		if(viz==0) System.out.println("Nincs benne víz, fel kell tölteni");
		boolean edenytele=false;
		if ((e.mennyiseg+kave+hasznaltkave)>e.maxmennyiseg)  {
			edenytele=true; System.out.println("Az edénybe nem fér ennyi kávé, elõbb öntse ki a tartalmát.");
		}
		if( ( kave+hasznaltkave!=0) && viz!=0 && !edenytele) {			
			while(!kesz)    //lehet kevesebb vízzel is fõzni, ilyenkor erõs lesz és lehet használt kávévalis fõzni, ilyenkor rossz lesz
			{
				int vizhasznalat=0;
				
				lezofottadag=kave+hasznaltkave;
				e.mennyiseg+=lezofottadag;
				e.kostol(viz, kave, hasznaltkave);
				if(viz<(hasznaltkave+kave)) vizhasznalat=viz;
				if(viz>=(hasznaltkave+kave)) vizhasznalat=(hasznaltkave+kave);
				hasznaltkave+=kave;
				viz=viz-vizhasznalat;		
				kave=0;
				kesz=true;
				
				
				System.out.println("Az edényben lévõ lefõzött kávé mennyisége:"+e.mennyiseg);
			
			if(kesz) {
				System.out.println("Kész a kávé."+lezofottadag+ "adag kávét fõztem.");
			}
		}
		}
		 
	}
	public static void megnez() {
		System.out.println("A kávéfõzõben jelenlegi állapota:");
		System.out.println("Kávé:"+kave+" adag");
		System.out.println("Víz:"+viz+" adag");
		System.out.println("Használtkávé:"+hasznaltkave+" adag");
		System.out.println("Az edényben a lefõzött kávé mennyisége:"+e.mennyiseg+" adag");
		if (e.mennyiseg!=0) System.out.println("Az edényben a lefõzött kávé minõsége:"+e.minoseg);
	}
	
	
	
}
