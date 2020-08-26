package generics;

public class Genmet {

	public static void main(String[] args) {
		Bartender B=new Bartender();
		Juice2 j=new Juice2();
		Water2 w=new Water2();
		BarGlass<Cocktail> BG=new BarGlass<>(); 
		BG.liquid=B.<Juice2, Water2>mix(j,w);
		
		BG.liquid=B.mix(j,w);  // it works too
	}

}
class Bartender{
	public <J,W> Cocktail mix(J juice, W water) {
		return new Cocktail();
	}
	public <J, W>void  mix2(J juice, W water){
		
	}
	public static <J, W>void  mix3(J juice, W water){
		
	}
}
class Cocktail{}
class Juice2{}
class Water2{}
class BarGlass<T>{
	public T liquid;
}