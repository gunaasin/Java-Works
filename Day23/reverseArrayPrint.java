import java.util.Scanner;

public class reverseArrayPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=ar.length-1;i>=0;i--) {
			ar[i]=scan.nextInt();
		}
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i] + " ");
	
		}
		System.out.println();
		for(int i=ar.length-1;i>=0;i--) {
		
		if(ar[i]%2==0) {
			System.out.print(ar[i] + " ");
		}
		}

	}

}
