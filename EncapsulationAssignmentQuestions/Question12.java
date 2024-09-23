import java.util.Scanner;

class Menu2{
	private int id;
	private String name;
	private int price;
	private String description; 
	
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
public class Question12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Orders ");
		int n= scan.nextInt();
		Menu2[] arr = new  Menu2[n];
			
		for(int i=0;i<n;i++) {

			System.out.println("Enter Id :");
			int id = scan.nextInt();
			System.out.println("Enter food Name : ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Enter food Price :");
			int price = scan.nextInt();
			System.out.println("Enter the description :");
			scan.nextLine();
			String description = scan.nextLine();
			
			
			Menu2 m = new Menu2();
			m.setId(id);
			m.setName(name);;
			m.setPrice(price);
			m.setDescription(description);
			
			arr[i]=m;
		}
			
			
		for(Menu2 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println(s.getDescription());
			System.out.println();
		}
		
		

	}

}
