import java.util.Scanner;

public class ProductOf {

	public static int productOfArray(int[] ar) {
		int res = 1;
		for(int i=0;i<ar.length;i++) {
			res = res * ar[i];
		}
		
		return res;
	}
	
	
	public static int sumOfArray(int[] ar) {
		int res = 0;
		for(int i=0;i<ar.length;i++) {
			res = res + ar[i];
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int n = scan.nextInt();
	
	int[] ar = new int[n];
	
	for(int i=0;i<ar.length;i++) {
		ar[i]=scan.nextInt();
	}
	System.out.println(	sumOfArray(ar));
    System.out.println(	productOfArray(ar));

	}

}
