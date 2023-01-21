public class Primes
{
    /**
     * isItPrime takes the parameter and determines if it is prime or not.
     * Precondition:  num >= 2
     * 
     * @param  num  the number to check whether or not it is prime
     * @return  true, if num is prime; 
     *          false, otherwise
     */
    public static boolean isItPrime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if(num%i == 0)
                return false;
  
        }
        return true; // VERY IMPORTANT ******* YOU NEED TO HAVE A RETURN STATMENT IN THE MAIN METHOD {}
    }
    
    /**
     * sumPrimes will find the sum of all the prime numbers from 2
     * all the way up to limit.
     * Precondition:  2 <= limit <= 250,000
     * 
     * @param  limit  the largest number to check to see if it is prime and
     *                should be added to the sum
     * @return  the sum of all primes in the range [2, limit]
     */
    public static int sumPrimes (int limit)
    {
        int sum = 0;
        
        for(int i = 2; i <= limit; i++)
        {
            if (isItPrime(i))
                sum += i;
        
        }
        return sum;
    }      
}
