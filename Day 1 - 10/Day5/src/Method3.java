class module{
		int c ;
	void add(int num1, int num2){
		c = num1 + num2;
		System.out.println(c);
	}
}

class Method3{
	public static void main(String[] args){
		int a = 10;
		int b = 55;
		module fun = new module();
		fun.add(a,b);
	}
}