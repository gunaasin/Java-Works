
import java.util.Scanner;

public class secondLargestElementinArray {
	
	public static void findArray(int[] arr) {
		int max =arr[0];
		int secondMax = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max ) {
				secondMax = max;
				max = arr[i];
			}else if(secondMax<arr[i] && max!=arr[i]) { /// it print second largest value  max!=arr[i]
				secondMax = arr[i];
			}
		}
		
//		System.out.println(max);

		System.out.println("The second largest element in the array "+secondMax);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		findArray(arr);
		

	}

}
