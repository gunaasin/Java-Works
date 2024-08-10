package project;

import java.util.Scanner;

public class HellowNum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			int num = i;
			for(j=1;j<(n+1-i);j++) {
				if(i==1 || j==1 || j==(n-i)+1) {
					System.out.print(num++ + " ");
				}else {
					System.out.print("  ");
				}
			}
			for(j=1;j<=n-n+1;j++) {
					System.out.print(n+ " ");
			}
			System.out.println();
		}
	}
}
