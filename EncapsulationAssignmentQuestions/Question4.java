import java.util.Scanner;

class Customer3{
	private int cId;
	private String cName;
	private String cEmail;
	private long cNumber;
	private String cPassword;
	private String cAddress;
	
	
	public Customer3() {
		
	}
	
	public Customer3(int cId, String cName, String cEmail, long cNumber, String cPassword, String cAddress ) {
		this.cId =cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNumber = cNumber;
		this.cPassword = cPassword;
		this.cAddress = cAddress;
	}
	
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

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Customer ! ");
		int n = scan.nextInt();
		
		Customer3[] data = new Customer3[n];
		
		for(int i=0;i<n;i++) {

			System.out.println("Enter Customer ID: ");
			int cId = scan.nextInt();
			System.out.println("Enter Customer Name: ");
			scan.nextLine();
			String cName = scan.nextLine();
			String cEmail = null;
			while(true) {
			System.out.println("Enter Customer Email: ");
			String es =scan.nextLine();
				if(es.toLowerCase().contains("gmail.com") || es.toLowerCase().contains("yahoo.com")) {
					cEmail = es;
					break;
				}else {
					System.out.println("Enter correct domain name !!");
				}
			}
			
			System.out.println("Enter Customer Number: ");
			long cNum = scan.nextLong();
			System.out.println("Enter Customer Password: ");
			scan.nextLine();
			String cPassword = scan.nextLine();
			System.out.println("Enter Customer Address: ");
			String cAddress = scan.nextLine();
			
			Customer3 c = new Customer3();
			c.setCId(cId);
			c.setCName(cName);;
			c.setCEmail(cEmail);
			c.setCNumber(cNum);
			c.setCPassword(cPassword);
			c.setCAddress(cAddress);
			
			
			data[i]=c;
		}
		
		
		
		for(Customer3 r :data) {
			System.out.println("Customer INFO !");
			System.out.println();
			
			System.out.println(r.getCId());
			System.out.println(r.getCName());
			System.out.println(r.getCEmail());
			System.out.println(r.getCNumber());
			System.out.println(r.getCPassword());
			System.out.println(r.getCAddress());
		}
		
	}

}
