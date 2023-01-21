
public class Power
{
    public static void main(String[] args)
    {
        System.out.println("Testing out the recursive pow method:");
        System.out.println("*************************************\n");
        System.out.println("7 raised to the 0 power is " + pow(7, 0) + ".");
        System.out.println("\n3 raised to the 4th power is " + pow(3, 4) + ".");
        System.out.println("\n13 raised to the 2nd power is " + pow(13, 2) + ".");
        System.out.println("\n2 raised to the 8th power is " + pow(2, 8) + ".");
        System.out.println("\n10 raised to the 9th power is " + pow(10, 9) + ".");
        System.out.println("\n5 raised to the 11th power is " + pow(5, 11) + ".");
        System.out.println("\n\nSince most of you can't do 5 raised to the 11th power in your");
        System.out.println("head, that answer should be 48,828,125.");
    }
    
    /**  The pow method is supposed to work identically to Math.pow, except implemented
     *  recursively.
     *  
     *  @param  base      An int which holds the base of the number to calculate.
     *  @param  exponent  An int which hold the exponent of the number to calculate.
     *  
     *  @return           An int which hold the calculation of base raised to the exponenet power.
     *  
     *  Precondition:  exponent >= 0
     */
    private static int pow(int base, int exponent)
    {
        if(exponent == 0){
            return 1;
        }
        else{
            
            return base * pow(base, exponent-1);
        
        }
        
    }
}
