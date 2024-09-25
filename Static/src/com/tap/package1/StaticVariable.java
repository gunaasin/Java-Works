package com.tap.package1;

import java.util.Scanner;



public class StaticVariable {

	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan();
		b1.input();
		b1.calclation();
		b1.result();
		
	
		BusinessMan b2 = new BusinessMan();
		b2.input();
		b2.calclation();
		b2.result();
		
	}

}




class BusinessMan{
	float p;
	float t;
	static float r;
	float s;
	
	static {
		r=15.2f;
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principle amount :");
		p=scan.nextFloat();
		System.out.println("Enter tenure :");
		t=scan.nextFloat();	
	}
	
	void calclation() {
		s= (p*t*r)/100;
	}
	
	void result() {
		System.out.println("The SI is : "+ s);
	}
}