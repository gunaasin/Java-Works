import java.util.Scanner;

public class Array2D {
    public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the school num :");
		int num1 = scan.nextInt();
        System.out.print("Enter the student count :");
        int num2 = scan.nextInt();
		int[][] a = new int[num1][num2];
                
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("school no: " + i + " Enter the student age :");
				a[i][j] = scan.nextInt();
			}
		}

		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j] + " " );

			}
			System.out.println();
		}


	}
}
