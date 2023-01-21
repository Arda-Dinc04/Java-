import java.util.Scanner;

public class Helper
{
    /**
     * The countSpaces method takes the incoming String parameter and returns how many
     * spaces are present inside of the string.
     * 
     * @param  text  The String to parse
     * @return  An integer containing the number of spaces inside of text
     */

    /**
     * The isAbcedarian method determines if the parameter counts as abcedarian or not.  How the 
     * incoming text is capitalized does not matter.
     * 
     * @param  text  The text parse to see if it is abcedarian.
     * @return  true, if the text conforms to being abcedarian;
     *          false, otherwise.  A blank String, i.e. "", will also return false.
     * 
     * Precondition:  text is only comprised of letters (no spaces, numbers, etc.)
     * 
     */
    private static boolean isAbecedarian(String text)
    {
        return true;  //You will need to change this line eventually.
    }

    public static void testIsAbecedarianMethod()
    {
        System.out.println("****************************************");
        System.out.println("* Testing out the isAbecedarian Method *");
        System.out.println("****************************************");
        
        System.out.println("Is \"chintz\" abcedarian?");
        System.out.println("The expected answer is true.  isAbcedarian has given back an answer of:  " + isAbecedarian("chintz"));

        System.out.println("\nIs \"g\" abcedarian?");
        System.out.println("The expected answer is true.  isAbcedarian has given back an answer of:  " + isAbecedarian("g"));

        System.out.println("\nIs \"deep\" abcedarian?");
        System.out.println("The expected answer is false.  isAbcedarian has given back an answer of:  " + isAbecedarian("deep"));

        System.out.println("\nIs \"Biopsy\" abcedarian?");
        System.out.println("The expected answer is true.  isAbcedarian has given back an answer of:  " + isAbecedarian("Biopsy"));

        System.out.println("\nIs \"abcdefghijklmnopqrstuvwxyz\" abcedarian?");
        System.out.println("The expected answer is true.  isAbcedarian has given back an answer of:  " + isAbecedarian("abcdefghijklmnopqrstuvwxyz"));

        System.out.println("\nIs \"\" abcedarian?");
        System.out.println("The expected answer is false.  isAbcedarian has given back an answer of:  " + isAbecedarian(""));

        System.out.println("\nIs \"DiLuVy\" abcedarian?");
        System.out.println("The expected answer is true.  isAbcedarian has given back an answer of:  " + isAbecedarian("DiLuVy"));
    }

    /**
     * The makeDiamond method takes a given String and turns it into a lovely diamond.
     * 
     * @param  text  The text to turn into a diamond.
     * 
     * Precondition:  text is a positive even length.
     */
    private static void makeDiamond(String text)
    {
        
    }

    public static void testMakeDiamondMethod()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("* Testing out the makeDiamond Method *");
        System.out.println("**************************************");

        System.out.println("\nPlease enter a phrase to diamond-ify (or quit to stop).");
        System.out.print("The phrase you enter must be a positive even length:  ");
        String input = userInput.nextLine();

        while (!input.equalsIgnoreCase("quit"))
        {
            if (input.length() % 2 != 0)
                System.out.println("\n**Error!!!!**  The phrase must be of even length!");
            else
            {
                System.out.println();
                makeDiamond(input);
            }

            System.out.println("\nPlease enter a phrase to diamond-ify (or quit to stop).");
            System.out.print("The phrase you enter must be a positive even length:  ");
            input = userInput.nextLine();
        }
    }
}
