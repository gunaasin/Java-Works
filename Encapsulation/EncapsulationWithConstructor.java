class Customer3{
	private int cId;
	private String cName;
	private int cNum;
	
	// constructor is setter.
	Customer3(int cId , String cName , int cNum) { 
		// who's name same as class name , 
		// who don't have a return type that is Constructor.
		this.cId =cId;
		this.cName = cName;
		this.cNum = cNum;
	}
	
	Customer3() { 

		cId =345;
		cName = "GuNa";
		cNum = 423424;
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
		Customer3 c = new Customer3(2112,"Guna",76757645); // Constructor call during Object creation
		
		
		System.out.println(c.getCustomerId());
		 System.out.println(c.getCustomerName());
		 System.out.println(c.getCustomerNum());
		 
		 Customer3 c1 = new Customer3();
		 System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getCustomerNum());

	}

}
