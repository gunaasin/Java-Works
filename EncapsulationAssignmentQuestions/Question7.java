import java.util.Scanner;


class Restaurant2{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}


public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of orders :)");
		int n = scan.nextInt();
		
		Restaurant2[] arr = new Restaurant2[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter order ID: ");
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

			Restaurant2 a = new Restaurant2();
			a.setId(id);
			a.setName(fName);
			a.setEmail(cEmail);
			a.setPhone(cNum);
			a.setAddress(cAddress);
			arr[i]=a;
		}
		
		for(Restaurant2 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getPhone());
			System.out.println(s.getAddress());
			System.out.println();
		}
		
		
	}

}
