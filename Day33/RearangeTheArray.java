import java.util.Scanner;

public class RearangeTheArray {
	
	
	public static void ArrangeTheArray(int[]arr) {
	
		int i=arr.length-1,j=arr.length-1;
		while(i>=0) {	
			if(arr[i]==-1) {
				i--;
			}else {
				arr[j--] = arr[i--];	
			}
		}
		
		
		while(j>=0) {
			arr[j--]= -1;
			
		}
		
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] +" ");
		}
		
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		ArrangeTheArray(arr);
		
		
		

	}

}
