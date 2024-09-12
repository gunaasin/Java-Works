import java.util.Scanner;

public class missingNumber {
	
	
	public static void findMissingNumber(int[] arr) {
		int n = arr.length+1;
		
		int sum1 = n*(n+1)/2;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum2 +=arr[i];
		}
		
		System.out.println(sum1-sum2);
	}
	public static void main(String[] array) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		findMissingNumber(arr);
	}
}
