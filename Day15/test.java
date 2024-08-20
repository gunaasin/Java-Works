
public class test {
	public static void main(String[] args) {
		String s = "Name";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		String t = "";
		t = t+(char)(s.charAt(0)+32);
		t = t+(char)(s.charAt(1));
		System.out.println(t);
	}
}
