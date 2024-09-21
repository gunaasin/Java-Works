import java.util.Scanner;

class Restaurant5{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String address;
    
	public Restaurant5() {
		
	}
	public Restaurant5(int id, String name,String email,long phone,String address){
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	
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


public class Question10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of order"); 
		int n = scan.nextInt();
		Restaurant5[] arr = new Restaurant5[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter order ID: ");
			int id = scan.nextInt();
			
			System.out.println("Enter Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.println("Enter Email: ");
			String email = scan.nextLine();
			
			long phone = 0;
			while(true) {
				System.out.println("Enter Customer Number: ");
				long Num = scan.nextLong();
				long res = Num;
				while(res>=10) {
					res/=10;
				}
					if(res==6 || res==7 || res==8 || res==9) {
						phone = Num;
						break;
					}else {
						System.out.println("Enter correct mobile Number !!");
					}
			}

			System.out.println("Enter Customer Address: ");
			scan.nextLine();
			String address = scan.nextLine();
			
		

			Restaurant5 b = new Restaurant5();
			b.setId(id);
			b.setName(name);
			b.setEmail(email);
			b.setPhone(phone);
			b.setAddress(address);
			
			arr[i]=b;
		}
		
		for(Restaurant5 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getPhone());
			System.out.println(s.getAddress());
			System.out.println();
		}
		
	}}
	


