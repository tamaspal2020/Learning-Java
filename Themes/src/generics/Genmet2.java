package generics;

public class Genmet2 {
public static void main(String[] args) {
	Shapes s=new Shapes();
	Circle c=new Circle();
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	House h=new House();
	Dog d=new Dog();
	Line l=new Line();
	s.drawTwoShapes(c, r);
	s.<House, Dog>drawTwoShapes(h, d);
	s.drawTwoShapes(h, d);   // both are good
}

}

class Shapes{
	public <S, T> void drawTwoShapes(S shape1, T shape2) {
		String t=shape1.getClass().toString();
		Class<? extends Object> t2=shape2.getClass();
		System.out.println("Im drawing two shapes: "+String.valueOf(t)+" and "+ String.valueOf(t2));
	}
	
}
class Circle{}
class Rectangle{}
class Triangle{}
class House{}
class Dog{}
class Line{}