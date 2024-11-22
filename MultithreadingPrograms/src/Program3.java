import java.util.Scanner;

class function extends Thread{
    @Override
    public void run(){
        String connection = Thread.currentThread().getName();
        if(connection.equals("Adding")) {
            add();
        } else if (connection.equals("char")) {
            Char();
        }else{
            Number();
        }
    }


    public void add(){
        function f2 = new function();
        function f3 = new function();
        f2.setName("char");
        f3.setName("num");
        f2.setDaemon(true);
        f3.setDaemon(true);
        f2.start();
        f3.start();
        Scanner scan = new Scanner(System.in);
        System.out.println(Thread.currentThread().getName() + " is executing");
        System.out.println("Enter the number");
        int a = scan.nextInt();
        System.out.println("Enter the number");
        int b = scan.nextInt();
        System.out.println("The value is "+ (a+b));
        System.out.println(Thread.currentThread().getName() + " is terminated");
    }

    public void Char(){
        System.out.println(Thread.currentThread().getName()+" is executing");
        for(int i=65;i<=70;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" is terminated");
    }

    public void Number(){
        System.out.println(Thread.currentThread().getName()+" is executing");
        for(int i=0;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" is terminated");
    }
}


public class Program3 {
    public static void main(String[] args) throws Exception{
        System.out.println(Thread.currentThread().getName()+" is stared");
        function f1 = new function();

        f1.setName("Adding");

        f1.start();

        f1.join();
        System.out.println(Thread.currentThread().getName()+" is terminated");
    }
}
