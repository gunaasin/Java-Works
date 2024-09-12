import java.util.Scanner;

public class RearangeRTheArray2 {
	
 public static void Arrange(int[] arr) {
	int i=0,j=0;
	while(i<arr.length) {
		if(arr[i]==0) {
			i++;
		}else {
			arr[j++]=arr[i++];
		}
	}
	while(j<arr.length) {
		arr[j++]=0;
	}
}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			
		}
		
		Arrange(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
