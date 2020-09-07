package egyeb;

public class EqualsDemo {

	public static void main(String[] args) {
		Mobile m1=null;
		Mobile m2=null;
		Mobile m3=null;
		Mobile m4=null;
		boolean boo=true;
		try{
		m1=createMobile(64554);
		m3=createMobile(64563546);
		m2=createMobile("sfgsfg");
		
		}
		catch(BooleanInsteadofnNumberException e){
			System.out.print("BooleanInsteadofnNumberException catched");
		}
		catch(StringInsteadofnNumberException e){
			System.out.print("StringInsteadofnNumberException catched");
		}
		
		
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
	public static Mobile createMobile(Object o) throws StringInsteadofnNumberException, BooleanInsteadofnNumberException {
		Mobile m=null;
		if(o instanceof Integer) {
			Integer szam=(Integer)o;
			m=new Mobile(szam);
		}
		if(o instanceof String) {
			throw new StringInsteadofnNumberException("ez egy String");
		}
		if(o instanceof Boolean) {
			throw new BooleanInsteadofnNumberException("ez egy boolean");
		}
		return m;
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

class StringInsteadofnNumberException extends Exception {
	StringInsteadofnNumberException(String szoveg){
		super(szoveg);
	}	
}


