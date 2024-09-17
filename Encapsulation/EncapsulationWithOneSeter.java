class Customer2{
	private int cId;
	private String cName;
	private int cNum;
	
	public void setData(int cId , String cName , int cNum) {
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




public class EncapsulationWithOneSeter {

	public static void main(String[] args) {
		Customer2 c = new Customer2();
		c.setData(1233, "Guna", 78362860);
		
		System.out.println(c.getCustomerId());
		 System.out.println(c.getCustomerName());
		 System.out.println(c.getCustomerNum());

	}

}
