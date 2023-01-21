import java.util.Scanner;

public class PerrysPerfectPens
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        double total;
        System.out.print("How many pens do you want to purchase?");
        int pens = userInput.nextInt();
        
        System.out.println("\nYou bought " + pens + " pens.");
    
            
        
        if (pens < 5)
        {
            System.out.println("Each pen is $7.99");
            total = pens * 7.99;
            System.out.println("Your total is $" + total);
        }
        
        else if (pens>=5 && pens<=9)
        {
            System.out.println("Each pen is $7.49");
            total = pens * 7.49;
            System.out.println("Your total is $" + total);
        }
        
        else if (pens>=10 && pens<=19)
        {
            System.out.println("Each pen is $6.99");
            total = pens * 6.99;
            System.out.println("Your total is $" + total);
        }
        
        
        else if (pens>20)
        {
            System.out.println("Each pen is $6.19");
            total = pens * 6.19;
            System.out.println("Your total is $" + total);
        }
    
        
    }
}