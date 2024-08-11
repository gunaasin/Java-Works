class car {
   String name ;
   float cost ;
}

class obb{
	public static void main(String[] args){
		
		car[] a = new car[3];
		
		a[0] = new car();
		a[0].name = "kia";
		a[0].cost = 22.3f;
		
		a[1] = new car();
		a[1].name = "bmw";
		a[1].cost = 87.6f;
		
		a[2] = new car();
		a[2].name = "Audi";
		a[2].cost = 67.6f;
		
		for(int i =0 ;i<a.length;i++){
			System.out.println(a[i].name);
			System.out.println(a[i].cost);
		}System.out.println();
		
	}
}
