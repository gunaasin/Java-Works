package day11;

import java.util.Scanner;

public class AngleNum3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(2*i)-1;j++) {
				System.out.print(j + " ");
			}System.out.println();
		}
	}
}
