import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mothly Income to Check ScolerShip Available or Not.");
		int n = scan.nextInt();
		
		
		System.out.println(n<=7000?"yes":"No");
		
		
		if(n<=7000) {
			System.out.println("ScolerShip is Available :)");
		}else {
			System.out.println("ScolerShip is not Available :(");
		}
	}

}
