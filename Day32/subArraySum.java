import java.util.Scanner;

public class subArraySum {
	
	public static void findSubArraySum(int[] arr,int k) {
		for (int i = 0; i <= arr.length-k; i++) {
			int sum =0;
			for (int j = i; j < i+k; j++) {
				sum = sum + arr[j];
				System.out.print(arr[j] + " ");
			}
			System.out.println("- "+sum);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
	    findSubArraySum(arr, k);
	}
}
