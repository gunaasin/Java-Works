import java.util.Scanner;

interface Calculator{
	Scanner scan = new Scanner(System.in);
	public abstract void add();
	public abstract void sub();
	public abstract void div();
}

class calc1 implements Calculator{
	@Override
	public void add() {
		System.out.println(100+200);
	}
	@Override
	public void sub() {
		System.out.println(200-100);
	}
	@Override
	public void div() {
		System.out.println(100/2);
	}
}


class calc2 implements Calculator{
	@Override
	public void add() {
		
		System.out.println("enter number one - ");
		int a = scan.nextInt();
		System.out.println("enter number two - ");
		int b = scan.nextInt();
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		
		
		System.out.println("enter number one - ");
		int a = scan.nextInt();
		System.out.println("enter number two - ");
		int b = scan.nextInt();
		System.out.println(a-b);
		
	}
	@Override
	
	public void div() {
		System.out.println("enter number one - ");
		int a = scan.nextInt();
		System.out.println("enter number two - ");
		int b = scan.nextInt();
		System.out.println(a/b);
	}
}



class calculations{
	public void permit(Calculator ref) {
		ref.add();
		ref.sub();
		ref.div();
	}
}



public class program1 {

	public static void main(String[] args) {
		calc1 c1 = new calc1();
		calc2 c2 = new calc2();
		calculations c = new calculations();
		c.permit(c1);
		c.permit(c2);
		
		
		

	}

}
