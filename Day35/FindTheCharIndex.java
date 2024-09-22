import java.util.Scanner;

public class FindTheCharIndex {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String firstString = scan.next();
		char ch = scan.next().charAt(0);
	boolean check = false;	
		for(int i=0;i<firstString.length();i++){
			char c = firstString.charAt(i);
			if(c==ch) {
				check = true;
				System.out.print(i);
				break;
			}
			
		}
		
		
		if(!check) {
			System.out.println("given char not present in the String :( ");
		}
	}

}
