import java.util.Scanner;

public class DivisibleBy
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter in an integer greater than 100:  ");
        int integer = userInput.nextInt();
        
        double x = integer%2; // 231%2 = 1
        double y = integer%3;  // 231%3 = 0
        double z = integer%5;  // 231%5 = 1
        double a = integer%7;   // 231%7 = 0
        double b = integer%11;   // 231%11 = 0
        
        if (x == 0 )
        {
          System.out.println(integer + " is evenly divisible by " + 2);
        }
        else 
        {
            System.out.println(integer + " is not evenly divisible by " + 2);
        }
        
        
        
        
        
        
        if ( y==0 )
        {
          System.out.println(integer + " is evenly divisible by " + 3);
        }
        else 
        {
            System.out.println(integer + " is not evenly divisible by " + 3);
        }
        
        
        
        if (z==0 )
        {
          System.out.println(integer + " is evenly divisible by " + 5);
        }
        else 
        {
            System.out.println(integer + " is not evenly divisible by " + 5);
        }
        
        
        
        if ( a==0 )
        {
          System.out.println(integer + " is evenly divisible by " + 7);
        } 
        else 
        {
            System.out.println(integer + " is not evenly divisible by " + 7);
        }
        
        
        
        
        
        if ( b==0 )
        {
            System.out.println(integer + " is evenly divisible by " + 11);
        }
        else 
        {
            System.out.println(integer + " is not evenly divisible by " + 11);
        }
        
        
        
    }
}