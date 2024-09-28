
	import java.util.Scanner;
	import java.util.Set;
	import java.util.TreeMap;

	public class PrintMoreAccuringWord {
		
		public static void printWords(String inputString) {
			String[] ar = inputString.split(" ");
			TreeMap<String , Integer> map= new TreeMap<String , Integer>();
			
			for(int i=0;i<ar.length;i++) {
				// this code to optimize to find the key return value , but not find the key return default value 		
				int  c = map.getOrDefault(ar[i], 0);
				map.put(ar[i], ++c);		
			}
			
			Set<String> keys = map.keySet();
			
			int max = Integer.MIN_VALUE;
			String res =null;
			
			for(String s : keys) {
				int n = map.get(s);
				
				if(max<n) {
					max = n;
					res = s;
				}
			}
			
			System.out.println(res);
//			System.out.println(res + "" + max);
			
			
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String inputString = scan.nextLine();
			printWords(inputString);
		}

	}



