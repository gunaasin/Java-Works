import java.util.Scanner;

public class prime2 {
		static void isPrime(int n) 
		{
			
			for(int i=2;i<=n;i++)
			{
				
				boolean isprime=true;
				for(int j=2;j<=i/2;j++) 
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
		int n = scan.nextInt();
			
		
		isPrime(n);
	}

}
