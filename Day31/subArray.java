import java.util.Scanner;

public class subArray {
	
	public static void findSubArrys(int []array,int k){
		
		
		for (int i = 0; i <=array.length-k; i++) {
			for (int j = i; j < k+i; j++) {
				System.out.print(array[j] + " ");
			} 
			
		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] ar1 = new int[n1];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=scan.nextInt();
		}
		
		int k =scan.nextInt();
		findSubArrys(ar1,k);

	}

}
