import java.util.Scanner;

public class printEvenIndexArray {
	
	public static void Array(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i] + " ");
			}
		}	
	}
	
	
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
		Array(arr);

	}

}
