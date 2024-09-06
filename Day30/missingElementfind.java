import java.util.Scanner;

public class missingElementfind {
	
	
	public static int findElement(int[] arr,int n) {
//        find first n natural numbers using the formula
		int naturalNumber = n*(n+1)/2;
		int sum =0;
		for (int i : arr) {
			sum = sum + i;
			
		}
		return naturalNumber-sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =  scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =scan.nextInt();
		}
		System.out.println(findElement(arr, n+1));
		
		
	}
	
}
