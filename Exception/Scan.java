import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan = null;
		
		try {
			scan= new Scanner(System.in);
			System.out.print(scan.nextLine());
		}
		
		finally {
			scan.close();
		}

	}

}
