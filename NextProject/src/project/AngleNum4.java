package project;

import java.util.Scanner;

public class AngleNum4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			int count = 1;
			for(j=1;j<=(2*i)-1;j++) {
				if(j<i) {
					System.out.print(count++ + " ");
				}
				else {
					System.out.print(count-- + " ");
				}
				
			}System.out.println();
		}

	}

}
