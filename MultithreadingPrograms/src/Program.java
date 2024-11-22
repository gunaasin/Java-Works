import java.util.RandomAccess;

class Demo1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Connection one started");
        for(int i=0;i<100;i++){
            System.out.println("Connection established");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        System.out.println("Connection one terminated");
        }
    }


class Demo2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Connection two started");
        for(int i=65;i<100;i++){
            System.out.println((char) i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Connection two terminated");
    }
}
class Demo3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Connection three started");
        for(int i=1;i<100;i++){
            System.out.println("Guna " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Connection three terminated");
    }
}

class Demo4 implements Runnable{
    @Override
    public void run() {
        System.out.println("Connection four started");
        for(int i=1;i<100;i++){
            System.out.println("System connected");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Connection four terminated");
    }
}



public class Program {
    public  static void main(String[] args){
    Demo1 d1 = new Demo1();
    Demo2 d2 = new Demo2();
    Demo3 d3 = new Demo3();
    Demo4 d4 = new Demo4();
    Thread t1 = new Thread(d1);
    Thread t2 = new Thread(d2);
    Thread t3 = new Thread(d3);
    Thread t4 = new Thread(d4);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
}
