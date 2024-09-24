package com.tap.package1;

class Demo{
	static int a,b;
	
	static {
		System.out.println("Inside a static block");
		a=5;
		b=a;
	}
	
	static void fun1() {
		System.out.println("Inside a static metod" + a +" and "+ b );
	}
	
	int x , y;
	
	
	void fun2() {
		System.out.println("inside a instence method");
		x=5;
		y=x;
	}
	
	 Demo() {
		System.out.println("Inside a instence constructor");
	}
	 
	 
	 {
			System.out.println("inside a insetence block ");
	 }
}

public class Day1 {

	public static void main(String[] args) {
		Demo.fun1();
		
		Demo d = new Demo();
		d.fun2();
	}

}
