package com.tap.package1;


class demos{
	static int a ;
	
	static {
		
		System.out.println(a);
		a=10;
	}
	
	static void function() {
		System.out.println("Also Guna");
	}
}

public class test {

	public static void main(String[] args) {
		System.out.println(demos.a);
	}

}
