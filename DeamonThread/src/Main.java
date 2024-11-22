import java.security.spec.ECField;

class Hero extends Thread{
    @Override
    public void run() {
     try {
         Director dr = new Director();
         Camaraman cr = new Camaraman();
         dr.setName("Director");
         dr.setDaemon(true);
         dr.start();
         cr.setName("Camaraman");
         cr.setDaemon(true);
         cr.start();
         System.out.println("Hero enter the shoting spart");
         Thread.sleep(3000);
         System.out.println("Hero hear the on-day script");
         Thread.sleep(3000);
         System.out.println("Hero ready to makeup");
         Thread.sleep(3000);
         System.out.println("Hero practice the script and acting role");
         Thread.sleep(3000);
         System.out.println("Hero Acting");
         Thread.sleep(3000);
         System.out.println("Heroine goo the hotel");
     }catch (Exception e){
         e.getStackTrace();
     }
    }
}


class Heroine extends Thread{
    @Override
    public void run() {
        try{
            Director dr = new Director();
            Camaraman cr = new Camaraman();
            dr.setName("Director");
            dr.setDaemon(true);
            dr.start();
            cr.setName("Camaraman");
            cr.setDaemon(true);
            cr.start();
            System.out.println("Heroine enter the shoting spart");
            Thread.sleep(3000);
            System.out.println("Heroine enter the makeup set side-by side hear the on-day script");
            Thread.sleep(3000);
            System.out.println("Heroine finesh the makeup");
            Thread.sleep(3000);
            System.out.println("heroine ready to act");
            Thread.sleep(3000);
            System.out.println("Heroine act in behind the hero , because hero fight to the gangstars ");
            Thread.sleep(3000);
            System.out.println("Heroine goo the hotel");
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}

class Director extends  Thread{
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Director write a script");
                Thread.sleep(3000);
                System.out.println("Director tell what i want");
                Thread.sleep(3000);
                System.out.println("Cut ,Action , Repeat to tell the soating ");
                Thread.sleep(3000);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}


class Camaraman extends Thread{
    @Override
    public void run() {
        while (true){
            try{
                System.out.println("Camaraman setup the camara based on shoting spoat");
                Thread.sleep(3000);
                System.out.println("Camaraman Shot the action, seqance and moments based on the requirements");
                Thread.sleep(3000);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}



class Alfa extends Thread{
    @Override
    public void run()  {
        Thread th = Thread.currentThread();
        th.setName("char-thread");
        System.out.println("char iteration started");
        for(int i=0;i<10;i++){

            System.out.println((char) 65+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(th.getName()+" has terminated");
    }
}
class Beta extends Thread{
    @Override
    public void run()  {
        Thread th = Thread.currentThread();
        th.setName("Number-thread");
        System.out.println("number iteration started");
        for(int i=0;i<10;i++){

            System.out.println((char)(65+i));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(th.getName()+" has terminated");
    }
}


public class Main {
    public static void main(String[] args) {

        Alfa a = new Alfa();
        a.start();
        Beta b = new Beta();
        b.start();

        
//        Hero he = new Hero();
//        he.setName("Hero");
//        he.start();
//        Heroine she = new Heroine();
//        she.setName("Heroine");
//        she.start();
    }
}