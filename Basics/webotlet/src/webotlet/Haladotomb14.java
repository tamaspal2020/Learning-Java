package webotlet;

public class Haladotomb14 {
	public static int[][] tomb=new int[5][5] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tf();
	
}
public static void tf() {
	int min=0; int max=4;
	for(int i=0; i<tomb.length; i++) {			
		for(int j=0; j<tomb.length; j++) {			
			if(i==j) tomb[i][j]=0;
			if (i<j) tomb[i][j]=(min + (int) (Math.random() * (max - min)))*2;
			if (i>j) tomb[i][j]=((min + (int) (Math.random() * (max - min)))*2)+1;
				System.out.print(tomb[i][j]);
		}
		System.out.println();
	}
}
}
