package day12;

import java.util.Scanner;

public class PrintAngleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		
		for(i=1 ; i<=n ; i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i + " ");
				
			}	System.out.println();
		}
		for(i=1 ; i<=n-1 ; i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(n-i + " ");
				
			}	System.out.println();
		}
	}

}
