import java.util.Scanner;

public class SplitWord
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        String input = "";

        System.out.println("*********************************************");
        System.out.println("* Welcome to the Split Word Testing Chamber *");
        System.out.println("*********************************************");

        while (!input.equalsIgnoreCase("quit"))
        {
            System.out.print("\nWhich phrase do you want to split up (or quit to stop):  ");
            input = userInput.nextLine();

            if (!input.equalsIgnoreCase("quit"))
            {
                input = input.replaceAll("[^a-zA-Z\\s]", "");  //Don't worry about how this works!
                while (input.indexOf("  ") >= 0)               //It is eliminating funny characters
                    input = input.replaceAll("  ", " ");       //so the precondition of spliteWord is met
                
                splitWord(input);
            }
        }
    }

}
