package com.tapacademy;


class Test1{
	int a,b;
	public Test1() {
		a=100;
		b=200;
	}
	
	public Test1(int a , int b){
		
			this.a=a;
			this.b=b;
	}
}


class Test2 extends Test1{
	int x,y;
	public Test2() {
//		super(); this one or that one not working both 
		this(44 , 43);
		
		x=100;
		y=200;
	}
	
	public Test2(int x , int y){
		super(22 , 33);
			this.x=x;
			this.y=y;
	}
	
	public void demo() {
		System.out.println(a + " " + b + " "+ x +" " +y);
	}
	
}



public class ConstructorChaining {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.demo();
	}

}
