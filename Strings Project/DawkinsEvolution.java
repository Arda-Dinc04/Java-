public class DawkinsEvolution
{
    //FYI, the length of chars is 84.
    public static final String chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz.?!,;: '\"@#$%&|()=+-*/^[]{}<>\\~`";
    
    //FYI, the length of target is 29.
    public static final String target = "Methinks it is like a weasel.";
    
    public static void main(String[] args)
    {
        String currentString = generateRandomStartingString();
        System.out.println(chars.length());
    }

    /**
     * The generateRandomStartingString generates a String of length 29 comprised of random letters from chars.
     * Duplicate letters are fine.  
     */
    private static String generateRandomStartingString()
    {
        return "";
    }
    
    /**
     * The calculate score method takes the incoming String and determines cumulatively how far away it is
     * from the target String of "Methinks it is like a weasel."
     * 
     * To do this, it is best to look at an example.  The first character in our target String is an "M"
     */
}
