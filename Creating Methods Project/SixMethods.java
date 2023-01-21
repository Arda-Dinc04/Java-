public class SixMethods
{
    //write the coinFlip method here
    private static String coinFlip()
    {
        int flip = (int)(Math.random() * 2);
        
        if (flip == 0)
            return "heads";
        else
            return "tails";
    }
    
    //write the repeater method here
    public static void repeater(String text, int i)
    {
        for(int k = 1; k <= i; k++)
        {
            System.out.println(text);
        }
    
    }
    
    //write the fizzBuzz method here
    public static void fizzBuzz(int x)
    {
    if (x < 0)
        System.out.println("Error!  Input must be a positive integer.");
    else
        {      
        for (int i = 1; i <= x; i++)
            {
            if ( i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz"); 
            else if (i%5 == 0)
                System.out.println("Buzz");

            else 
                System.out.println(i); 
            }
        }
    }



    //write the factors method here
    public static String factors(int input)
    {
        String factors = "";
     for (int i = 1; i <= input; i++)
     {
        
        if(input % i == 0)
        {
            factors = factors + " " + i;
            //System.out.println(i);
        }

     }
        return factors;        
        
    }
    
    //write the pythagoreanTriple method here
    public static boolean pythagoreanTriple(int a, int b, int c)
    {
        boolean result;
        a = (int)Math.pow(a,2);
        b = (int)Math.pow(b,2);
        c = (int)Math.pow(c,2);
        
        if (c == a + b)
            result = true;
        else
            result = false;
            
        return result;
    
    }
    
    //write the printNumberSquare method here
    public static void printNumberSquare(int a)
    {
        for(int i = 1; i <= a; i++)
        {
            System.out.println();
            for (int rows = 1; rows <= a; rows++)
                System.out.print(a);
        }
         
    }
}    
