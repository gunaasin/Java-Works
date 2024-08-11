import java.util.Scanner;


class Car {
	String name;
	float cost;
}


public class Arrayobb{
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter how many cars you have :");
		int count = scan.nextInt();
		
		Car a = new Car[count];

		for(int i=0 ; i<a.length;i++){
			System.out.print("Enter car name : ");
		    a[i] = scan.nextline();
			System.out.print("Enter car price : ");
			a[i]= scan.nextInt();
			
		}
	}
}