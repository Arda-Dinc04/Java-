import java.util.Scanner;

public class Spongebob
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int temp;
        System.out.println("Please enter some text for Spongebob: ");
        String input = userInput.nextLine(); //get input as the string value by the user
        
        input = input.toLowerCase(); //make the given sentence lower case
        System.out.println("Spongebob replies, \"");
        
        for(int i = 0; i <= input.length(); i++){
            temp = (int)(Math.random() * 2);
            System.out.println(temp);
            if (temp == 0)
                System.out.print(input.substring(i, 1 + i).toUpperCase());
            else 
                System.out.print(input.substring(i, 1 + i).toLowerCase());
        }
            
        System.out.println("\"");
            
        

    }
}
