package absterface;

public class DefMet {

	public static void main(String[] args) {
		AA a =new AA();
		BB b =new BB();
		a.print2();
		b.print2();
		a.print3();
		b.print3();
		Ddd d =new Ddd();
		d.print3();
	}

}
interface Abb{
	void print();
	default void print2() {
		System.out.println("print 222222222222");
	}
	default void print3() {
		System.out.println("print 333333333333333333333");
	}
}
class AA implements Abb{
	public void print() {
		System.out.println("AAAAAA");
	}
	
}

class BB implements Abb{
	public void print() {
		System.out.println("BBB");
	}
	public void print3() {
		System.out.println("Now B is printing 333333333");
	}
	
}
class Ccc implements Abb{
	public void print() {
		System.out.println("CCC");
	}
}

class Ddd extends Ccc{
	
}
