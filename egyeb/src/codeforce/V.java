package codeforce;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class V {
	public static void main(String[] args) throws IOException {
		 BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		 int b=Integer.parseInt(x.readLine());
		 int c=Integer.parseInt(x.readLine());
		 int d=Integer.parseInt(x.readLine());  
		 int s=6;
		 System.out.println((1+(((b>d&&c>d))?d:(b<=d&&c>d)?b:(b<d&&c<d)?b+c-d:c)));		 
	}	
}
