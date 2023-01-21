public class OnlyOneReturn
{
    public static String exercise(int input)
    {
        
        
        String output;
        
        if (input < 0)
            output = "That’s too small.";
        else if (input >= 0 && input < 100)
            output = "Acceptable";
        else 
            output =  "That’s too big.";
            
            System.out.print(output);
        return output;
        
    }
}