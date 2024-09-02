import java.util.Scanner;

public class sumOfMaxInArrayPairs {

	public static int findVal(int[] ar) {
		int max = ar[0];
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 1; i < ar.length; i++) {
			
			if(max<ar[i]) {
				secondMax = max;
				max = ar[i];
			}else if(ar[i]>secondMax && ar[i]!=max) {
				secondMax = ar[i];
			}
		}
		return max + secondMax ;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		System.out.println(findVal(ar));

	}

}
