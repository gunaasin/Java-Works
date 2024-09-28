import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PrintWordsAccourMoreThenThreeTimesUsingMaps {
	
	public static void printWords(String inputString) {
		String[] ar = inputString.split(" ");
		TreeMap<String , Integer> map= new TreeMap<String , Integer>();
		
		for(int i=0;i<ar.length;i++) {
			
			
	// this code to optimize to find the key return value , but not find the key return default value 		
			int  c = map.getOrDefault(ar[i], 0);
			map.put(ar[i], ++c);		
			
//			if(map.containsKey(ar[i])) {
//				int c = map.get(ar[i]);
//				map.put(ar[i], ++c);
//				
//			}else {
//				map.put(ar[i], 1);
//				
//			}
		}
		
//		System.out.println(map);
		
		Set<String> keys = map.keySet();
		for(String s : keys) {
			int n = map.get(s);
			
			if(n>3) {
				System.out.println(s);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		printWords(inputString);
	}

}
