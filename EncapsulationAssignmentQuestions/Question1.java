import java.util.Scanner;


class Customer{
	private int cId;
	private String cName;
	private String cEmail;
	private long cNumber;
	private String cPassword;
	private String cAddress;
	
	
	public void setCId(int cID) {
		this.cId = cID;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	public void setCEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public void setCNumber(long cNumber) {
		this.cNumber = cNumber;
	}
	public void setCPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public void setCAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	
	
	public  int getCId() {
		return cId;
	}
	public  String getCName() {
		return cName;
	}
	public  String getCEmail() {
		return cEmail;
	}
	public  long getCNumber() {
		return cNumber;
	}
	public  String getCPassword() {
		return cPassword;
	}
	public  String getCAddress() {
		return  cAddress;
	}
	
	
}


public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Customer ID: ");
		int cId = scan.nextInt();
		System.out.println("Enter Customer Name: ");
		scan.nextLine();
		String cName = scan.nextLine();
		System.out.println("Enter Customer Email: ");
		String cEmail = scan.nextLine();
		System.out.println("Enter Customer Number: ");
		long cNum = scan.nextLong();
		System.out.println("Enter Customer Password: ");
		scan.nextLine();
		String cPassword = scan.nextLine();
		System.out.println("Enter Customer Address: ");
		String cAddress = scan.nextLine();
		
		
		Customer c = new Customer();
		
		c.setCId(cId);
		c.setCName(cName);
		c.setCEmail(cEmail);
		c.setCNumber(cNum);
		c.setCPassword(cPassword);
		c.setCAddress(cAddress);
		
		
		System.out.println("Coustomer INFO !");
		System.out.println();
		
		System.out.println(c.getCId());
		System.out.println(c.getCName());
		System.out.println(c.getCEmail());
		System.out.println(c.getCNumber());
		System.out.println(c.getCPassword());
		System.out.println(c.getCAddress());
		
		scan.close();
	}

}
