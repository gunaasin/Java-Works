import java.util.Scanner;


public class differenceOfPairs {
	public static void find(int[] ar , int k){
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				
				if(k == ar[i]-ar[j] || ar[j]-ar[i]==k ) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr  = new int[n];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =scan.nextInt();
		} 
		
		int k = scan.nextInt();
		find(arr , k);

	}

}
