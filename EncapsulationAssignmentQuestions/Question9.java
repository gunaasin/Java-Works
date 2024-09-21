import java.util.Scanner;

class Restaurant4{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
    
	public Restaurant4() {
	}

//	public Restaurant4(int id, String name,String email,long phone,String address){
//		this.id=id;
//		this.name=name;
//		this.email=email;
//		this.phone=phone;
//		this.address=address;
//	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhone(long phone) {
		this.phone=phone;
	}
	public void setAddress(String address) {
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


public class Question9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of order"); 
		int n = scan.nextInt();
		Restaurant4[] arr = new Restaurant4[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter order ID: ");
			int id = scan.nextInt();
			
			System.out.println("Enter Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			String r = name.replaceAll("\\s+", "").toLowerCase();
			
			String email = null;
			
			while(true){
				System.out.println("Enter Customer Email: ");
				String e = scan.nextLine();
				if(e.contains(r)) {
					email=e;
					break;
				}else {
					System.out.println("Domain name as the name of the restaurant :(");
				}
			}

			System.out.println("Enter Customer Number: ");
			long phone = scan.nextLong();
			
			System.out.println("Enter Customer Address: ");
			scan.nextLine();
			String address = scan.nextLine();

			Restaurant4 a = new Restaurant4();
			a.setId(id);
			a.setName(name);
			a.setEmail(email);
			a.setPhone(phone);
			a.setAddress(address);
			arr[i]=a;
		}
		
		for(Restaurant4 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getPhone());
			System.out.println(s.getAddress());
			System.out.println();
		}
		
	}}
	


