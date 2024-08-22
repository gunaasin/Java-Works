import java.util.Scanner;

public class nthPrime3 {

	public static void findFactor(int a , int b) {
		
		int min = a<b ? a : b;
	
		for(int i=1 ;i<=min;i++){
			if(a%i==0 && b%i==0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		findFactor(n1,n2);

	}

}
