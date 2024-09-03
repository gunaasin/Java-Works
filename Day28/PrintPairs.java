import java.util.Scanner;

public class PrintPairs {
	
	public static void printAns(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++) // arr.length-1 is define by total length -1 because last one not get any pairs 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				System.out.println(arr[i] + " , " + arr[j]);
			}
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] =scan.nextInt();
		}
		
		printAns(arr);

	}

}
