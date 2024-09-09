
import java.util.Scanner;

public class PrintAlltheSubArray {
	public static void findsubArrays(int [] arr) {
		for (int k = 1; k<= arr.length; k++) {
		  for (int i = 0; i<=arr.length-k; i++) {
			for (int j = i; j<i+k; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		  }
		}
	}
	
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		 findsubArrays(arr);
		
		
	}

}
