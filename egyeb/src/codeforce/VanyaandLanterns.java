package codeforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VanyaandLanterns {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=s.nextInt();
		Set<Double> lanterns=new TreeSet<>();
		for(int i=0; i<n; i++) {
			Double e=s.nextDouble();
			lanterns.add(e);
		}		
		ArrayList<Double> lampak=new ArrayList<>(lanterns);	
		if(lampak.size()>1) {
		if(!lanterns.contains(0d)) lampak.add(lampak.get(0)*-1);	
		if(!lanterns.contains(Double.valueOf(l))) lampak.add(lampak.get(lampak.size()-2)+ (Double.valueOf(l)-lampak.get(lampak.size()-2))*2 )   ;
		Collections.sort(lampak);	
		double maxd=-1;		
		for(int i=0; i<lampak.size()-1; i++) {
		 			maxd=Math.max(maxd,Math.abs(lampak.get(i+1)-lampak.get(i)));
			}	
		s.close();
		System.out.println(maxd/2);
		}
		else {
			if(lampak.get(0)==0 || lampak.get(0)==Double.valueOf(l) ) {
				System.out.println(Double.valueOf(l));
			}
			if (lampak.get(0)>0 && lampak.get(0)<=Double.valueOf(l) ) {				
				Double n1=lampak.get(0);
				Double n2=Math.abs(Double.valueOf(l)-lampak.get(0));				
				double tav=0;
				if (n1>n2 || n1==n2) tav=n1;
				if (n2>n1) tav=n2;
				System.out.println(tav);
			}
		}
	}


}
