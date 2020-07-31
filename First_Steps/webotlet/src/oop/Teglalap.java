package oop;

public class Teglalap {
	public  int x;
	public  int y;
	public int width; 
	public int height;

public  Teglalap(int x, int y, int w, int h) {
	this.width=w;
	this.height=h;
	this.y=y;
	this.x=x;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teglalap t1=new Teglalap(2,10, 10, 5);
		Teglalap t2=new Teglalap(3,8, 10, 5);
		System.out.println(atfed(t1,t2));
		
	}
public  static  boolean atfed(Teglalap t1, Teglalap t2) {
	boolean belelog=false;
	if  ( 
	(((t2.x>t1.x) && (t2.x<t1.x+t1.width)) && (t2.y<t1.y && (t2.y>t1.y-t2.height)))  ||
	(((t2.x+t2.width>t1.x) && (t2.x+t2.width<t1.x+t1.width)) && t2.y<t1.y && (t2.y>t1.y-t2.height)) ||
	(((t2.x>t1.x) && (t2.x<t1.x+t1.width)) && t2.y-t2.height<t1.y && (t2.y-t2.height>t1.y-t2.height)) ||
	(((t2.x+t2.width>t1.x) && (t2.x+t2.width<t1.x+t1.width)) && t2.y-t2.height<t1.y && (t2.y>t1.y-t2.height))
	)
		belelog= true;
	
	return belelog;
	
}
	
}
