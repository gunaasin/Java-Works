import java.util.Scanner;

public class productOfNminusOneArray {

	public static int[] productOfArray(int[] ar , int n) {
		int product = 1;
		for(int i=0;i<ar.length;i++) {
			product = product*ar[i];
		}
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			int t = product/ar[i];
			System.out.print(t + " "); // if print the product of n-1 array hear 
			arr[i]=t; // but create an array to print all n-1 product in question write this one 
		}
		System.out.println();
		return arr;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		
		int[] a = productOfArray(ar , n); // product of array
		for(int i=0;i<a.length;i++) {   
			System.out.print(a[i] + " " );  
		}
		
	}

}
