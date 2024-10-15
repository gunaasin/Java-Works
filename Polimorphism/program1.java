
class plane{
	void fly() {
		System.out.println("plane is fly");
	}
}

class CorgoPlane extends plane{
	@Override
	void fly() {
		System.out.println("corgoplane fly in lower height");
	}
	
	void carry(){
		System.out.println("corgo plane carry cargo");
	}
}

class PassengerPlane extends plane{
	@Override
	void fly() {
		System.out.println("passenger plane fly medium height");
	}
	
	void carry() {
		System.out.println("corgo plane carry cargo");
	}
}

class FighterPlane extends plane{
	@Override
	void fly() {
		System.out.println("fighter plane fly any height");
	}
	
	void carry() {
		System.out.println("corgo plane carry cargo");
	}
}


class Airport{
	void permit(plane ref) {
	       ref.fly();
//	       ((CorgoPlane)(ref)).carry();
	}
}


public class program1 {

	public static void main(String[] args) {
		plane ref;
		CorgoPlane c = new CorgoPlane();
		PassengerPlane p = new PassengerPlane();
        FighterPlane f = new FighterPlane();
        
        Airport a = new Airport();
        a.permit(c);
        a.permit(p);
        a.permit(f);
		
        	   
		       

		       
		
	
	}

}
