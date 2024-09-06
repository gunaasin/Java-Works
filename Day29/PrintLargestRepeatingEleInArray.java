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
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(findValue(arr));;
	}

}
