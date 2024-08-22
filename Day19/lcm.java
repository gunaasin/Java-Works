import java.util.Scanner;

public class lcm {
	
	
	
	public static int findHighestCf(int n1,int n2) {
		
		int min = n1<n2 ? n1: n2 ; 
		
		for ( int i=min;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				System.out.println("GCD = "+ i);
				return i;
			}
				
		}
		
		return 1;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int hcf = findHighestCf(n1,n2);
		
		System.out.println("LCM = "+ (n1*n2)/hcf);

	}

}
