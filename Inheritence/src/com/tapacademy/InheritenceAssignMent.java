package com.tapacademy;


class Animal{
	void Eat() {
		System.out.println("Animal eat food");
	}
	void sleep() {
		System.out.println("Animal sleep");
	}
	void run() {
		System.out.println("Animal run");
	}
	
	
}

	

class Lion extends Animal{
	@Override
	void Eat() {
		System.out.println("Lion hunt to eat a animal");
	}
	
	@Override
	void run() {
		System.out.println("Lion run medium fast");
	}
	
	void Attitude() {
		System.out.println("lion is allways a king of wild");
	}
}

class Tiger extends Animal{
	@Override
	void Eat() {
		System.out.println("Tiger hunt to eat");
	}
	
	@Override
	void run() {
	System.out.println("Tiger is super fast in runing");
	}
	
	
	void hunting() {
		System.out.println("Tigers allways group");
	}
}

class Rabbit extends Animal{
	@Override
	void Eat() {
		System.out.println("Eat an gras");
	}
	@Override
	void run() {
	System.out.println("Rabbit is super fast in runing");
	}
	
}




public class InheritenceAssignMent {
	public static void main(String[] args) {
		
		 Lion l = new Lion();
		 l.Attitude();
		 l.Eat();
		 l.run();
		 l.sleep();
		
		 System.out.println("--------------------------");
		 
	  Tiger t = new Tiger();
	  t.hunting();
	  t.Eat();
	  t.run();
	  t.sleep();
		  
		  System.out.println("--------------------------");
		  
		 Rabbit r = new Rabbit();
		 r.Eat();
		 r.run();
		 r.sleep();
		  
		
	}

}
