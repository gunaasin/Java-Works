import java.util.Scanner;



class demo extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}

public class NEWOne {
	
	
	static void pro() {
		pro();
	}
	
	public static void main(String[] arr) {
		Scanner scan = new Scanner(System.in);
		try {
			pro();
//			int a = scan.nextInt();
		}catch (Error e) {
//			e.printStackTrace();
			System.out.println(e.g);
//			System.out.println(e.getLocalizedMessage());
		}
	}
}
