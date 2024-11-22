import java.util.Scanner;

class auto{
	void process() throws Exception {
		try {
			System.out.println("Connection est2");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter numerator");
			int a = scan.nextInt();
			System.out.println("Enter denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		
		}catch(Exception e) {
//			System.out.println("Enter non-zero denominator");
			throw e;
		}
	
		finally {
			System.out.println("Connection ter2");
		}
		
	}
}



public class SecondPro {

	public static void main(String[] args) {
		
		System.out.println("Connection est1");
		auto a = new auto();
		try {
			a.process();	
		}catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("Connection ter2");
		
		
	}

}
