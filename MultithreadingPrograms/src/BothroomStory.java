class Bothroom{
    synchronized public static void use(){
        try{
            System.out.println(Thread.currentThread().getName() +" has enter the bothroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() +" use the bothroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() +" has exit the bothroom");
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();;
        }
    }
}

class Ram extends Thread{
    Bothroom bath;
    Ram(Bothroom bath){
        this.bath=bath;
    }

    @Override
    public void run(){
        bath.use();
    }
}
class Guru extends Thread{
    Bothroom bath;
    Guru(Bothroom bath){
        this.bath=bath;
    }
    @Override
    public void run(){
        bath.use();
    }
}
class Alan extends Thread{
    Bothroom bath;
    Alan(Bothroom bath){
        this.bath=bath;
    }
    @Override
    public void run(){
        bath.use();
    }
}
class Basker extends Thread{
    Bothroom bath;
    Basker(Bothroom bath){
        this.bath=bath;
    }
    @Override
    public void run(){
        bath.use();
    }
}
class Gosling extends Thread{
    Bothroom bath;
    Gosling(Bothroom bath){
        this.bath=bath;
    }
    @Override
    public void run(){
        bath.use();
    }
}


public class BothroomStory {
    public static void main(String[] args){
        Bothroom bathroom = new Bothroom();

        Alan alan = new Alan(bathroom);
        Guru guru= new Guru(bathroom);
        Ram ram = new Ram(bathroom);
        Gosling gosling = new Gosling(bathroom);
        Basker basker = new Basker(bathroom);

        alan.setName("Alan");
        guru.setName("Guru");
        ram.setName("Ram");
        gosling.setName("Gosling");
        basker.setName("Basker");

        gosling.start();
        alan.start();
        guru.start();
        ram.start();
        basker.start();
    }
}
