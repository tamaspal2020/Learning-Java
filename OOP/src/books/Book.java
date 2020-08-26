package books;
import books.Main;

public class Book {
	private String writer;
	private String title;
	private int year;
	private int price;
	private static enum genre {  mese, reg�ny, t�rt�nelem, szakk�nyv, k�lf�ldi }
		 
	public Book(String writer, String title, int year, int price, Main.genre g) {
		this.writer=writer;
		this.title=title;
		this.year=year;
		this.price=price;			
	}
	public int getPrice() {
		return this.price;
	}
	public String getwriter() {
		return this.writer;
	}
	public String gettitle() {
		return this.title;
	}
	public int getyear() {
	
			return this.year;
		}
	
}
