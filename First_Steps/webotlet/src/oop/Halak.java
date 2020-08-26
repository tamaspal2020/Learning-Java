package oop;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class Halak {
private double weight;
private int top;
private int depth;
private boolean predator;
private String faj;
public static int novosszsuly=0;
public double getweight() {
	return this.weight;
}
public int gettop() {
	return this.top;
}
public int getdepth() {
	return this.depth;
}
public boolean gettpredator() {
	return this.predator;
}
public String getfaj() {
	return this.faj;
}
public void setweight(double w) throws Exception {
	if(w<0.5 || w>40) throw new Exception("A hal súlya 0.5 és 40 között legyen");
	else this.weight=w;
}
public void settop(int t) throws Exception {
	if(t<0 || t>400) throw new Exception("A top érték 0 és 400 között legyen");
	else this.top=t;
}
public void setdepth(int d) throws Exception {
	if(d<10 || d>400) throw new Exception("A depth érték 10 és 400 között legyen");
	else this.depth=d;
}
public void setfaj(String f) throws Exception {
	if(f==null) throw new Exception("A név nem lehet null");
	if(f.length()<3 || f.length()>30)  throw new Exception("A név minimum 3 maximum 30 karakter lehet");
	this.faj=f;
}
public Halak(double w, int t, int d, char predator, String f) {
	this.weight=w;
	this.top=t;
	this.depth=d;
	if (predator=='p') this.predator=true;
	if (predator=='n') this.predator=false;
	this.faj=f;
}
public void sulyvaltozas(double t) {
	if (t<(this.weight)*0.1) {
		this.weight+=t;
		novosszsuly+=t;
	}
	
	else {
		this.weight=this.weight*1.1;
		novosszsuly+=this.weight*0.1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Halak> lista=new ArrayList<Halak>();
		feltolt(lista);
		kiir(lista);
	}

public static void feltolt(ArrayList<Halak> H) {
	Random rand=new Random();
	double max=39.4;
	for (int i=0; i<20; i++)
	{
		double suly=rand.nextDouble()*max+0.5;
		int felso=rand.nextInt(399)+1;
		int melyseg=rand.nextInt(399)+10;
		int fajszam=rand.nextInt(100);
		char c='c';
		if (fajszam<10) c='p'; //predator
		else c='n';
		Halak h=new Halak(suly, felso, melyseg, c, nev(c));
		H.add(h);
	}
}
public static String nev(char p) {
	int sorokszama=0;
	String sor=null;
	RandomAccessFile file;
	String filenev=null;
	int max=0;
	switch(p) {
		case 'p' : 
			filenev="forrasok/rag.txt";
			break;
		case 'n' : filenev="forrasok/nov.txt";
			break;
		default :
			break;
	}
	try {
		file=new RandomAccessFile(filenev,"r");
		for(sor=file.readLine(); sor!=null; sor=file.readLine())
		{
			sorokszama++;
		}
	}
	catch(IOException e) {
		e.getMessage();
	}
	max=sorokszama;
	Random rand=new Random();
	int index=rand.nextInt(max);
	try {
		file=new RandomAccessFile(filenev,"r");
		for(int i=0; i< index ; i++)
		{
			sor=file.readLine();
		}
	}
		catch(IOException e) {
			e.getMessage();
		}
	return sor;
}
public static void kiir(ArrayList<Halak> H) {
	String p=null;
	
	for (int i=0; i<H.size(); i++)
	{
		if (H.get(i).gettpredator()) p="ragadozó";
		else p="növényevõ";
		System.out.println(i+". : fajta:"+H.get(i).faj+" "+p+" súly: "+H.get(i).getweight()+" top: "+H.get(i).top+" depth: "+H.get(i).depth);
	}
	System.out.println(szamolragadozo(H)[0]+"db ragadozo és "+szamolragadozo(H)[1]+"db növényevõ");
	System.out.println("A legnagyobb súlyú hal adatai:");
	int index=maxWeightFish(H);
	System.out.println(index+". : fajta:"+H.get(index).faj+" "+p+" súly: "+H.get(index).getweight()+" top: "+H.get(index).top+" depth: "+H.get(index).depth);
	System.out.println(deepswim(H)+"db hal képes 110 cm mélyen úszni");
	Simulator(H);
}
public static int[] szamolragadozo(ArrayList<Halak> H) {
	int[] r= {0,0};   //elso index ragadozo
	for (int i=0; i<H.size(); i++)
	{
		if (H.get(i).predator) r[0]+=1;
	}
	r[1]=H.size()-r[0];
	return r;
}
public static int maxWeightFish(ArrayList<Halak> H) {
	int index=0;
	double suly=0;
	for (int i=0; i<H.size(); i++)
	{
		if(H.get(i).getweight()>suly) {
			index=i;
			suly=H.get(i).getweight();
	}
	}
	return index;
}
public static int deepswim(ArrayList<Halak> H) {
	int c=0;
	for (int i=0; i<H.size(); i++)
	{
		if(H.get(i).gettop()+H.get(i).getdepth()>=110) {
			c++;
	}
	}
	return c;
}
public static void Simulator(ArrayList<Halak> H) {
	
	Random rand=new Random();
	for (int kor=0; kor<100; kor++) {
		int i=0;
		char tipus='x';
		int rsorsz=0;
		while(tipus!='p') {
			i=rand.nextInt(H.size());
					if(H.get(i).predator) {
						tipus='p';
						rsorsz=i;
					}
					
		}
		int nsorsz=0;
		while(tipus!='n') {
			i=rand.nextInt(H.size());
					if(!H.get(i).predator) {
						tipus='n';
						nsorsz=i;
					}
		}
		Halak raghal=H.get(rsorsz);
		Halak novhal=H.get(nsorsz);
		if(
				(novhal.top>raghal.top && novhal.top<raghal.top+raghal.depth) ||
				(novhal.top+novhal.depth<raghal.top+raghal.depth && novhal.top+novhal.depth>raghal.top)
				) {
			System.out.println(rsorsz+". ragadozo sávja: "+raghal.top+"-"+(raghal.top+raghal.depth)+" cm. Jelenlegi sulya: "+raghal.getweight());
			System.out.println(nsorsz+". novényevõ sávja: "+novhal.top+"-"+(novhal.top+novhal.depth)+" cm. Jelenlegi sulya:"+novhal.getweight());
			int m=rand.nextInt(100);
			if (m<30) {
				raghal.sulyvaltozas(novhal.getweight());
				H.remove(novhal);
				System.out.println("A ragadozó megette a növényevõt. A ragadozó új súlya: "+raghal.getweight());
			}
			System.out.println("--------------------");
		}
	}
	System.out.println("A halak száma:"+H.size());
	System.out.println("A ragadozó halak összesen "+novosszsuly+"kg halat ettek meg");
	
}
}

