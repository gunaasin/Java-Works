import java.util.Scanner;

public class Math{
	public static void main(String[] args){
			Scanner info = new Scanner(System.in);
			System.out.println("Enter the A value :");
			int a = info.nextInt();
			System.out.println("Enter the B value :");
			int b = info.nextInt();
			System.out.println("Enter the C value :");
			int c = info.nextInt();
			int d = a*b*c;
			System.out.println("The a,b,c multiply value is : " + d);
			int e = a+b+c;
			System.out.println("The a,b,c add value is : " + e);
                        int f = d/e;
			System.out.println("Also d and e dicide value is :" + f);
			info.close();
			
		}
	}