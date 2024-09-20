import java.util.Scanner;
class Restaurant3{
	public int id;
	public String fName;
	private String email;
	private long phone;
	private String address;
	
	public Restaurant3(int id, String fName, String email, long phone, String address){ 
		this.id=id;
		this.fName=fName;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return fName;
	}
	public String getEmail() {
		return email;
	}
	public long getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

}
public class Question8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of order"); 
		int n = scan.nextInt();
		Restaurant3[] arr = new Restaurant3[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter " + (i+1) +" order ID: ");
			int id = scan.nextInt();
			System.out.println("Enter Food Name: ");
			scan.nextLine();
			String fName = scan.nextLine();
			System.out.println("Enter Customer Email: ");
			String cEmail = scan.nextLine();
			System.out.println("Enter Customer Number: ");
			long cNum = scan.nextLong();
			System.out.println("Enter Customer Address: ");
			scan.nextLine();
			String cAddress = scan.nextLine();

			Restaurant3 a = new Restaurant3(id,fName,cEmail,cNum,cAddress);
			arr[i]=a;
		}
		
		for(Restaurant3 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getPhone());
			System.out.println(s.getAddress());
			System.out.println();
		}
		
	}
}
