import java.util.Scanner;

public class WordStairs
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //Testing out your wordStairs method.

        System.out.println("*******************************************");        
        System.out.println("* Welcome to the Creating Stairs Problem! *");
        System.out.println("*******************************************");

        System.out.print("\nPlease enter in some text to create stairs out of:  ");
        String input = userInput.nextLine();
        System.out.print("\nDo you want the stairs to go up or down?  ");
        String dir = userInput.nextLine();

        while (!dir.equalsIgnoreCase("up") && !dir.equalsIgnoreCase("down"))
        {
            System.out.println("\n**Error**  Please enter either \"up\" or \"down\".");
            System.out.print("\nDo you want the stairs to go up or down?  ");
            dir = userInput.nextLine();  
        }
        dir = dir.toLowerCase();
        System.out.println();
        createWordStairs(input, dir);            
    }
}
