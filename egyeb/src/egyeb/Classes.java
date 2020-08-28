package egyeb;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.otherclass.kiir(200);
	}

}

class A{
public A() {
	
}	
void kiir(int i){
	System.out.println(i+10);
}
}

class B{
	A otherclass=new A();
}


