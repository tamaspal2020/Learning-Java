package auto;
import auto.Auto;
import java.util.ArrayList;

public class AutoLista<E> extends ArrayList<Auto> {     ///E, generic types etc


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean containsThatLicencePlate(String s) {
		String rendsz=s;
		for(int i=0; i<this.size(); i++) {
			if (this.get(i).getRendszam()==rendsz) return true;
		}
		return false;
	}

}
