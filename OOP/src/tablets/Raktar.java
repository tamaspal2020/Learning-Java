package tablets;
import java.util.HashSet;
import tablets.Tablet;
public class Raktar {
	
HashSet<Tablet> lista=new HashSet<Tablet>();

public void tabletAddToList(Tablet t) {
	if (!lista.contains(t) && t!=null) {
		lista.add(t);
	}
}
public int db() {
	return lista.size()+1;
}
public void deleteTablet() {
	
}
}

