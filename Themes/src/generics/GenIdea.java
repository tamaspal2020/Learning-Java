package generics;

import java.util.ArrayList;

public class GenIdea {

	public static void main(String[] args) {
		Container<Car> autok=new Container<>();
		Container<Truck> teherautok=new Container<>();
		Container<Food> etelek=new Container<>();
		Container<People> emberek=new Container<>();
		
		Car Volvo = new Car();
		Car Fiat = new Car();
		Car Porsche = new Car();
		autok.cont.add(Porsche);
		autok.cont.add(Fiat);
		autok.cont.add(Fiat);
		Food Melon=new Food();
		Food Burger=new Food();
		etelek.cont.add(Burger);
		etelek.cont.add(Melon);
		
		Container2<Car, Truck, Food> mixedcontainer=new Container2<>();   //we need both constructors for container2 to avoid error

	}
}


class Container<T>{
	public ArrayList<T> cont;
}
class Container2<C, T, F>{
	public Container2() {};
	public Container2(C car, T truck , F food){    ///constructor for generic class with three type parameter
		
	}
	public Container<Car> autokc2=new Container<>();
	Container<Truck> teherautokc2=new Container<>();
	Container<Food> etelekc2=new Container<>();
}
class Car{}
class Truck{}
class Food{}
class People{}