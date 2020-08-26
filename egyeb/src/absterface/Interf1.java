package absterface;

public class Interf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a =new A();
			a.kiir();
			a.write();
			D d =new D();
			d.waitingAorC(a);
			C c=new C();
			d.waitingAorC(c);
			Inter1 X=new A();
			a.ujfv();
			System.out.println(a.n);
			
	}
	
}

interface Inter1 {
	void kiir();
}

interface Inter2 {
	void kiir();
	void ujfv();
}


class A  extends B implements Inter1, Inter2 , B.BInnerInter{
	public static int n=123;
	public void kiir() {
		System.out.println("***111***");
		super.kiir();
	}
	public int nynum() {
		return 55;
	}
	public void write() {
		System.out.println("***BInnerInter***");
	}
	public void ujfv() {
		
		System.out.println("This method was in Inter2");
	}
	
}

class B {
	
		void kiir() {
			System.out.println("IN B");
		}
		interface  BInnerInter{
			int nynum();	
		}
		
}


class C  implements  B.BInnerInter{

	public int nynum() {
		return 300;
	}

}
class D{
	public void  waitingAorC(B.BInnerInter b) {
		System.out.println(b.nynum());
	}
}





