import java.util.Scanner;

public class prime3 {
	static boolean isPrime(int n) {

		if(n<=1) {
			return false;
		}
		for(int i=2;i<n/2;i++) { 
			if(i%n==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	static void nPrime(int n) {
		int number =2; // Start the number 2 
		int count =0; // Every time is prime to increase the count value
		
		while(count<n) {  // once hit the count < user input to stop the loop !
			
			if(isPrime(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		nPrime(n);

	}

}
