package com.tap.package2;

import com.tap.package1.Demo1;

public class Demo3 extends Demo1{

	void disp() {
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c); // because of package access only access in same package
//		System.out.println(d);// private access only access only on a class other wise to
	}


}
