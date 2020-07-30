package oop;

public class Phone {
private int egyseg;

public int getegyseg(){
	return egyseg;
	}
public void setegyseg(int i){
	this.egyseg=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone();
		p.setegyseg(10);
		System.out.println(p.getegyseg());
	}

}
