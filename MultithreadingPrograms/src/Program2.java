class demo1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}

class demo2 extends Thread {
    @Override
    public void run() {
         try {
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is executing");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Program2 {

        public  static void main(String[] args) throws Exception {

             System.out.println(Thread.currentThread().getName()+" is executing");
             demo1 d1 = new demo1();
             demo2 d2 = new demo2();
                d1.start();
                d2.start();
                d2.join(); // after demo 2 is fininshed the work only the main thread is executee
            System.out.println(Thread.currentThread().getName()+" is terminating");


        }
}