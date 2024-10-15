class heart{
	private String feelings;
	private String pain;
	
	public heart(String feelings , String pain) {
		this.feelings=feelings;
		this.pain=pain;
	}
	
	public String getFeelings() {
		return feelings;
	}
	
	public String getPain() {
		return pain;
	}
}

class brain{
	private String memorys;
	private String whoIam;
	
	public brain(String memorys , String whoIam) {
		this.memorys=memorys;
		this.whoIam=whoIam;
	}
	
	public String getMemorys() {
		return memorys;
	}
	
	public String getWhoIam() {
		return whoIam;
	}
}

class bike{
	private String name;
	private float toopSpeed;
	
	public bike(String name, float toopSpeed) {
		super();
		this.name = name;
		this.toopSpeed = toopSpeed;
	}
	
	public String getName() {
		return name;
	}
	public float getToopSpeed() {
		return toopSpeed;
	}
	
	
}

class book{
	private String name;
	private String author;
	
	public book(String name , String author) {
		this.name=name;
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	public String getName() {
		return name;
	}
}


class student{
	
	//composition
	 heart h = new heart("noFeelings" , "allMightteePush");
	 brain b = new brain("reviceEveryDay", "realMe");
	 
	 
	 
	 
	 
	 public void hasAbike(bike b1) {
		 System.out.println(b1.getToopSpeed());
		 System.out.println(b1.getName());
		
	 }
	 
	 public void hasAbook(book b2) {
		 System.out.println(b2.getName());
		 System.out.println(b2.getAuthor());
	 }
}





public class AssignmentQuestion {

	public static void main(String[] args) {
		
		student s = new student();
		
		System.out.println(s.b.getMemorys());
		System.out.println(s.b.getWhoIam());
		
		System.out.println(s.h.getFeelings());
		System.out.println(s.h.getPain());

		// Accrication
		bike b1 = new bike("RR3TEN" ,170);
		book b2 = new book("Java", "Jamesgosling");
		
		s.hasAbike(b1);
		s.hasAbook(b2);
		
		
		
//		accrication + composition = assosiation

	}

}
