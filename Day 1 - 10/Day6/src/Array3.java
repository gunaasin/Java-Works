import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of school");
       int School = scan.nextInt();

       int [][][] a = new int[School][][];
       int i,j,k;

       for ( i = 0; i < a.length; i++) {
           System.out.println("Enter the number of class for "+ (i+1) +" school :");
           int Class = scan.nextInt();
           a[i] = new int [Class][];
           for ( j = 0; j < a[i].length; j++) {
               System.out.println("Enter the number of Student for "+ (j+1) +" class,"+ (i+1) +" School:");
               int Student = scan.nextInt();
               a[i][j] = new int [Student];
               for ( k = 0; k < a[i][j].length; k++) {
                   System.out.println("Enter the number of "+ (k+1) +" th Student mark for "+ (j+1) +" class,"+ (i+1) +" School:");
                   a[i][j][k] = scan.nextInt();
               }
           }
       }
        for ( i = 0; i < a.length; i++) {
            for ( j = 0; j < a[i].length; j++) {
                for ( k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k]+ " ");

                }System.out.println();
            }System.out.println();
        }




    }
}
