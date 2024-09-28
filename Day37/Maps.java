import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Maps {

	
	public static void findCharValue(String s) {
		
		LinkedHashMap<Character ,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, ++c);  // increment the value by one c+1 --> ++c increment after use 
			}else {
				map.put(ch, 1);
			}
			
		}
		
		Set<Character> keys = map.keySet(); //  this set represent the no duplicates 
		
		for(Character res :keys ) {
			int n = map.get(res);
			System.out.println(res + " : " +n);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		findCharValue(s);

	}

}
