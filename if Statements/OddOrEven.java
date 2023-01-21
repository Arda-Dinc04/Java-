import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter in an integer:  ");
        int x = userInput.nextInt();
        
        if (x == 0)
        {
        System.out.print("\nX is 0");
        }
        
        else if (x%2 == 0)
        {
        System.out.print("\nX is an even number");
        }
        else
        {
            System.out.print("\nX is an odd number");
        }
    }
}