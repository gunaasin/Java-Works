package day12;

import java.util.Scanner;

public class AngleNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		int num = (n-n) + 1;
			for(i=1 ; i<=n ; i++) {
				for(j=1;j<=i;j++) {
					if(num<10) {
						System.out.print("0"+ num++ + " ");
					}else {
						System.out.print(num++ + " ");
					}
					
				
				}System.out.println();
			}
	}
}
