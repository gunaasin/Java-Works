import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int t = 2147483647;
		int t1 = t*2;
		System.out.println(t1);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(n/m);
		System.out.println(n%m==0); 

	}

}
