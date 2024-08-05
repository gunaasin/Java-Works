import java.util.Scanner;

public class Array3one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Schools: ");
        int numberOfSchools = sc.nextInt();

        int[][][] a = new int[numberOfSchools][][];

        for (int i = 0; i < numberOfSchools; i++) {
            System.out.print("Enter how many classes in School " + (i + 1) + ": ");
            int numberOfClasses = sc.nextInt();
            a[i] = new int[numberOfClasses][];

            for (int j = 0; j < numberOfClasses; j++) {
                System.out.print("Enter how many students in Class " + (j + 1) + " of School " + (i + 1) + ": ");
                int numberOfStudents = sc.nextInt();
                a[i][j] = new int[numberOfStudents];

                for (int k = 0; k < numberOfStudents; k++) {
                    System.out.print("Enter age of student " + (k + 1) + " in Class " + (j + 1) + " of School " + (i + 1) + ": ");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        // Display the data
        for (int i = 0; i < numberOfSchools; i++) {
            System.out.println("School " + (i + 1) + ":");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("  Class " + (j + 1) + ": ");
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        sc.close(); // Closing the scanner
    }
}
