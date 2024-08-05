import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the Number of train :");
         int train = scan.nextInt();
         int[][] a = new int[train][];

        for(int i = 0; i < train; i++){
            System.out.print("Enter no of comportment in "+i+" train:");
            a[i] = new int[scan.nextInt()];
        }

         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {
                 System.out.print("Enter the " + i + " train ," + j+ " comportment How many Seets :");
                 a[i][j] = scan.nextInt();
             }System.out.println();
         }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                System.out.print(" "+ a[i][j]+" ");
            }System.out.println();
        }
    }
}