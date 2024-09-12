import java.util.Scanner;

public class PrintSumOfKinSubArray {
	public static void printSum(int arr[]) {
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<=arr.length-i;j++) {
				int sum =0;
				for(int k=j;k<i+j;k++) {
					sum+=arr[k];
				}
				System.out.println(sum);
			
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
			printSum(arr);
	}

}
