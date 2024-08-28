import java.util.Scanner;

public class nthPrime 
{
			public static void findMultiple(int n,int a,int b) {
				int count = 0;
				int val=1;
				while(count<n) {
					if(val%a==0 && val%b==0 ) {
						System.out.println(val);
						count++;
					}
					val++;
				}
			}
			
			
			public static void main(String[] args) 
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("find the n th prime number !!");
				int n =scan.nextInt();
				int a =scan.nextInt();
				int b =scan.nextInt();
				findMultiple( n,a,b);
				

			}

}


	


