import java.util.Scanner;

public class sumOfArray {

	public static int sumOf(int[] ar) {
		int sum = 0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = s.nextInt();
		}
		
		System.out.println(sumOf(ar));

	}

}
