import java.util.Scanner;

class Adding extends Thread{
	
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Adding Start");
		System.out.println("Enter the 1number");
		int n = scan.nextInt();
		System.out.println("Enter the 2Number");
		int m = scan.nextInt();
		System.out.println(n+m);
		System.out.println("Adding is Terminated");
	}
}


class PrintNumber extends Thread{
	@Override
	public void run() {
			System.out.println("Print number is started");
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				try {
				
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("sleep has a exception");
				}
			}
			
			System.out.println("Print number is terminated");
			
	}
}

class PrintChar extends Thread{
	@Override
	public void run() {
		System.out.println("Print char is startd");
		for(int i=65;i<70;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("Print char is a problem of thread");
			}
		}
		
		System.out.println(" Print char terminated");
	}
}



public class Program1 {
	public static void main(String[] args) {
		Adding a = new Adding();
		PrintNumber n = new PrintNumber();
		PrintChar c = new  PrintChar();
		a.start();
		n.start();
		c.start();
	}

}
