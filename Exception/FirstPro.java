import java.util.Scanner;

class alpha{
	void function() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Connection Est4");
			System.out.println("Eneter numerator");
			int a = scan.nextInt();
			System.out.println("Enter denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
			System.out.println("Connection ter4");
		
		
	}
}

class beta{
	void process() {
		System.out.println("Connection est3");
		alpha a = new alpha();
		a.function();
		System.out.println("connection ter3");
	}
}

class gamma{
	void method() {
		System.out.println("Connection est2");
		try {
			beta b = new beta();
			b.process();
		}catch(Exception e) {
			System.out.println("Invalid input");
		}
		System.out.println("Connection ter2");
	}
}



public class FirstPro {

	public static void main(String[] args) {
		
		System.out.println("Connection est1");
		gamma g = new gamma();
		g.method();
		System.out.println("Connection ter1");
		

	}

}
