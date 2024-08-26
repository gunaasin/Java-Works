public class commonMultiples {

  
    public static int gcd(int a, int b) {
        int min = a < b ? a : b; 
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
            	System.out.println(i);
                return i; 
            }
        }
        return 1; 
    }

   
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); 
        
    }

    
    public static void findCommonMultiples(int a, int b, int count) {
        int lcm = lcm(a, b); 
        for (int i = 1; i <= count; i++) {
            System.out.println(lcm * i); 
        }
    }

    public static void main(String[] args) {
        int num1 = 3; // Number 1
        int num2 = 4; // Number 2
        int count = 9; // Number of common multiples to find
        findCommonMultiples(num1, num2, count);
    }
}
