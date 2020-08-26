package books;
import java.util.ArrayList;

import books.Book;

public class Shelf {
	public  ArrayList<Book> lista = new ArrayList<Book>();
	
	public Shelf() {
		
	}
	public void addABookToTheShelf(Book book) {
		Book b;
		b=book;
		lista.add(b);
	}
	public int priceOfAllBooks() {
		int sum=0;
		for(int i=0;i<lista.size(); i++) {
			sum+=lista.get(i).getPrice();
		}
		return sum;	
	}
	public ArrayList<Book> searchWorksOfAnAuthor(String name){
		ArrayList<Book> works=null;
		for(int i=0;i<lista.size(); i++) {
			if (lista.get(i).getwriter()==name) works.add(lista.get(i));	
		}
		return works;
	}
}
	
	

