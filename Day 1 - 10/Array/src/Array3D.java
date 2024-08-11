import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of School : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of class : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of Student : ");
        int o = sc.nextInt();

        int[][][] a = new int[n][m][o];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.print("School num : " + i +" Class num : "+ j +" enter the student age: ");
                    a[i][j][k] = sc.nextInt();

                }
            }
        }

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){

                    System.out.print( " | "+ a[i][j][k] + " | ");

                }
              System.out.println();
            }
            System.out.println();
        }
    }
}
