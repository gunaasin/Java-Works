import java.util.Scanner;

public class prime4 {
		static void isPrime(int n, int k) 
		{
			
			for(int i=k;i<=n;i++)
			{
				
				boolean isprime=true;
				for(int j=2;j*j<=i;j++) 
				{
					if(i%j==0)
					{
						isprime=false;
						break;
					}
				}
				
				if (isprime) 
				{
	                System.out.println(i+ " ");
	            }
				
			}			
		}
		
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Starting number to find prime :");
		int k = scan.nextInt();
		System.out.println("Enter the Ending number :");
		int n = scan.nextInt();
			
		
		isPrime(n,k);
	}

}
