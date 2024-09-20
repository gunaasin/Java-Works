import java.util.Scanner;

class Customer2{
	private int cId;
	private String cName;
	private String cEmail;
	private long cNumber;
	private String cPassword;
	private String cAddress;
	
	
	public Customer2(int cId, String cName, String cEmail, long cNumber, String cPassword, String cAddress) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNumber = cNumber;
		this.cPassword = cPassword;
		this.cAddress = cAddress;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcEmail() {
		return cEmail;
	}


	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}


	public long getcNumber() {
		return cNumber;
	}


	public void setcNumber(long cNumber) {
		this.cNumber = cNumber;
	}


	public String getcPassword() {
		return cPassword;
	}


	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}


	public String getcAddress() {
		return cAddress;
	}


	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	
	
}
public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Customer data :");
//		System.out.println("Enter the Customer data following format - 1, Guna , guna@gmail.com , 99887755 , guna@123 , Tap accademy - Btm layout Bengaluru");
		String s = scan.nextLine();
		String[] arr = s.split(",");
		int cId =Integer.parseInt(arr[0]);
		String cName =arr[1];
		String cEmail = arr[2];
		long cNumber =Long.parseLong(arr[3].trim()); // remove the trailing and leading spaces
		String cPassword = arr[4];
		String cAddress =arr[5];
		Customer2 c = new Customer2(cId , cName, cEmail, cNumber, cPassword,cAddress);
		
		
		System.out.println("Coustomer INFO !");
		System.out.println();
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcEmail());
		System.out.println(c.getcNumber());
		System.out.println(c.getcPassword());
		System.out.println(c.getcAddress());
		
	}

}
