package codeforce;
import java.util.Scanner;
public class BoboniuPlaysChess {
	 public static void Cy(int o1, int o2, int i1, int i2, int i3, int i4,  int t) {
		 for(int i=o1; i<o2; i++) {
				if(t%2==0) {
					for(int j=i1; j>i2; j--) {
						System.out.println(i+" "+j);
					}
				}
				if(t%2==1) {
					for(int j=i3; j<i4; j++) {
						System.out.println(i+" "+j);					
					}
				}
				t++;
			}
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sx=sc.nextInt();
		int sy=sc.nextInt();
		int turns=0;
		int d=0;
		Cy(sx, (n+1), sy, 0,1, sy+1, turns);
		/*for(int i=sx; i<n+1; i++) {
			if(turns%2==0) {
				for(int j=sy; j>0; j--) {
					System.out.println(i+" "+j);
				}
			}
			if(turns%2==1) {
				for(int j=1; j<sy+1; j++) {
					System.out.println(i+" "+j);					
				}
			}
			turns++;
		}*/
		if(turns%2==0) {
			for(int j=sy+1; j<m+1; j++) {
				System.out.println(n+" "+j);					
			}
		}
		if(turns%2==1) {
			for(int j=sy+1; j<m+1; j++) {
				System.out.println(n+" "+j);					
			}
		}
		turns=0;
		
		for(int i=n-1; i>0; i--) {
			if(turns%2==0) {
				for(int j=m; j>sy; j--) {
					System.out.println(i+" "+j);
				}
			}
			if(turns%2==1) {
				for(int j=sy+1; j<m+1; j++) {
					System.out.println(i+" "+j);					
				}
			}
			turns++;
		}
		if(turns%2==0) {
			for(int j=sy; j>0; j--) {
				System.out.println(1+" "+j);					
			}
		}
		if(turns%2==1) {
			for(int j=sy; j>0; j--) {
				System.out.println(1+" "+j);					
			}
		}
		turns=0;
	
		for(int i=2; i<sx; i++) {
			if(turns%2==0) {
				for(int j=1; j<sy+1; j++) {
					System.out.println(i+" "+j);
				}
			}
			if(turns%2==1) {
				for(int j=sy; j>0; j--) {
					System.out.println(i+" "+j);					
				}
			}
			turns++;
		}
	}

}
