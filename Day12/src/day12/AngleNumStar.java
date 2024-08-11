package day12;

import java.util.Scanner;

public class AngleNumStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		for( i=1;i<=n;i++) {
			int count = i*(i+1)/2;
			for(j=1;j<=i;j++) {
				
//				if(j<i) {
//					System.out.print(count-j+1 + " * ");
//				}else {
//					System.out.print(count-j+1 + "   ");
//				}
				
				System.out.print(count-j+1);
				if(j<i) {
					System.out.print(" * ");
				}
				
				
			}System.out.println();
		}
	}
}
