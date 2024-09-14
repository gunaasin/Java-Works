import java.util.Scanner;

public class PrintConsecutiveSubArrays {
	public static void PrintConsecutive(int [] arr) {
		int i=0;
		while(i<arr.length-1) {
			if(arr[i+1]-arr[i]==1){
				System.out.print(arr[i++]+ " ");
			}else {
				System.out.println(arr[i++] + " ");
			}
		}
		
		System.out.println(arr[i] + " ");
	}
	
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			
		}
		
		PrintConsecutive(arr);
	}

}
