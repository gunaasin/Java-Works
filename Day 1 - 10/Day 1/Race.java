class Race {
	public static void main(String[] args){
		car c = new car();
		c.name = "BMW";
		c.colour = "Black";
                c.speed = 380;
		c.milage = 7;

		car a = new car();
		a.name = "Audi";
		a.colour = "Red";
                a.speed = 390;
		a.milage = 5;

		a.Start();
		c.Pushpower();
                c.Stop();
	}
}


class car {
     	String name;
	String colour;
	float speed;
	float milage;
	
	void Start(){
		System.out.println("Race started ...");
		System.out.println(name +" car is leading..");
	}
        
  	void Pushpower(){
		
		System.out.println("The " + colour +" car over tack the "+ name );
	}

	void Stop(){
		System.out.println(name +" won the match");
	}

}