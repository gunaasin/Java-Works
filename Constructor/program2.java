

class function{
	private int a;
	function(int a){
		this.a=a;
	}
	
	function(function re){
		this.a=re.a;
	}
	
	void disp() {
		System.out.println("hey " + a);
	}
}
public class program2 {

	public static void main(String[] args) {
		function f = new function(10);
		function f2 = new function(f);
		f.disp();
		f2.disp();

	}

}
