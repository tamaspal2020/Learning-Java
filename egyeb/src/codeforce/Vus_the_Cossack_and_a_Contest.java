package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Vus_the_Cossack_and_a_Contest {
	public static void main(String[] args) throws IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String[] y=x.readLine().split(" ");
        System.out.println(((Integer.parseInt(y[1])>=Integer.parseInt(y[0]))&&(Integer.parseInt(y[2])>=Integer.parseInt(y[0])))?"Yes":"No");
	}

}
