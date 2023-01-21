public class TestIsOdd
{
    public static void main(String[] args)
    {
       System.out.println("isOdd(" + Integer.MIN_VALUE + ") returns " + isOdd(Integer.MIN_VALUE));
       System.out.println("isOdd(" + Integer.MAX_VALUE + ") returns " + isOdd(Integer.MAX_VALUE));
       
       //System.out.println("isOdd(0) returns " + isOdd(0));
       for(int i = -10; i <= 10; i++ )
       System.out.println("isOdd(" + i + ") returns " + isOdd(i)); 
       
       

    }
    
    public static boolean isOdd(int num)
    {
        if (num < 0)
            return num % 2 == -1;
        else
            return num % 2 == 1;
    }
}
