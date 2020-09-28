package egyeb;

public class MaximuminTable {
static	int a=0;
static 	int b=0;
static 	int c=0;
static int x=1;
	public static void main(String[] args) {
		add(10);
		System.out.println(a+","+b);
	}
public static void add(int i) {
	if(i==0) {
		System.out.println("ok");
	}
	else {
		a+=x;;
		b+=a;
		i--;
		x++;
		System.out.println(i+":"+a+","+b);
		add(i);		
	}
}
}
