package generics;

public class GenClass {

	public static void main(String[] args) {
		Glass g=new Glass();
		Juice j=new Juice();
		g.liquid=j;
		Glass2 g2=new Glass2();
		g2.liquid=j;
		//Juice j3=g2.liquid;   Cannot convert Object to Juice
		//Juice j3=(Juice)g2.liquid;   We have to cast it
		Glass3<Juice> g3=new Glass3<>();
		g3.liquid=new Juice();
		Juice j4=g3.liquid;
		Glass3<Water> g4=new Glass3<>();   //the class is generic, we can specify the type here
		g4.liquid=new Water();
	}
}

class Juice{	
}
class Glass{
	public Juice liquid;	
}
class Glass2{
	public Object liquid;	 // trying to make a generic class, not perfect
}
class Glass3<T>{
	public T liquid;	 // Solution is Generics
}
class Water{
	
}


