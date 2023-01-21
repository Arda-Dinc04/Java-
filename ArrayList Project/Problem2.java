import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Problem2
{
    private static final int TOTAL = 118320;

    public static void main(String[] args)
    {
        long startTime = 0, endTime = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many times do you want to load up the dictionary (0 to quit)?  ");
        int choice = userInput.nextInt();
        while (choice >= 1)
        {
            System.out.println("\nTesting speed of regular arrays...");
            startTime = System.nanoTime();
            loadUpRegularArray(choice);
            endTime = System.nanoTime();
            System.out.println((endTime - startTime)/1000000000.0 + " seconds.");

            System.out.println("\nTesting speed of ArrayLists...");
            startTime = System.nanoTime();
            loadUpArrayList(choice);
            endTime = System.nanoTime();
            System.out.println((endTime - startTime)/1000000000.0 + " seconds.");

            System.out.print("\nHow many times do you want to load up the dictionary (0 to quit)?  ");
            choice = userInput.nextInt();
        }
    }

    private static void loadUpRegularArray(int times)
    {
        String[] dictionary = null;
        for (int i = 1; i <= times; i++)
        {
            try
            {   
                dictionary = new String[TOTAL];
                File file = new File("dictionary.txt");
                Scanner readFile = new Scanner(file);
                for (int j = 0; j < TOTAL; j++)
                {
                    dictionary[j] = readFile.nextLine();
                }
                readFile.close();
            }
            catch (Exception error)
            {
                error.printStackTrace();
            } 
        }
    }

    private static void loadUpArrayList(int times)
    {
        ArrayList<String> dictionary = new ArrayList<String>();
        for (int i = 1; i <= times; i++)
        {
            try
            {
                dictionary.clear();
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
    }
}
