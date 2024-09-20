import java.util.ArrayList;
import java.util.List;

public class Day2 {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to find all primes in the given range
    public static List<Integer> primesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Method to calculate the differences between consecutive primes
    public static List<Integer> primeDifferences(int start, int end) {
        List<Integer> primes = primesInRange(start, end);
        List<Integer> differences = new ArrayList<>();

        for (int i = 1; i < primes.size(); i++) {
            differences.add(primes.get(i) - primes.get(i - 1));
        }

        return differences;
    }

    public static void main(String[] args) {
//    	Scanner(Sy)
        int start = 10;
        int end = 50;

        List<Integer> differences = primeDifferences(start, end);
        System.out.println("Differences between consecutive primes: " + differences);
    }
}