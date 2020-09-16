package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
public class Benches {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(x.readLine());
		 int m=Integer.parseInt(x.readLine());		
		 List<Integer> b=new ArrayList<>();		
		 for(int i=0; i<n; i++) {		
			 b.add(Integer.parseInt(x.readLine()));
		 }		
		 Collections.sort(b);		 		
		 SortedSet<Integer> b2=new TreeSet<>();		  
		 int min=b.get(b.size()-1);			 
			int max=min+m;
			 for(int i=0;i<m;i++){					 
				 b.set(0, (b.get(0)+1));
				 Collections.sort(b);				 		
				 b2.addAll(b);				
			 }		 
		 System.out.println(((m<min-b.get(0))?min:b2.last())+" "+max) ;
		 }
}

