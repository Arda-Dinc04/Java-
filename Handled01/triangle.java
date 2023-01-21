import java.util.Scanner;

public class triangle{
public static void main(String[] args)
{
/*
 * Input of 3 sides of a triangle uing the inequality triangle formula to check
 * if it makes a triagle EXAMPLE(3,4,5) find the first two and add them together 
 * to make MAX, FIND the other two add them together 
 * ---------------------------------------------------------------------------------
 * * Triangle Inequality Theorem, which states that the sum of two side lengths of 
 * * a triangle is always greater than the third side. 
 */

boolean result;


result = triangleInequality(7, 5, 2);



if (result = true)
{
    System.out.println("Triangle is real");
}
else
    System.out.println("Triangle is not real");






    /*boolean result;
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter in first side of a triangle:  ");
    int a = userInput.nextInt();  
    System.out.print("Enter in second side of a triangle:  ");
    int b = userInput.nextInt();  
    System.out.print("Enter in third side of a triangle:  ");
    int c = userInput.nextInt();  
    
    result = triangleInequality(a,b,c);
    
    if (result == true)
        System.out.println("The Triangle you entered is Real");
    else
        System.out.println("The Triangle you entered is Not Real");
    */
}

// the return value is a boolean to tell us that if the output of method makes the  
// triangle real or not 
public static boolean triangleInequality(int a, int b, int c)
{
    boolean output;
    
    if(a+b>c && b+c>a && a+c> b)
         output = true;
    else 
        output = false;
        
    return output;
        

    
    /*boolean output;
    if(a+b > c && b+c > a && a+c > b)
        output = true;
    else
        output = false;
        
    return output;
    */
}

}