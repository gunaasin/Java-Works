import java.util.*;
public class loopFor {

	public static void forLoop(int n) {
	
		for(int i=1;i<=n;i++) {
			System.out.println(i + ". GuNa");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count !");
		int n = scan.nextInt();
		
		forLoop(n);
		

	}

}
