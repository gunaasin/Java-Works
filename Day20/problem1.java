import java.util.Scanner;

public class problem1 {

	public static int process(int n1 ,int n2) {
		int a=n1;
		int b=n2;
		int min = a<b?a:b;	
		int count = 0 , value = 1;
		while(count < value) 
		{
				if(a==b) 
				{
					return a;	
				}
				else if(a<b)
				{
					b = b-a;				
					count++;
					value++;	
				}
				else
				{
					a = a-b;					
					count++;
					value++;
				}
			}
		return 1;
	}
	
	
	public static void test1(int n) {
		String m = Integer.toString(n);

		int count = 0;
		for(int i=0;i<m.length();i++) {			
			count = count + (m.charAt(i)-'0');
//			count += m.charAt(i) - '0';
		}
		System.out.println(count);
	}
	
	
	public static void test2(int n) {
		
		int num=0;
		int res =0;
		while(n!=0) {
			res = n%10;
			num = num+res;
			n=n/10;
		}
		System.out.println(num);
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		char a = '1';
		char b = '2';
		
		System.out.println((int)(a) +" " +(int)(b));
		
		int n = scan.nextInt();
		test2(n);
		test1(n);
//		int n2 = scan.nextInt();
		
//		System.out.println(process(n1 , n2));

	}

}
