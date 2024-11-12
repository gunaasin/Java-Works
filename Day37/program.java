import java.util.Scanner;

public class program {

	public static void main(String[] args) {
//		int[] arr = new int[Integer.MAX_VALUE];/// runtime error it leads to lack of system resourses
		
		
		for(int i =60;i<70;i++) {
			System.out.println((char)i);
//			Thread.sleep(3000);// compile time exception or checked exception  
			
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextInt()/scan.nextInt()); // 100/0 is Leads to arithmeticException that is represent by a run time exception or unchecked exception
		scan.close();
		
	}

}
