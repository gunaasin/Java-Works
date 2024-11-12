import java.util.Scanner;

class module{
	void works() throws Exception{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
	}
}
public class Therdpro {
	public static void main(String[] tcs) {
		module m = new module();
		try {
			m.works();
		}catch (Exception e) {
			System.out.println("Exception is accor");
//			System.out.println(e);
		}
		
	}
}
