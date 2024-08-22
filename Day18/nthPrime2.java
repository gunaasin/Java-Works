import java.util.Scanner;

public class nthPrime2 {

	public static void multipleOff(int n,int a,int b) {
			
		for(int i=1;i<=n;i++)
		{
				if(i%a==0 && i%b==0) 
				{
					System.out.print(i + " ");
				
				}
				
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		
		multipleOff(n,a,b);

	}

}
