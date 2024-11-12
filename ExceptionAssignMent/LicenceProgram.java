import java.util.Scanner;


class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Enter correct age";
	}
}

class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "Enter correct age";
	}
}

class GetLicence{
	int age;
	
	void getInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :)");
		age=scan.nextInt();
	}
	
	
	void checkvalid() throws Exception {
		
		if(age<19) {
			UnderAgeException u = new UnderAgeException();
			System.out.println(u.getMessage());
			throw u;
		}else if(age>60) {
			OverAgeException o = new OverAgeException();
			System.out.println(o.getMessage());
			throw o;
		}else {
			System.out.println("Get Your Licence :)");
		}
	}
	
}

class DrivingSchool{
	void init() {
		GetLicence g = new GetLicence();
		try {
			g.getInfo();
			g.checkvalid();
		}catch(Exception e) {
			try {
				g.getInfo();
				g.checkvalid();
			} catch (Exception e2) {
				try {
					g.getInfo();
					g.checkvalid();
				} catch (Exception e3) {
					System.out.println("pleace wait a years to get licence or Your licence applay time get over go and sleep your patner");
				}
			}
		}
	}	
}



public class LicenceProgram {

	public static void main(String[] args) {
		
		DrivingSchool d = new DrivingSchool();
		d.init();
		

	}

}
