class Student{
	private String stName; 
	private int stId;
	private int stNum;
	
	Student(){ // constructor chaining is call one constructor to another constructor  
			   // multiple constructor with same name with different parameter in same class that is represent by constructor over loading 
		stName = "Guna";
		stId = 5595;
		stNum = 883862;
	}
	
	Student(int stId){
		this();
		this.stId = stId;
	}
	
	Student(String stName , int stID , int stNum){
		this(stID);
		print();
	}
   
	void print() {
		System.out.println("is the this reffering obj " + this);  // this reffer corrently reffering object to see in console!!!
	}
	
	public String getName() {
		return stName;
	}
	public int getId() {
		return stId;
	}
	public int getNum() {
		return stNum;
	}
	
}



public class EncapsulationWithConstructorChaining {

	public static void main(String[] args) {
		
		
		Student d = new Student("GuNa" , 96255 , 28436925);
		Student d2 = new Student("G" , 9635 , 28425);
		Student d3 = new Student("ewrG" , 9635 , 284245665);
		Student d4 = new Student("efG" , 956635 , 28425);
		 
		 
		 System.out.println(d.getName() +" " + d.getId() + " " + d.getNum());
		System.out.println(d4);
		 
		
	}

}
