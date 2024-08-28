import java.util.Scanner;

public class printOddIndex {
	public static void PrintArray(int[] arr) {
		for(int i=2;i<arr.length;i+=2) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void PrintArray2(int[] arr) { // print reverse order in the array
		for(int i=arr.length-1;i>=0;i-=1) {
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
		
//		System.out.println(arr); this method to print array address
		
//		PrintArray(arr);
		PrintArray2(arr);

	}

}
