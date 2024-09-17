

class Customer{
	private int cId;
	private String cName;
	private int cNum;
	
	public void setCustomerId(int cId) {
		this.cId = cId;
	}
	public void setCustomerName(String cName) {
		this.cName = cName;
	}
	public void setCustomerNum(int cNum) {
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









public class Day2 {

	public static void main(String[] args) {
		 Customer c = new Customer();
		 c.setCustomerId(2324);
		 c.setCustomerName("Guna");
		 c.setCustomerNum(123321232);
		 
		 System.out.println(c.getCustomerId());
		 System.out.println(c.getCustomerName());
		 System.out.println(c.getCustomerNum());
		

	}

}
