import java.util.Scanner;


class Restaurant{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
	
	public void setData(int id ,String name ,String email ,long phone ,String address) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
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
public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of orders :)");
		int n = scan.nextInt();
		
		Restaurant[] arr = new Restaurant[n];
		
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

			Restaurant r = new Restaurant();
			r.setData(id, fName, cEmail,cNum , cAddress);
			arr[i] = r;

		}
		
		for(Restaurant s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getPhone());
			System.out.println(s.getAddress());
			System.out.println();
		}
		
		
	}

}
