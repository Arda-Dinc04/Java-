import java.util.Scanner;
public class Restaurant
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("* Meal Price Calculator *");
        System.out.println("*************************\n"); //Why is the \n here??
        
        System.out.print("What is the age of the customer?  ");
        int age = userInput.nextInt();

        
        if (age >= 65)
            System.out.println("\nThey can’t be negative years old! ");
            
        else if (!(age < 9 || age > 64))
            System.out.println("\nCharge them $8.99.");
            
        else if (!(age < 5 || age > 8))
            System.out.println("\nCharge them $2.99.");

        else if (!(age < 0 || age > 4))
            System.out.println("\nThey eat free!");
            
        else if (age < 0)
            System.out.println("\nCharge them $7.99.");
    }
}
