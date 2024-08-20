import java.util.Scanner;

public class Print {
	
	static String upperCase(String n) {
	
//		using StingBuilder 
		
		StringBuilder newWord = new StringBuilder();
		
		
		for (int i=0;i<n.length();i++) {
			char x = n.charAt(i);
			if(x>='a' && x<='z') {
				newWord.append((char)(x-32));
				
			}else {
				newWord.append(x);
				
			}
		
		}
		return newWord.toString();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("LowerCase to UpperCase");
		
		String n = s.nextLine();
		
		System.out.println(upperCase(n));
	}

}
