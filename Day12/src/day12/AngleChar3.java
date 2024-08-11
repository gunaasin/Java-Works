package day12;

import java.util.Scanner;

public class AngleChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char ch = 'A';

		
		for(int i =1;i<=n;i++) {
			
			
			if(i%2 == 0) {
				
				char c = (char)(ch+i-1);
				
				for(int j = 1;j<=i;j++) {
					System.out.print( c-- + " " );
					ch++;
			        }
			}
			else{
				for(int j = 1;j<=i;j++) {
						System.out.print(ch++ + " " );
					}
				}
		    System.out.println();
		}
	}

}
