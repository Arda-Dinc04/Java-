import java.util.Scanner;

public class Palindrome
{
    /**
     * The checkFirstAndLast method checks if the first letter and last letter of 
     * input are the same.
     * 
     * @param  input  The text to parse.
     * @return true, if both the first and last letter are the same;
     *         false, otherwise
     *         
     * Precondition:  input is at least of length 2
     * 
     * Precondition:  input is all lowercase (since reformatString takes care of it)
     */
    public static boolean checkFirstAndLast(String input)
    { 

    }
    
    /**
     * The removeFirstAndLast method returns a String that looks like input after having
     * the first and last letter removed.
     * 
     * @param  input  The text to parse.
     * @return a String with the first and last letters of input removed.  If input is
     *         exactly of length 2, then it will return "".
     *         
     * Precondition:  input is at least of length 2
     */
    public static String removeFirstAndLast(String input)
    { 

    }    
    
    /**
     * The isPalindrome method determines if input is a palindrome or not.
     * 
     * @param  input  The text to parse.
     * @return true, if input is a palindrome;
     *         false, otherwise
     *         
     * Precondition:  input is at least of length 1.
     */
    public static boolean isPalindrome(String input)
    {
        //Note:  If input is exactly of length 1 (after having been run through 
        //       reformatString), then it is automatically a palindrome.

    } 
    
    /**
     * The reformatString method takes input and returns a String which is like 
     * input with all of the punctuation and spaces removed.  It also makes it lowercase.
     * 
     * @param  input  The String to parse.
     * @return A String where all of the punctuation and spaces of input have been removed.
     *         The returned String is also all lowercase.
     *         
     * Note:  For the record, that regular expression I used up there basically says replace 
     * everything except lowercase letters and numbers with a blank String. 
     */
    public static String reformatString(String input)
    {
        String output = input;
    
        output = output.toLowerCase();
        output = output.replaceAll("[[^a-z0-9]]", "");

        return output;
    }
}
