import java.util.Scanner;

class Menu3{
	private int id;
	private String name;
	private int price;
	private String description;
	
	
	public Menu3(int id,String name ,int price ,String description) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.description=description;
	}
	
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
public class Question13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Orders ");
		int n= scan.nextInt();
		Menu3[] arr = new  Menu3[n];
		scan.nextLine();
			
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter data !");
			String data = scan.nextLine();
			String[] list = data.split(",");
			int id = Integer.parseInt(list[0]);
			String name = list[1];
			int price = Integer.parseInt(list[2]);
			String description = list[3];
			
			Menu3 m = new Menu3(id,name,price,description);
			arr[i]=m;
		}
			
			
		for(Menu3 s:arr) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println(s.getDescription());
			System.out.println();
		}	
	}
}
