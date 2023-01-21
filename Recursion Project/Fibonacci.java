import java.util.ArrayList;
public class Fibonacci
{
    private static long count = 0;
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < 46; i++){
        array.add(1);
        }
        for(Integer num : array){
            array.get(num)
        }
        
        System.out.println("The 46th Fibonacci number is:  " + ();
        System.out.println("The 46th Fibonacci number is:  " + fibonacciRecursively(46));
        System.out.println("Count: " + count);
    }
    /**
     * The fibonnacciRecursively method returns the nth Fibonacci number.
     * 
     * @param  n  The number of the Fibonacci number to find.
     * 
     * @return    The nth Fibonacci number.
     * 
     * Precondition:  n >= 1
     */
    private static int fibonacciRecursively(int n)
    {
        count++;
        if (n <= 2)
        {
            return 1;
        }
        else
        {
            return fibonacciRecursively(n - 1) + fibonacciRecursively(n - 2);
        }
    }

}
