import java.util.Scanner;

public class findMissingElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		
		
		
		for (int i = 1; i <=arr.length+1; i++) {
			boolean res = false;
			for (int j = 0; j < arr.length; j++) {
				if(i ==arr[j]) {
					res = true;
				}
			}
			if(!res) {
				System.out.println(i);
			}
			
		}
	}

}
