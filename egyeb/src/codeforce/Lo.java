package codeforce;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;
	import java.util.StringTokenizer;
	public class Lo {
		public static void main(String[] args) throws IOException {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int sum1=0; 
			int sum2=0; 
			int sum3=0;
			int sum4=0;
			int sum5=0;
			int sum6=0;
			int sum7=0;
			int sum8=0;
			int sum9=0;		
			int y=0;
			for(int i=0; i<3; i++) {
				String s=br.readLine();
				StringTokenizer st = new StringTokenizer(s);
				 while (st.hasMoreTokens()) {
					 int x=Integer.valueOf(st.nextToken());
					 if(x%2!=0)
					 {
						 if(Arrays.asList(0,1,3).contains(y)) {sum1+=x;}
						 if(Arrays.asList(1,0,2,4).contains(y)) {sum2+=x;}
							if(Arrays.asList(2,1,5).contains(y)) {sum3+=x;}
							if(Arrays.asList(0,3,4,6).contains(y)) {sum4+=x;}
							if(Arrays.asList(1,3,4,5,7).contains(y)) {sum5+=x;}
							if(Arrays.asList(2,4,5,8).contains(y)) {sum6+=x;}
							if(Arrays.asList(3,6,7).contains(y)) {sum7+=x;}
							if(Arrays.asList(7,6,4,8).contains(y)) {sum8+=x;}
							if(Arrays.asList(8,7,5).contains(y)) {sum9+=x;}
					 }
					 y++;
			     }				
			}			
			kiir(paros(sum1));
			kiir(paros(sum2));
			kiir(paros(sum3));
			System.out.println();
			kiir(paros(sum4));
			kiir(paros(sum5));
			kiir(paros(sum6));
			System.out.println();
			kiir(paros(sum7));
			kiir(paros(sum8));
			kiir(paros(sum9));					
}
		public static boolean paros(int e) {
			return (e%2==0) ? true : false;
		}		
		public static void kiir(boolean b) {
			System.out.print(b ?  1 : 0);		
		}
}
