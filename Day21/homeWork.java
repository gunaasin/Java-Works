import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter two number !");
		 int n1 = scan.nextInt();
		 int n2 = scan.nextInt();
		 int hcf = findSolution(n1,n2);
		 System.out.println(n1+"/"+n2+" = " +n1/hcf + "/" +n2/hcf);
		 

	}
	
	public static int  findSolution(int a , int b) {
		for(int i=a;i>=1;i--) { /// find the gcd of two numbers or HCF
			if(a%i==0 && b%i==0 ) {
				return i;
				
			}
		}
		return 1;
		
		
	
	}

}
