import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountPairsUsingMaps {
	
	public static void FindTheCount(int[] ar) {
		
		 LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer , Integer>();
		 
		 for(int i=0;i<ar.length;i++) {
			 if(map.containsKey(ar[i])) {
				 int n = map.get(ar[i]);
				 map.put(ar[i], ++n);
			 }else {
				 map.put(ar[i], 1);
			 }
		 }
		 
		 int pairs = 0;
		 
		 Collection<Integer> value = map.values(); // collection represent duplicate allowed
		 for(int v : value) { // this time only want the values not a key   
			 pairs += v/2;  // find a pairs /2 --> like 1 1 1 1 2 3 3  each same number make one pair so 6/2 = 3 pairs 
		 }
		 
		 System.out.println(pairs);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		
	FindTheCount(ar);
	}

}
