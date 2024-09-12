import java.util.Scanner;

public class methodOverloading1 {
	
	public static void add(int a ,int b) {
		System.out.println(a+b);
	}
	public static void add(int a ,float b , double c) {
		System.out.println(a+b);
	}
	public static void add(int a ,double b) {
		System.out.println(a+b);
	}
	public static void add(int a ,byte b) {
		System.out.println(a+b);
	}
	public static void add(float a ,int b) {
		System.out.println(a+b);
	}
	public static void add(double a ,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
//		int a = scan.nextInt();
		float a = scan.nextFloat();
		int b= scan.nextInt();
		add(a,b);
	}

}
