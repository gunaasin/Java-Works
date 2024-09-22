import java.util.Scanner;

public class PrintStarBeforeA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		String result = "";
		for(int i=0;i<inputString.length();i++) {
			char ch = inputString.charAt(i);
			
			if(ch=='a' || ch=='A') {
				result +="*"+ch;
			}
			else {
				result +=ch;
			}
		}
		System.out.println(result);
		
	}

}
