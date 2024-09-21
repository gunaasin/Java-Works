import java.util.Scanner;

class Menu{
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
public class Question11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the number of Orders ! ");
		int n = scan.nextInt();
		Menu[] arr= new Menu[n];
		
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
			
			
			Menu m = new Menu();
			m.setId(id);
			m.setName(name);;
			m.setPrice(price);
			m.setDescription(description);
			
			
			arr[i]=m;
		}
		
		for(Menu list:arr) {
			System.out.println(list.getId());
			System.out.println(list.getName());
			System.out.println(list.getPrice());
			System.out.println(list.getDescription());
			System.out.println();
		}
		

	}

}
