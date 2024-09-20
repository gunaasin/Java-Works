import java.util.Scanner;

class Coustomer{
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
public class Question2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many Coustomers are there : ");
		int n = scan.nextInt();
		Customer[] arr = new Customer[n];
		
		for(int i=0;i<n;i++) {
			
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
			arr[i]=c;
		}
		
		
		for(Customer s:arr) {
			
			System.out.println("Coustomer INFO !");
			System.out.println();
			
			System.out.println(s.getCId());
			System.out.println(s.getCName());
			System.out.println(s.getCEmail());
			System.out.println(s.getCNumber());
			System.out.println(s.getCPassword());
			System.out.println(s.getCAddress());
		}
		
	}

}
