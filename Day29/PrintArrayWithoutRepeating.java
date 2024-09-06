import java.util.Scanner;

public class PrintArrayWithoutRepeating {
	
	public static void printValue(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(arr[arr.length-1]);
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr =new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		printValue(arr);
	}

}
