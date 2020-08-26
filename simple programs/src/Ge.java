
public class Ge {

	public static void main(String[] args) {
		String a="sdfgs";
		boolean b=true;
		int c=4234;
		Gene<String , Boolean, Integer> genetest=new Gene<>(c);
		System.out.println(Gene.fug2(456));
		System.out.println(genetest.fug2(500));

	}

}

class Gene<U, T, E>{
	
	private E b;
	public Gene(E u) {
		
		this.b=u;
	}
	public  <C> C fug(C p) {    
		C k=p;		
	
		return k;
	}
	public  static<C> C fug2(C p) {    
		C k=p;		
	
		return k;
	}
}