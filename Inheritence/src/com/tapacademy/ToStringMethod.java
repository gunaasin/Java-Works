package com.tapacademy;


class ToString{
	private String name;
	private int id;

	public ToString(String name , int id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name +"Id: "+id;
	}
	
}

public class ToStringMethod {
	public static void main(String[] arr) {
		
		ToString add = new ToString("Guna",1725);
		System.out.println(add);
		
	}

}
