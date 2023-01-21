import java.util.Scanner;

public class BowlingPins
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        int rowsOfPins = 0;
        while (rowsOfPins <= 0)
        {
            System.out.println("How many rows do you want in your bowling pin setup?");
            System.out.print("Enter in a number greater than 0:  ");
            rowsOfPins = userInput.nextInt();
        }
        
        int numberOfPins = //Replace this with your call to your recursive method below.
        System.out.println("\nThere are " + numberOfPins + " total pins in this setup.");
        
    }
    
    /**
     * The constructPins method builds a bowling pin setup with the given number of rows, then then outputs
     * how many pins were put on the screen.
     * 
     * @param  rows                   The number of rows in this bowling pin setup.
     * @param  numberOfLeadingSpaces  The number of spaces to put before the first * (bowling pin) in this row.
     * 
     * @return                        The total number of pins drawn on the screen.
     * 
     * Precondition:  rows >= 1
     */
    private static int constructPins(int rows, int numberOfLeadingSpaces)
    {
        
    }
}
