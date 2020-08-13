package absterface;

public class NameColnflicts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

interface Interface1{
	void number();
}

interface Interf2{
	void number();
}

class An  implements Interface1, Interf2{
	public int num=0;
	public An() {
		
	}
	public void  number() {
		System.out.println(num);
		
	}

}

