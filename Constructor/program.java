
class Demo{
	int a ;
	
	Demo(){
		this(10); // must the constructor call in first statement of constructor
		System.out.println("hey");
	}
	
	Demo(int a){
		
		this.a=a;
		System.out.println("hey" + this.a);
	}
	
}
public class program {

	public static void main(String[] args) {
		Demo d = new Demo();
	}

}
