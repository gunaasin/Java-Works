import java.util.Scanner;

public class FindStringPresentInAnotherString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString = scan.next();
		String secondString = scan.next();
		int i=0 , j=0;
		
		
		while(i<firstString.length() && j<secondString.length() ) {
			
			if(firstString.charAt(i)==secondString.charAt(j)) {
				i++;
				j++;
			
			}else {
				i++;
			}
			
		}
		
		if(j==secondString.length()) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
