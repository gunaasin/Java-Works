import java.util.Scanner;

public class LargestArrayValuetoIndex {
	public static int findVal(int[] arr) {
		
		int max = arr[0];
		int res = 0;
		for(int i =0;i<arr.length;i++) 
		{
			if(max < arr[i]) {
				max = arr[i];
				res = i;
			}
			
	    }
		return res ;
		
		
		
	
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
