import java.util.Scanner;

public class CoinFlip
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        
        System.out.print("Please enter 1 for Heads and 2 for Tails: ");
        int flip = userInput.nextInt();
        String x = ".";
        int toss = (int)(Math.random() * 2 )+1;
        System.out.println("The coin is being flipped...and the result was "+ toss +".");
        
        if (toss==1)
         x = "Heads";
        else
         x = "Tails";
        if (flip==toss)
            System.out.println("Congratulations!  You won the coin flip.");
            
        else if (flip!=toss)
            System.out.println("I’m sorry, but you have lost the coin flip. ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.print("Please enter 1 for Heads and 2 for Tails:  ");
        int coin = userInput.nextInt();
        
        int flip = (int)(Math.random()*2 +1);
        
        
                
        System.out.println("The coin is being flipped...and the result was " + flip + ". ");

        if (flip == coin)
        {
        System.out.print("Congratulations!  You won the coin flip.");
        }
        
        else 
        {
        System.out.print("I’m sorry, but you have lost the coin flip. ");
        }
        
        */
        
        
    }
}