import java.util.Scanner;

public class oddIndexArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar= new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		
		for(int j=0;j<ar.length;j++) {
			if(ar[j] %2 !=0 ) {
				System.out.println(ar[j]);
			}
	
			
		}

	}

}
