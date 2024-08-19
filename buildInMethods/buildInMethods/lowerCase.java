package buildInMethods;
import java.util.Scanner;

public class lowerCase {
	static String toLowerCase(String n) {
		String t = "";
		for (int i =0;i<n.length();i++) {
			char c = n.charAt(i);
			if(c>='A'&& c<='Z') {
				t = t + (char)(c+32);
			}else {
				t = t + (char)(c);
			}
		}
		return t ;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		System.out.println(toLowerCase(n));
	}

}
