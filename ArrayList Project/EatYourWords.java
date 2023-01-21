import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class EatYourWords
{
    private static final int TOTAL = 118320;
    private static ArrayList<String> dictionary = new ArrayList<String>();

    static
    {
        try
        {
            File file = new File("dictionary.txt");
            Scanner readFile = new Scanner(file);
            for (int j = 0; j < TOTAL; j++)
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

    }
}
