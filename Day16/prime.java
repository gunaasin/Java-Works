import java.util.Scanner;

public class prime {
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2 ; i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		
		if(isPrime(n)) {
			System.out.println("is Prime");
		}else {
			System.out.println("not a prime");
		}

	}

}
