class alfa{
	
	private alfa() {
		System.out.println("guna");
		throw new UnsupportedOperationException("Cannot instantiate MathUtils");
	}
	
	alfa(int a){
		this();
	}
}






public class program3 {

	public static void main(String[] args) {
		
		try {
			alfa a = new alfa(1);
		}catch(Exception e) {
			System.out.println("error");
		}
		

	}

}
