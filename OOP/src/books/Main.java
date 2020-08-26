package books;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

import books.Book;
import books.Shelf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shelf shelf=new Shelf();
		shelfInit(shelf);
		showAllBooks(shelf);
	}
public static Random rand=new Random() ;
public static enum genre {  mese, regény, történelem, szakkönyv, külföldi }

public static void shelfInit(Shelf shelf) {
	Book b=null;
	for (int i=0; i<40;  i++) {
		int evszam=rand.nextInt(100)+1900;
		b=new Book(writerName(), givetitle(), evszam, (rand.nextInt(10000)+500), genre.values()[rand.nextInt(4)]);
		shelf.addABookToTheShelf(b);
	}
	
}
public static String writerName() {
	String name=null;
	
	RandomAccessFile raf;
	String sor=null;
			try {
				raf=new RandomAccessFile("forrasok/writers.txt", "r");
				for(int i=0; i<rand.nextInt(10)+1; i++)
				{
					sor=raf.readLine();
				}
				raf.close();
			}
	catch(IOException e) {
		e.getMessage();
	}
		
	return sor;
}
public static String givetitle() {
	String name=null;
	RandomAccessFile raf;
	String sor=null;
			try {
				raf=new RandomAccessFile("forrasok/titles.txt", "r");
				for(int i=0; i<rand.nextInt(9)+1; i++)
				{
					sor=raf.readLine();
				}
				raf.close();
			}
	catch(IOException e) {
		e.getMessage();
	}
		
	return sor;
}
public static void showAllBooks(Shelf S) {
	
	for (int i=0; i<S.lista.size(); i++) {
		System.out.println(i+".");
		System.out.println("Writer: "+S.lista.get(i).getwriter());
		System.out.println("Title:"+S.lista.get(i).gettitle());
		System.out.println("Year"+S.lista.get(i).getyear());
		System.out.println("Price:"+S.lista.get(i).getPrice());
		System.out.println("------------------");
	}
}
}
