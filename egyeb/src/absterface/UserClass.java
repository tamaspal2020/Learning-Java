package absterface;

public class UserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		startIt(c1);
		startIt(c2);
	}
	public static void startIt(Abs1 a) {
		a.go();
	}
}
