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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		PrintReverseSubArrays(arr);

	}

}
