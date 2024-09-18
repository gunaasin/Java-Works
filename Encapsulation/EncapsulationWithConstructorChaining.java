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
		 
		 System.out.println(d.getName() +" " + d.getId() + " " + d.getNum());
		
	}

}
