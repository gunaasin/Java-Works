import java.util.Scanner;

public class firstOneIsPrimeThenPrintThePair {

	public static boolean prime(int n) {
		if(2>n) {
			return false;
		}
		for (int i = 2; i*i <=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void firstPrimeindexWillPrime(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(prime(arr[i])) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]= scan.nextInt();
		}
		
		firstPrimeindexWillPrime(ar);
		

	}

}
