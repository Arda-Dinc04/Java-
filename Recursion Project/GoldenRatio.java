
public class GoldenRatio
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 11; i++)
            System.out.println("The golden ratio for n = " + i + " is " + goldenRatio(i) + ".");
    }
    
    /**
     * The goldenRatio method calculates the approximate value of the golden ratio for a given int
     * named n which then gets plugged into the formula:
     * 
     * if n = 0, then f(0) = 1; otherwise f(n) = 1 + 1/f(n-1), for all n >= 0;
     * 
     * @param  n  The integer to plug into the formula.
     * 
     * @return    A double value which is the approximate value of the golden ratio for that 
     *            value of n.
     *            
     * Precondition:  n >= 0
     */
    private static double goldenRatio(int n)
    {
        if(n == 0){
        return 1;
        }
        else{
        return 1+(1/goldenRatio(n-1));
        }
        
    }
}
