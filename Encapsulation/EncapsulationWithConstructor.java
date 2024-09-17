class Customer3{
	private int cId;
	private String cName;
	private int cNum;
	
	public Customer3(int cId , String cName , int cNum) {
		this.cId =cId;
		this.cName = cName;
		this.cNum = cNum;
	}
	
	
	public int getCustomerId() {
		return cId;
	}
	public String getCustomerName() {
		return cName;
	}
	public int getCustomerNum() {
		return cNum;
	}
	
	
}

public class EncapsulationWithConstructor {

	public static void main(String[] args) {
		Customer3 c = new Customer3(2112,"Guna",76757645);
		
		
		System.out.println(c.getCustomerId());
		 System.out.println(c.getCustomerName());
		 System.out.println(c.getCustomerNum());

	}

}
