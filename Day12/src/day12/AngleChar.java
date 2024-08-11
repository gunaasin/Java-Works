package day12;

import java.util.Scanner;

public class AngleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			char cha = 65;
			for(int i =1;i<=n;i++) {
				for(int j =1;j<=i;j++) {
					System.out.print(cha + " ");
				}
				System.out.println();
				cha++;
			}
	}
}
