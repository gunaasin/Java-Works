import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scan.nextInt();
		System.out.println("Enter the second number :");
		int b = scan.nextInt();
		
		for(int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}

}
