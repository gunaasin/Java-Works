import java.util.Scanner;

public class ReverseSubArray {
	
	
	static void PrintReverseSubArrays(int[] arr) {
		for(int i=arr.length;i>=1;i--) {
			for(int j=0;j<=arr.length-i;j++) {
				for(int k=j;k<i+j;k++) {
					System.out.print(arr[k] + " ");
					
				}
				System.out.println();
			}
		}
	}
	
	static void PrintReverseSubArraysIsEqualsToK(int[] arr , int s) {
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<=arr.length-i;j++) {
				int sum =0;
				for(int k=j;k<i+j;k++) {
					sum +=arr[k];
				}
				if(s==sum) {
					for(int k=j;k<i+j;k++) {
						System.out.print(arr[k] + " "); 
						
					}System.out.println();
				}
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
		int s =scan.nextInt();
		
//		PrintReverseSubArrays(arr );
		PrintReverseSubArraysIsEqualsToK(arr, s);

	}

}
