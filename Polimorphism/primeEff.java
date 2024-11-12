
public class primeEff {

	public static void main(String[] args) {
		        int limit = 100; // Define the upper limit
		        boolean[] prime = new boolean[limit + 1]; // +1 because array indices start at 0
		        sieveOfEratosthenes(prime, limit);
		        printPrimes(prime, limit);
		    }

		    /**
		     * Implements the Sieve of Eratosthenes algorithm to mark as false (non-prime) the multiples of each prime.
		     *
		     * @param prime  An array where prime[i] will finally be false if i is Not a prime, else true.
		     * @param limit  The upper limit for finding primes.
		     */
		    public static void sieveOfEratosthenes(boolean[] prime, int limit) {
		        // Initialize all entries as true. A value in prime[i] will finally be false if i is Not a prime, else true.
		        for (int i = 0; i <= limit; i++)
		            prime[i] = true;

		        // 0 and 1 are not prime numbers
		        prime[0] = prime[1] = false;

		        // 2 is the smallest prime number
		        for (int p = 2; p * p <= limit; p++) {
		            // If prime[p] is not changed, then it is a prime
		            if (prime[p] == true) {
		                // Update all multiples of p
		                for (int i = p * p; i <= limit; i += p)
		                    prime[i] = false;
		            }
		        }
		    }

		    /**
		     * Prints all prime numbers marked as true in the provided boolean array.
		     *
		     * @param prime  Array where prime[i] is true if i is a prime number.
		     * @param limit  The upper limit for printing primes.
		     */
		    public static void printPrimes(boolean[] prime, int limit) {
		        System.out.println("Prime numbers from 1 to " + limit + " are:");
		        for (int i = 1; i <= limit; i++) {
		            if (prime[i]) {
		                System.out.print(i + " ");
		            }
		        }
		    }
		

	

}
