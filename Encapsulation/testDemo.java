import java.util.Scanner;

public class testDemo {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the  id");
		int n = scan.nextInt();
		System.out.println("enter the name :");
		scan.nextLine();  // this  line  take  over the buffer /n 
		String name = scan.nextLine();
		System.out.println("enter the num :");
		int num = scan.nextInt();
		
		System.out.println(n + " " + name + " " + num);
	}

}
