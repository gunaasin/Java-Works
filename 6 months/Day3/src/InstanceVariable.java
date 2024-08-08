import java.util.Scanner;

class Car {
    String name;
    double cost;
}
public class InstanceVariable {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many cars you have :");
        int count = scan.nextInt();
        Car[] a = new Car[count];

         for(int i=0 ; i<a.length;i++){
            System.out.print("Enter car name : ");
            a[i] = new Car();
            a[i].name = scan.next();
            System.out.print("Enter car price : ");
            a[i].cost= scan.nextDouble();
         }

         for(int i=0 ; i<a.length;i++){
            System.out.println("Enter car name : " +  a[i].name);
            System.out.println("Enter car price : " + a[i].cost);
         }System.out.println();

    }
}