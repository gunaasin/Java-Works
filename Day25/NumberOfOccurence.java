import java.util.Scanner;

public class NumberOfOccurence {

	public static int findVal(int[] arr , int k) {
		int count = 0;
		 for(int i =0;i<arr.length;i++) {
			 if(arr[i] == k) {
				 count++;
			 }
		 }
		 return count;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
	    }
		int k = scan.nextInt();
		System.out.println(findVal(arr,k));

	}

}
