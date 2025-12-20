package expressions_statements_blocks.methods.basic_methods;

/**
 * Identifying The Largest Prime Factor Of A Number
 * 
 * This class demonstrates:
 * 1. Finding factors of a number
 * 2. Checking if a number is prime
 * 3. Finding the largest prime factor
 * 4. Input validation for edge cases
 * 5. Combining multiple helper methods
 * 
 * A prime factor is a prime number that divides the given number evenly.
 * The largest prime factor is the greatest prime number that divides the number.
 */
public class LargestPrimeFactor {

    /**
     * Checks if a number is prime.
     * 
     * A prime number is a number greater than 1 that has no divisors
     * other than 1 and itself.
     * 
     * @param number the number to check
     * @return true if number is prime, false otherwise
     */
    private static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }
        
        // Check for divisors from 2 to sqrt(number)
        // If any divisor is found, the number is not prime
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        
        return true; // No divisors found, it's prime
    }

    /**
     * Finds the largest prime factor of a number.
     * 
     * A prime factor is a prime number that divides the given number evenly.
     * The method finds all factors, checks which are prime, and returns the largest.
     * 
     * @param number the number to find the largest prime factor for
     * @return the largest prime factor, or -1 if number is invalid (<= 1 or negative)
     * 
     * Examples:
     * getLargestPrime(21); → returns 7 (prime factors: 3, 7, largest is 7)
     * getLargestPrime(217); → returns 31 (prime factors: 7, 31, largest is 31)
     * getLargestPrime(0); → returns -1 (0 has no prime factors)
     * getLargestPrime(45); → returns 5 (prime factors: 3, 5, largest is 5)
     * getLargestPrime(-1); → returns -1 (negative number)
     */
    public static int getLargestPrime(int number) {
        // If the number is negative or does not have any prime numbers (0 or 1),
        // return -1 to indicate invalid value
        if (number <= 1) {
            return -1;
        }
        
        // Initialize largest prime factor
        int largestPrime = -1;
        
        // Find all factors and check which are prime
        // Check from 2 to number (since 1 is not prime)
        for (int i = 2; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                // Check if the factor is prime
                if (isPrime(i)) {
                    // Update largest prime factor
                    largestPrime = i;
                }
            }
        }
        
        return largestPrime;
    }

    /**
     * Optimized version that finds largest prime factor more efficiently.
     * 
     * This version divides out factors as it finds them, which is more efficient
     * for large numbers.
     * 
     * @param number the number to find the largest prime factor for
     * @return the largest prime factor, or -1 if number is invalid
     */
    public static int getLargestPrimeOptimized(int number) {
        // Validate input
        if (number <= 1) {
            return -1;
        }
        
        int largestPrime = -1;
        int num = number;
        
        // Divide out all factors of 2
        while (num % 2 == 0) {
            largestPrime = 2;
            num /= 2;
        }
        
        // Check odd numbers from 3 onwards
        // Only need to check up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestPrime = i;
                num /= i;
            }
        }
        
        // If num is still greater than 2, it's a prime factor itself
        if (num > 2) {
            largestPrime = num;
        }
        
        return largestPrime;
    }
}

