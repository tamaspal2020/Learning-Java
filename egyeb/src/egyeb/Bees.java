package egyeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//flowers in circles arond the hive different distances, differenct colors
///  on bee collect only one color, and fly only max d distance from the hive
public class Bees {
	public static void main(String[] args) throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 	
	   String flowers=br.readLine();
	   String value="";
	   Map<Integer, String> colorsatdistances=new HashMap<>();
	   for(int i=0; i<flowers.length()-1; i+=2) {
		   int d=Character.getNumericValue(flowers.charAt(i));		   
		   ;
		   if(!colorsatdistances.containsKey(d)) {
			   value+=String.valueOf(flowers.charAt(i+1));
				System.out.println(value+ "," +d);
		 colorsatdistances.put(d, value);   ///rendezni kell a színeket majd
		   }
		   else {
			   for (Map.Entry<Integer, String> entry : colorsatdistances.entrySet()) {
				   System.out.println(entry.getKey()+","+d);
				    if(entry.getKey()==d) {
				    	value=entry.getValue()+String.valueOf(flowers.charAt(i+1));
				    	System.out.println(value);
				    	colorsatdistances.put(d, value);
				    	}		   
			} 
		   }			   
		 }
	   for (Map.Entry<Integer, String> entry : colorsatdistances.entrySet()) {
		    int key = entry.getKey();
		    String s = entry.getValue();
		    System.out.println(key+":"+s);	   
	}
}
}
class Bee{
	int distance;
	char color;
}
class Color{		
}

