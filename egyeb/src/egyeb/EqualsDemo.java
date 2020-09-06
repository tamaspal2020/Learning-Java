package egyeb;

public class EqualsDemo {

	public static void main(String[] args) {
		Mobile m1=new Mobile(426964387);
		Mobile m2=new Mobile(426964387);
		Mobile m3=null;
		Mobile m4=null;
		
		if(m1==m2) {
			System.out.println("These mobiles are the same");
		}
		else {
			System.out.println("They are not the same");
		}
		if(m1.equals(m2)) {
			System.out.println("These mobiles are the same");
		}
		else {
			System.out.println("They are not the same");
		}	
		if(m3==m4) {
			System.out.println("These mobiles are the same");
		}
		else {
			System.out.println("They are not the same");
		}
	}
}
class Mobile{
	public int phonenumber;

	public Mobile(int phonenumber) {
		super();
		this.phonenumber = phonenumber;
	}
	@Override
	public boolean equals(Object o) {
		Mobile m=(Mobile)o;
		if(this.phonenumber==m.phonenumber) {
			return true;
		}
		return false;
	}
	public boolean equals(Mobile m) {				    /// no @Override annotation because this is not overriding, this is overloading
		if(this.phonenumber==m.phonenumber) return true;
		return false;
	}	
}

