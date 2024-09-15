


class demo {
	void disp(int a) {
		System.out.println("Helo !" + a);
		MethodOverLoading as = new MethodOverLoading();
		as.disp(22);
	}
}   



public class MethodOverLoading {
	
	

	public static void disp(int b) {
		System.out.println(1);
	}

	public static void disp(char a ,  int b) {
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		disp('a','b');
		demo d = new demo();
//		disp(5);
		d.disp(5);
	}

	
	
	

}
