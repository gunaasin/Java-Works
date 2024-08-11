package day12;

import java.util.Scanner;

public class PeintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i =1;i<=n;i++) {
        	if(i%2==0) {
        		System.out.print(i+1 + " ");
        	}
        	
        	for(int j =1;j<=n;j++) {
        		System.out.print(i + " " );
        	}
        	
        	if(i%2!=0) {
        		System.out.print(i+1 + " ");
        	}System.out.println();
        }
	}

}
