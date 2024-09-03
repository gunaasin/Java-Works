import java.util.Scanner;

public class minimumPairProduct {
	public static int findVal(int[] ar) {
		int min = ar[0] , secondMin = Integer.MAX_VALUE;
		int max = ar[0] , secondMax = Integer.MIN_VALUE;
		
		for (int i = 1; i < ar.length; i++) {
			
			if(min>ar[i]) {
				secondMin = min;
				min = ar[i];
			}else if(ar[i]<secondMin ) {
				secondMin = ar[i];
			}
		}
		
		int p1= min * secondMin ;
		
		
		
		for (int i = 1; i < ar.length; i++) {
			
			if(max<ar[i]) {
				secondMax = max;
				max = ar[i];
			}else if(ar[i]>secondMax ) {
				secondMax = ar[i];
			}
		}
		int p2= max * secondMax ;
		int p3 =min*max;
		
		if (p1<p2 && p1<p3) {
			return p1;
		}else if(p2<p1 && p2<p3) {
			return p2;
		}else {
			return p3;
		}
		
		
		
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
