import java.util.Scanner;

public class problem1 {

	public static int process(int n1 ,int n2) {
		int a=n1;
		int b=n2;
		int min = a<b?a:b;	
		int count = 0 , value = 1;
		while(count < value) 
		{
				if(a==b) 
				{
					return a;	
				}
				else if(a<b)
				{
					b = b-a;				
					count++;
					value++;	
				}
				else
				{
					a = a-b;					
					count++;
					value++;
				}
			}
		return 1;
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println(process(n1 , n2));

	}

}
