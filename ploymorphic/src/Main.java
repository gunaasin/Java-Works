
class plane{
    void fly(){
        System.out.println("plane do fly");
    }

    void carry(){
        System.out.println("plane carry any thing");
    }
}
class cargoPlane extends  plane{
    @Override
     void fly(){
       System.out.println("cargoplane fly lower height");
    }

    @Override
    void carry() {
        System.out.println("cargoplane carry cargo");
    }
}

class PassengerPlane extends  plane{
    @Override
     void fly(){
       System.out.println("PassengerPlane  fly medium height");
    }

    @Override
    void carry() {
        System.out.println("PassengerPlane carry people");
    }
}
class FighterPlane extends  plane{
    @Override
     void fly(){
       System.out.println("FighterPlane  fly any height");
    }

    @Override
    void carry() {
        System.out.println("FighterPlane carry wepoan");
    }
}

class AirPort{
    public void permit(plane ref){
        ref.carry();
        ref.fly();
    }
}


public class Main {
    public static void main(String[] args) {
//        AirPort a = new AirPort();
//        a.permit(new cargoPlane());
//        a.permit(new PassengerPlane());
//        a.permit(new FighterPlane());





//        Program.add(10 , 50);


    }
}