import java.util.Scanner;

class Process1 extends Thread{
    Scanner scan=null;
   public Process1(Scanner scan){
        this.scan=scan;
    }
    @Override
    public void run() {
        System.out.println("Process one is started");
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println("Process one is terminated");
    }
}

class Process2 extends Thread{
    @Override
    public void run() {
        System.out.println("Process two is started");
        for(int i=65 ; i<=70;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Process two is terminated");
    }
}

class Process3 extends Thread{
    @Override
    public void run() {
        System.out.println("Process three is started");
        for(int i=100 ; i<=110;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Process three is terminated");
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Process1 p1 = new Process1(scan);
        Process2 p2 = new Process2();
        Process3 p3 = new Process3();

        p1.start();
        p2.start();
        p3.start();


    }
}