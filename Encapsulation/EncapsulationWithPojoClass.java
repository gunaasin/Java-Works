import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private String eMailId;
	private String address;
	
	public Employee(){
		
	}
	public Employee(int id , String name,String eMailId , String address) {
		this.id=id;
		this.name = name;
		this.eMailId = eMailId;
		this.address = address;
	}

	public void setID(int id) {
		this.id=id;
	}
	public void setName( String name) {
		this.name=name;
	}
	public void setEmailID( String eMailId) {
		this.eMailId=eMailId;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return eMailId;
	}
	public String getAddress() {
		return address;
	}
}


public class EncapsulationWithPojoClass {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 
		 String data = scan.nextLine();
		 String[] ar = data.split(",");
		 int id = Integer.parseInt(ar[0]);
		 String name =ar[1];
		 String eMailId = ar[2];
		 String address=ar[3];
		 
		 
		 Employee e= new Employee();
		 e.setID(id);
		 e.setName(name);
		 e.setEmailID(eMailId);
		 e.setAddress(address);
		 
		 System.out.println(e.getID());
		 System.out.println(e.getName());
		 System.out.println(e.getEmailId());
		 System.out.println(e.getAddress());
		
         scan.close();
	}

}
