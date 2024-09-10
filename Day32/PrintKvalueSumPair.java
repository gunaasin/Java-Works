import java.util.Scanner;

public class PrintKvalueSumPair {
	public static void COGEISA(int[] arr , int k, int s){
		int count =0;
		for (int i = 0; i <=arr.length-k; i++) {
			int sum =0;
			for (int j = i; j <i+k; j++) {
				sum +=arr[j];

			}

			if(sum ==s) {
				for (int j = i; j <i+k; j++) {
					
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		int s = scan.nextInt();
		COGEISA(arr, k, s);

	}

}
