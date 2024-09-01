import java.util.Scanner;

public class Array {
	
	public static void printArray(int[] arr ) {
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] a	= new int[n];
		
		for(int i =0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
			
		printArray(a );
	}
	
}
