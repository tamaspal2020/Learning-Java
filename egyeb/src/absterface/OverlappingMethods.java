package absterface;

public class OverlappingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axyz1 a=new Axyz1();
		Bxyz1 b=new Bxyz1();
		Cxyz1 c=new Cxyz1();
		c.kiir(((Xyz1)a));
		
	}

}
interface Interxyz1{
	void print();
}
interface Interxyz2{
	void print();
}
interface Xyz1  extends Interxyz1,Interxyz2 {
	
}
class Axyz1 extends Bxyz1 implements Xyz1{
	public void print() {
		System.out.println("1111111111111");
	}
}
class Bxyz1 implements Interxyz2{
	public void print() {
		System.out.println("22222222222222");
	}
}
class Cxyz1 {
	public void kiir(Xyz1 x) {
		((Axyz1)x).print();
		((Bxyz1)x).print();
	}
}

