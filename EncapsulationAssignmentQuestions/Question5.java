import java.util.Scanner;

class Customer5{
	private int cId;
	private String cName;
	private String cEmail;
	private long cNum;
	private String cPassword;
	private String cAddress;
	public Customer5(){
//		this.cId=cId;
	}
	public Customer5(int cId , String cName, String cEmail, long cNum , String cPassword , String cAddress ){
		this.cId=cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNum = cNum;
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
	public long getcNum() {
		return cNum;
	}
	public void setcNum(long cNum) {
		this.cNum = cNum;
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




public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Customer :");
		int n= scan.nextInt();
		Customer5[] arr = new Customer5[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter Customer ID: ");
			int cId = scan.nextInt();
			System.out.println("Enter Customer Name: ");
			scan.nextLine();
			String cName = scan.nextLine();
			System.out.println("Enter Customer Email: ");
			String cEmail = scan.nextLine();
			
			
			long cNum = 0;
			while(true) {
				System.out.println("Enter Customer Number: ");
				long Num = scan.nextLong();
				long rx = Num;
				while(rx>=10) {
					rx/=10;
				}
					if(rx==6 || rx==7 || rx==8 || rx==9) {
						cNum = Num;
						break;
					}else {
						System.out.println("Enter correct mobile Number !!");
					}
			}

			System.out.println("Enter Customer Password: ");
			scan.nextLine();
			String cPassword = scan.nextLine();
			System.out.println("Enter Customer Address: ");
			String cAddress = scan.nextLine();
			
			Customer5 c = new Customer5();
			c.setcId(cId);
			c.setcName(cName);;
			c.setcEmail(cEmail);
			c.setcNum(cNum);
			c.setcPassword(cPassword);
			c.setcAddress(cAddress);
			
			arr[i]=c;
			
		}
		
		for(Customer5 d : arr) {
			System.out.println(d.getcId());
			System.out.println(d.getcName());
			System.out.println(d.getcEmail());
			System.out.println(d.getcNum());
			System.out.println(d.getcPassword());
			System.out.println(d.getcAddress());
			
			System.out.println();
		}
		
		
	}

}
