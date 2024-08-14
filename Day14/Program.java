import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n<=0 || n>=100) {
			System.out.println("Not Valid");
		}
		else if(n>= 90)
		{		
			System.out.println("O");
		}else if(n>= 80)
		{		
			System.out.println("A+");
		}else if(n>= 70)
		{		
			System.out.println("B+");
		}else if(n>= 50)
		{		
			System.out.println("B");
		}else if(n>= 35)
		{		
			System.out.println("C");
		}else
		{		
			System.out.println("fail");
		}
		

	}

}
