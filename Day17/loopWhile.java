import java.util.Scanner;

public class loopWhile {

	public static void whileLoop(int n) {
		int i =1;
		while(i<=n) {
			System.out.println(i+ ". GuNa");
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count !");
		int n = scan.nextInt();
		
		whileLoop(n);

	}

}
