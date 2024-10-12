package com.tap.package3;

import com.tap.package1.Demo1;

public class Demo4 {
	
	Demo1 d = new Demo1();

	void disp() {
		System.out.println(d.a);
//		System.out.println(d.b);  // this one is not possible - because protected only access same package or extends of that class
//		System.out.println(d.c);  // because of package access only access in same package
//		System.out.println(d.d);    // private access only access only on a class other wise to
	}


}
 