import java.util.Scanner;

public class PrintUniqueElementInArray {

	
	public static void printUnique(int[] arr) {
		int count =1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else if(count ==1){
				System.out.println(arr[i] + " ");
			}else {
				count = 1;
			}
		}
		
		if(count ==1) {
			System.out.println(arr[arr.length-1] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		printUnique(arr);

	}

}
