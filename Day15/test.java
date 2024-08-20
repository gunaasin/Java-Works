import java.util.Scanner;

public class test {
	
	static int indexOf(String n , char ch){
		
		for (int i =0;i<n.length();i++)
		{
			if(ch==n.charAt(i))
			{
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		System.out.println(indexOf(s,ch));
		
		
	}
}












//String s = "Name";
//System.out.println(s.length());
//System.out.println(s.charAt(3));
//String t = "";
//t = t+(char)(s.charAt(0)+32);
//t = t+(char)(s.charAt(1));
//System.out.println(t);
//
//System.out.println(s.indexOf("e"));