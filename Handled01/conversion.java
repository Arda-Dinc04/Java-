import java.util.Scanner;

public class conversion{
public static void main(String[] args)
{
/*
 * Convert fahreneit into celsius (ints and doubles) using methods
 * Have a method that does the conversion call the mthod int the main method to run it
 */  
    double celsius;
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter in a degree of Fahrenheit to convert to Celsius:  ");
    double input = userInput.nextDouble();  // input is fahrenieht degree
    
    celsius = converter(input);  // 
    
    System.out.println("Celsius is " + celsius);
    
}


public static double converter(double a)
{
    double numC = ((a - 32)*(5.0/9));
    return numC;
}

}