import java.util.Scanner;

public class loopDoWhile {

	public static void doWhileLoop(int g) {
		int i =5;
		do {
			System.out.println(i);
			i++;
			
		}while(i<=g);
	}
	
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n =c.nextInt();
		
		doWhileLoop(n);
	}

}
