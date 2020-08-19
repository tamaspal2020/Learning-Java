package generics;

public class GenericMethodExample {

	public static void main(String[] args) {
		int a=3;
		double b=44.3453;
		float f=1000;
		System.out.println(osszead(a,b));
		System.out.println(osszead(f,a));
		System.out.println(osszead(f,b));
		

	}
 static <T extends Number> double  osszead(T a, T b){
	double r=a.doubleValue()+b.doubleValue();	
			return r;
	
}
}
