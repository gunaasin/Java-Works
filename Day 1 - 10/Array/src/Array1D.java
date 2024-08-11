import java.util.Scanner;

class Array1D {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int add = scan.nextInt();
		int[] a =new int[add];
		for(int i=0 ; i<a.length ; i++){
			System.out.println("Enter the "+ i +" Student age : ");
			a[i] = scan.nextInt();
		}
		for(int i=0 ; i<a.length ; i++){
			System.out.print( a[i] + " ");
			
		}


	}
}