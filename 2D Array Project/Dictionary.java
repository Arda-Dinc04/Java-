import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Dictionary
{
    private static final int TOTAL = 118320;
    private static ArrayList<String> dictionary = new ArrayList<String>();

    static
    {
        try
        {            
            File file = new File("dictionary.txt");
            Scanner readFile = new Scanner(file);
            for (int i = 0; i < TOTAL; i++)
            {
                dictionary.add(readFile.nextLine());
            }
            readFile.close();
        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
    }

    public static void main(String[] args)
    {

        ArrayList<String> zzzResult = findZZZs(dictionary);
        System.out.println("This is the result of the findZZZs method:\n");
        System.out.println(zzzResult);
        //System.out.println("\nThis is the result of filling a 3x5 array with the previous ArrayList:\n");
        //String[][] zzzMakesMeSleepy = fillArray(zzzResult, 3, 5);
        //printArrayNicely(zzzMakesMeSleepy);
        //System.out.println();

        //ArrayList<String> matching = matchingHeadAndTail(dictionary);
        //System.out.println("This is the result of the matchingHeadAndTail method:\n");
        //System.out.println(matching);
        //System.out.println("\nThis is the result of filling a 10x7 array with the previous ArrayList:\n");
        //String[][] matchGame = fillArray(matching, 10, 7);
        //printArrayNicely(matchGame);

    }

    /**
     * The findZZZs method will simply return all of the words in the dictionary which have
     * three or more zs.
     * 
     * @param  words  An ArrayList<String> to parse to see which ones have three or more zs.
     * 
     * @return        null, if words is null;
     *                otherwise return an ArrayList<String> holding all words from the parameter
     *                which have three or more zs.
     */
    private static ArrayList<String> findZZZs(ArrayList<String> words)
    {        
        return null;  //This will need to change.
    }

    /**
     * The matchingHeadAndTail method will look through the parameter and return an ArrayList<String>
     * which holds all of the words which are of length 6 or more where the first three letters are the
     * same as the last three letters.
     * 
     * @param  words  The list to look through.
     * 
     * @return        null, if words is null; 
     *                otherwise return an ArrayList<String> with all words from the parameter
     *                which are 6 or more letters long where the first three letters are the
     *                same as the last three letters.
     */
    private static ArrayList<String> matchingHeadAndTail(ArrayList<String> words)
    {
        return null;  //This will need to change.
    }

    /**
     * The fillArray method creates a String[][] with the number of rows and columns specified
     * in the rows and cols parameters.  It then fills the output array with the values
     * in input. 
     * 
     * It fills the output array in column-major order.
     * 
     * If the output array is too small to hold all of the values on input, then as many values
     * as fit will be put on the output array and the rest of them will be discarded.
     * 
     * If the output array is too big to hold all of the values on input, then the empty spots will
     * be filled with "XXXXX" instead.
     * 
     * @param  input  An ArrayList<String> with values to put on the output array.
     * @param  rows   The number of rows in the output array.
     * @param  cols   The number of columns in the output array.
     * 
     * @return        null, if input is null, rows <= 0, or cols <= 0; 
     *                otherwise a String[][] filled with the values of input in row major order,
     *                with excess values discarded or empty spots filled with "XXXXX".
     */
    private static String[][] fillArray(ArrayList<String> input, int rows, int cols)
    {
        return null;
    }

    /**
     * printArrayNicely will take the incoming String[][], and print it
     * to the screen in a "nice" way, where each number is right-justified
     * in such a way so that everything lines up nice and neat.
     * 
     * If the incoming array is null, the method simply prints "null".
     * 
     * @param  array  The array to print.
     */
    private static void printArrayNicely(String[][] array)
    {
        int longest = array[0][0].length(); 
        for (String[] row : array)
        {
            for (String word : row)
            {
                if (word.length() > longest)
                    longest = word.length();
            }
        }

        for (String[] row : array)
        {
            for (String word : row)
            {
                int diff = longest - word.length();

                for (int i = 1; i <= diff; i++)
                    System.out.print(" ");

                System.out.print(word + " ");
            }
            System.out.println();
        }
    }  
}
