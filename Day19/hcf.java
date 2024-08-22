import java.util.Scanner;

public class hcf {
	public static void findHCFactor(int a,int b){
		int min = a<b ? a : b;
		
		for(int i=min ;i>=1;i--){
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		findHCFactor(n1,n2);

	}

}
