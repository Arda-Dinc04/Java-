import java.util.Scanner;
public class MakeChange
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many cents are you trying to make change for? (or enter 0 to quit):  ");
        int amount = userInput.nextInt();
        while (amount > 0)
        {
            int result = makeChange(amount, 0);
            if (result == 1)
                System.out.println("\nThere is only 1 way to make change for " + amount + " cents.");
            else
                System.out.println("\nThere are " + result + " ways to make change for " + amount + " cents.");
            
            System.out.print("\nHow many cents are you trying to make change for? (or enter 0 to quit):  ");
            amount = userInput.nextInt();
        }
    }
    
    /**
     * The makeChange method determines how many ways you can make change of amount cents given an unlimited supply
     * of quarters, dimes, nickels, and pennies.
     * 
     * @param  amount  An int holding the number of cents we are trying to make change for.
     * @param  index   An int keeping track of where the code currently is in the denominations array.
     * 
     * @return         The number of ways you can make change for amount cents.
     */
    private static int makeChange(int amount, int index)
    {
        int[] denominations = {25, 10, 5, 1};  

    }

}
