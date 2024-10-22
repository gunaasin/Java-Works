class info{
	void ADD() {
		System.out.println("hii");
	}
}

class next extends info{
	@Override
	void ADD() {
		System.out.println("hello");
	}
	
	void sum() {
		System.out.println("hey");
	}
}

public class program2 {

	public static void main(String[] args) {
		
	
		info i = new next();
		i.ADD();
		((next)i).sum();// down casting
		
	}

}



