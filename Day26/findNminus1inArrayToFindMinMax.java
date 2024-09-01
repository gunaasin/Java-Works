import java.util.Scanner;

public class findNminus1inArrayToFindMinMax {
	public static void findVal(int[] arr) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) 
		{
			sum = sum+arr[i];
	    }
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) 
		{
			int t = sum - arr[i];
			System.out.println(t);
			
			if(max<t) {
				max = t;
			}else {
				min =t;
			}
			
	    }

		System.out.println("max "+max);
		System.out.println("min "+min);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
	    }
		
		
		findVal(arr);

	}

}
