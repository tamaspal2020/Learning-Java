package egyeb;

public class EnumPassInMethod {

	public static void main(String[] args) {
		kiirszin(Colors.RED);
		Colors c=Colors.GREEN;;
		kiirszin(c);

	}
	public static void kiirszin(Colors c) {
		System.out.println(c.ordinal());
		System.out.println(Colors.values()[2]);
		System.out.println(c);
	}

}
enum Colors{
	RED, GREEN, WHITE;
	}
