import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Enter a name :");
        String name = info.nextLine();
        System.out.print("Enter the address :");
        String address = info.nextLine();
        System.out.print("Enter an age :");
        int age = info.nextInt();
        System.out.print(name + " is " + age + " years old,  and address is " + address);
    }
}
