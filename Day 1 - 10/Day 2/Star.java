import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter i value  : ");
          int num  = sc.nextInt();
          System.out.print("Enter j value  : ");
          int num2 = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num2  ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            num2--;
        }
    }
}