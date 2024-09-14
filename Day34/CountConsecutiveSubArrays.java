import java.util.Scanner;

public class CountConsecutiveSubArrays {
	
	public static void countConsecutive(int[] arr) {
		int i=0,count =1;
		while (i<arr.length-1) {
			if(arr[i+1]-arr[i]==1) {
				count++;
				i++;
			}else {
				System.out.println(count);
				count =1;
				i++;
			}
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) {   
		
		
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			
		}
		
	countConsecutive(arr);
	}

}
