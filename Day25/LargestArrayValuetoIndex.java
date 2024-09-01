import java.util.Scanner;

public class LargestArrayValuetoIndex {
	public static int findVal(int[] arr) {
		
		int max = arr[0];
		for(int i =0;i<arr.length;i++) 
		{
			max = max < arr[i] ? arr[i] : max ;
	    }
		
		
		
		for(int i =0;i<arr.length;i++) 
		{
			if(arr[i] == max) {
				return i;
			}
	    }
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
	    }
		System.out.println(findVal(arr));

	}

}
