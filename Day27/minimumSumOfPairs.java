import java.util.Scanner;

public class minimumSumOfPairs {
	
	
	public static int findVal(int[] ar) {
		int min = ar[0];
		int secondMin = Integer.MAX_VALUE;
		
		for (int i = 1; i < ar.length; i++) {
			
			if(min>ar[i]) {
				secondMin = min;
				min = ar[i];
			}else if(ar[i]<secondMin ) {
				secondMin = ar[i];
			}
		}
		return min + secondMin ;
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
