import java.util.Scanner;

public class PrintWordsInDifferentLine {
	
	public static int wordLength(String inputString) {
		
		int count = 0;
		for(int i=0;i<inputString.length()-1 ;i++) {
			if(inputString.charAt(i) ==' ' && inputString.charAt(i+1)!=' ' ) {
				count++;
			}
		}
		return inputString.charAt(0)==' '? count : count+1;
	}
	
	
					
	public static String[] WordSpliter(String inputString) {
		
		String res ="";
		
		int n = wordLength(inputString),j=0;
		String[] ar = new String[n];
		
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i)!=' ') {
				res += inputString.charAt(i);
			}else if(res.length()>0) {
			ar[j++]=res;
			res="";
			
			}
		}
		
	    if( res.length()>0 ) {
	    	ar[j]=res;
	    }
		return ar;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		String[] ar = WordSpliter(inputString);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}System.out.println();
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i] +" ");
		}System.out.println();
		
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ReverseString(ar[i]) +" ");
		}System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ReverseString(ar[i]) +" ");
		}System.out.println();
		
		for(int i=1; i<ar.length;i+=2) {
			System.out.print(ar[i] + ar[i-1] + " ");
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +ar[i].length() +" ");
		}System.out.println();
		
		for(int i=0,j=ar.length-1;i<j;i++ , j--) {
			System.out.print(ar[i] + ar[j] +" ");
		}
		if(ar.length%2!=0) {
			
			System.out.print(ar[ar.length/2] +" ");
		}
		
		System.out.println();
		
	}
	
	
	public static String ReverseString(String r) {
		String res ="";
		for(int i=r.length()-1;i>=0;i--) {
			res+= r.charAt(i);
		}
		return res;
	}
	


}
