import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scan.nextInt();
		System.out.println("Enter the second number :");
		int b = scan.nextInt();
		
		for(int i=a;i<=b;i++) {
//			System.out.println(i);
			
			
//			i%3==0 && i%5==0  ----> simplified version i%15==0 
			if(i%15==0) {   
				System.out.println(i);	
			}
//			Find even number between two numbers
			
//			System.out.println(i%2==0?i:"");
		}
	}

}
