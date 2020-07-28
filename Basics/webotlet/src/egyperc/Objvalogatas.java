package egyperc;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Objvalogatas {
public static ArrayList<String> reszek=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reszek();
		feltolt();
	}
public static void reszek() {
	RandomAccessFile raf;
	String sor;
	 ArrayList<String> tmp_reszek=new ArrayList<String>();
	try {
		raf=new RandomAccessFile("forrasok/noveny.txt", "r");
		for(sor=raf.readLine(); sor!=null; sor=raf.readLine())
		{
			int elsopontosvesszoindexe=0;
			int masodikpontosvesszoindexe=0;
			boolean elso=false;
			boolean masodik=false;
			
			for(int j=0;j<sor.length();j++) {
				if(sor.charAt(j)==';' && elso==false) {
					elsopontosvesszoindexe=j; elso=true;
					
					
				}
				if(sor.charAt(j)==';' && masodik==false && j!=elsopontosvesszoindexe) {
					masodikpontosvesszoindexe=j;  masodik=true;
			}
				
			}				
			String resz=sor.substring(elsopontosvesszoindexe+1, masodikpontosvesszoindexe);
			tmp_reszek.add(resz);
		}
	}
	catch(IOException e) {
		e.getMessage();
	}
	 for(int i=0;i<tmp_reszek.size();i++) {  /// csak egyszer legyen a rész a tömbben
	    	String szo=tmp_reszek.get(i);
	    	if(!reszek.contains(szo)) {
	    		reszek.add(szo);
	    	}
	    }
	 for(int i=0;i<reszek.size();i++) {
	    	System.out.println(reszek.get(i));;
	    }
	 // rendezés
	 for(int i=reszek.size();i>0; i--) {  /// csak egyszer legyen a rész a tömbben
		 for(int j=0;j<i-1;j++) {  /// csak egyszer legyen a rész a tömbben
			 System.out.println(reszek.get(j).compareTo(reszek.get(j+1)));
			 	if (reszek.get(j).compareTo(reszek.get(j+1))>0) {
			 		String csere=reszek.get(j+1);
			 		reszek.set(j+1, reszek.get(j));
			 		reszek.set(j, csere);
			 		
			 	}
		     }
	 }

	 for(int i=0;i<reszek.size();i++) {
		 String s=reszek.get(i);
		 s=s.substring(0,1).toUpperCase()+s.substring(1,s.length());
		 reszek.set(i, s);
	    }
	 for(int i=0;i<reszek.size();i++) {
	    	System.out.println(reszek.get(i));;
	    }
}
public static void feltolt() {
	System.out.println("---------------------------------");
	for(int i=0;i<reszek.size();i++) {
		 RandomAccessFile raf;
			String sor;
			
			System.out.println(reszek.get(i));
			try {
				raf=new RandomAccessFile("forrasok/noveny.txt", "r");
				for(sor=raf.readLine(); sor!=null; sor=raf.readLine())
				{
					
					int  elsovesszo=sor.indexOf(";");
					int masodikvesszo=sor.indexOf(";", elsovesszo+1);
					
					String egysor=sor.substring(elsovesszo+1, masodikvesszo);
					
			if(reszek.get(i).equalsIgnoreCase(egysor)) {
				String kiiras=sor;
				String szov1=kiiras.substring(0,elsovesszo);
				String szov2=kiiras.substring((masodikvesszo),(kiiras.length()));
				System.out.println("\t"+szov1+szov2);
			}
					
				
				}
				raf.close();
		   }
			catch(IOException e) {
				e.getMessage();
			}
	}
}
}
