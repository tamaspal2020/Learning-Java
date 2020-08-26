package egyeb;
import java.util.ArrayList;
public class szavakvissza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="egy kettõ három négy öt";
		System.out.println(a.lastIndexOf(" "));
		System.out.println(a.indexOf(" "));
		System.out.println(vissza(a));
		
		
		
		
	}
	public static  String  vissza(String mondat ) {
		String m=mondat;
		String m2="";
		ArrayList<String> tomb = new ArrayList<String>();
		int utolso=m.lastIndexOf(" ");
		int kovetkezo=m.indexOf(" ");
		int elso=0;
		String utolsoketto="";
		int ok =0;
		while(ok==0) {
			String elem=m.substring(elso, kovetkezo);
			tomb.add(elem);
			m=m.substring(kovetkezo+1);
			utolso=m.lastIndexOf(" ");
			kovetkezo=m.indexOf(" ");
			utolsoketto=elem;
			if (kovetkezo==m.lastIndexOf(" ")) ok=1;
		}
		String ujszo=m;
		String ue=ujszo.substring(0, ujszo.indexOf(" "));
		tomb.add(ue);
		tomb.add(m.substring((m.indexOf(" ")+1)));
		ArrayList<String> vtomb = new ArrayList<String>();
		for (int i=0; i<tomb.size(); i++) {
			vtomb.add(i, "a");
		}	
		System.out.println(vtomb.size());
		System.out.println(tomb.size());
		for (int i=tomb.size(); i>0; i--) {
			vtomb.set(vtomb.size()-i, tomb.get(i-1));
		}	
		for (int i=0; i<tomb.size(); i++) {
			m2+=vtomb.get(i)+" ";
		}		
		
		return m2;
	}

}
