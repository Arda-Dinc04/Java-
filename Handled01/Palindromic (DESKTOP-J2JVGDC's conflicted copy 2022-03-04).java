import java.util.Scanner;

public class Palindromic{
    public static void main(String[] args)
    {
        /*
         * Create a method find what numbers from 1 to 999 are palindromic then create a 
         * second method to print out all of the palindromic up to that number and print out 
         * the count palindromic numbers
         */

        int count = 0;
        boolean numFound = false;

        for(int num = 1; num <= 999; num++)
        {
            numFound = palindromeTester(num);

            if (numFound == true)
            {
                count++;
                System.out.println("Num = " + num);

            }

            
        }
        System.out.println("Total count is " + count);
    }

    
    // the return value is a boolean to tell us that if the output of method makes the  
    // triangle real or not 
    public static boolean palindromeTester(int a)
    {
        int first, second, third;
        boolean output = false;

        if(a<10)
            output = true;
        else if (a> 9 && a <100)
        {
            first = a%10;
            second = (a/10)%10;
            if (first == second)
                output = true;

        }
        else if (a>=100)
        {
            first = a%10;
            third = (a/100)%10;
            if (first == third)
                output = true;

        }
        return output;
    }
}