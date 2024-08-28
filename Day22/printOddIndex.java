import java.util.Scanner;

public class printOddIndex {

	
	public static void PrintArray(int[] arr) {
		for(int i=2;i<arr.length;i+=2) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		PrintArray(arr);

	}

}
