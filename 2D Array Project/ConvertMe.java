import java.util.ArrayList;

public class ConvertMe
{
    public static void main(String[] args)
    {
        System.out.println("This is the null test:");
        String[][] test = null;
        ArrayList<ArrayList<String>> converted = convert(test);
        Helper.print2DArray(converted);
        
        System.out.println("\nThis is a test with 0 rows:");
        test = new String[0][2];
        converted = convert(test);
        Helper.print2DArray(converted);  
        
        System.out.println("\nThis is a test with 0 columns:");
        test = new String[4][0];
        converted = convert(test);
        Helper.print2DArray(converted);  
        
        System.out.println("\nThis is a test of normal data:");
        test = new String[][] {  {"Alaska", "Oregon", "Ohio", "Indiana"},
                                 {"Iowa", "Florida", "Montana", "Illinois"},
                                 {"Vermont", "Georgia", "Nevada", "Arizona"}  };
        converted = convert(test);
        Helper.print2DArray(converted);    
    } 
    
    /**
     * The convert method takes the incoming String[][] and returns an equivalent 
     * ArrayList<ArrayList<String>> with the same values.
     * 
     * @param  input  The String[][] to convert into an ArrayList<ArrayList<String>>.
     * 
     * @return        null, if input is null;
     *                an empty ArrayList<ArrayList<String>> if input has 0 rows or 0 columns;
     *                otherwise, an ArrayList<ArrayList<String>> with all of the values of 
     *                input, in the same [row, col] position as in input.
     */
    private static ArrayList<ArrayList<String>> convert(String[][] input)
    {
        
    }
}