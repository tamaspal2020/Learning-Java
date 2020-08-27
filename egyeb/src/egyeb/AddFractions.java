package egyeb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set; 
public class AddFractions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<4; i++){
			}
		}
}

class Fract{
	public boolean recognizeFract(String s) {
		boolean fract=false;
		char[] ch=s.toCharArray();
		Set<Character> chset=new HashSet<>();
		for(int i=0; i<ch.length;i++) {
			chset.add(ch[i]);
		}
		if(chset.contains('/')){
			Iterator<Character> it=chset.iterator();
			int j=0;
			while(it.equals('/')) j++;
				
			}
		return fract;
	}
}

