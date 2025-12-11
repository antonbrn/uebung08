package h1;

public class H1_main {
	
	public static void main(String[] args) {
		Bruch a = new Bruch(15, -25);
		Bruch b = new Bruch(-3, 5);
		System.out.println("" + a.hasSameValueAs(b));
	}
}
