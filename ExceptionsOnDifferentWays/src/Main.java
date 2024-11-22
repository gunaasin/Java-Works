import java.util.Scanner;

class Demo {
    void add() throws Exception {
        System.out.println("Connection is started");

         try{
             Scanner scan = new Scanner(System.in);
             int a = scan.nextInt();
             int b  =scan.nextInt();
             int c = a/b;
             System.out.println(c);
         }catch (Exception e){
             throw e;
         }
       finally {
             System.out.println("Connection is terminated");
         }
    }
}









public class Main {
    public static void main(String[] args) {















        System.out.println("Connection is started 2");
        Demo d = new Demo();
            try {
                d.add();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        System.out.println("Connection is terminated 2");


    }
}