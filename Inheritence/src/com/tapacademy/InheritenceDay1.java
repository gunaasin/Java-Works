package com.tapacademy;
class Parent {
	float hight = 5.8f;
	String colour = "brown";
	String hairType = "normal + kerly";
	
	public void beheviour() {
		System.out.print("Angry + Normal");
	}
	
	public void activity() {
		System.out.print("reading Books + writing");
	}
	
	
}


class child extends Parent{  // extend the all behaviour like a parent this one is the example for a inheritence 
	
}
public class InheritenceDay1 {
	
	

	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.hight);
		System.out.println(c.colour);
		System.out.println(c.hairType);
		c.beheviour();
		c.activity();

	}

}
