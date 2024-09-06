import java.util.Scanner;

public class PrintLargestRepeatingEleInArray {

	
	public static int findValue(int[] arr){
		int count =1;
		int max =Integer.MIN_VALUE;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				if(count>1  && arr[i]>max) {
					max = arr[i];
				}
				count =1;
			}
		}
		
		if(count>1  && arr[arr.length-1]>max) {
			max = arr[arr.length-1];
		}
		return max;
	}
	
	
	
	
	
	
	
	public static int findValue2(int[] arr){
		
		for (int i = arr.length-2; i >=0; i--) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Method 1 - "+findValue(arr));
		System.out.println("Method 1 - "+findValue2(arr));
	}

}
