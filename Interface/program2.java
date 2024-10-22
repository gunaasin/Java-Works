interface plane{
	void fly();
	void carry();
}

class fighterPlane implements plane{
	@Override
	public void fly() {
		System.out.println("fighter plane in any height");
	}
	
	@Override
	public void carry() {
		System.out.println("fighter plane carry wepon");
	}
}


class passengerPlane implements plane{
	@Override
	public void fly() {
		System.out.println("passenger plane fly medium height");
	}
	
	@Override
	public void carry() {
		System.out.println("passenger carry passengers");
		
	}
}


class AirPort{
	void permit(plane ref) {
		
		
		// in this case to achive polimorphism
		ref.fly();
		ref.carry();
	}
}




public class program2 {

	public static void main(String[] args) {
		// this method also work but not efficent;
//		plane p1 = new fighterPlane();
//		plane p2 = new passengerPlane();
//		p1.fly();
//		p1.carry();
//		
//		p2.fly();
//		p2.carry();
		
		// instaded  of create a new class and given a parent reference and pass the  clild  object arguments
		fighterPlane f = new fighterPlane();
		passengerPlane p = new passengerPlane();
		AirPort a = new AirPort();
		a.permit(f);
		a.permit(p);

	}

}
