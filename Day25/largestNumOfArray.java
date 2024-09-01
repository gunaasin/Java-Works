import java.util.Scanner;

public class largestNumOfArray 
{

	
	public static void findVal(int[] arr)
	{
		int res = arr[0];
//		int res = Integer.MIN_VALUE;	
		for(int i =1;i<arr.length;i++)
		{
			res = res<arr[i] ? arr[i] : res; 
		}
		System.out.println("The max value "+res);
	}
	
	
	public static void findVal2(int[] arr)
	{
		int res = arr[0];
//		int res = Integer.MIN_VALUE;	
		for(int i =1;i<arr.length;i++)
		{
			res = res<arr[i] ?  res:arr[i] ; 
		}
		System.out.println("The min value "+res);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
	    }
		findVal(arr);
		findVal2(arr);
		

	}

}
