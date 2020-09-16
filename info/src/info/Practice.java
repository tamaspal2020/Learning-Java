package info;

import java.io.File;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) throws IOException {
		File file=new File("forras/sorok.txt");
		if (file.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
	}
	public static void writetoFile(String s) {
		 
	}
	
}
