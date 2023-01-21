import java.util.Scanner;

public class WidgetEmporium
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How many Junior Widgets did they buy? ");
        int JW = userInput.nextInt();
        
        System.out.print("How many Widgets did they buy? ");
        int W = userInput.nextInt();
        
        System.out.print("How many Deluxe Widgets did they buy? ");
        int DW = userInput.nextInt();
        
         double subTotal = (JW*3.89) + (W*5.99) + (DW*12.99);
         double TotalW = (W*5.99);
         double TotalDW = (DW*12.99);
         double TotalJW = (JW*3.89);
         double discountedPrice = subTotal * 0.95;
         
         
        System.out.println("\nCost of the Junior Widgets:  $" + TotalJW);
        System.out.println("Cost of the Widgets:  $" + TotalW);
        System.out.println("Cost of the Deluxe Widgets:  $" + TotalDW);
        
        
        System.out.println("\nSubtotal:  $" + subTotal);
        if (subTotal >= 100)
        {
            System.out.println("Discount of 5%: " + (subTotal*0.05));
            System.out.println("Discount Subtotal: " + discountedPrice);
            System.out.println("Tax at 5.75%:  $" + (discountedPrice*0.0575));
            System.out.println("Grand Total:  $" + (discountedPrice+(discountedPrice*0.0575)));
        }
        else
        {
        
        System.out.println("\nTax at 5.75%:  $" + (subTotal*0.0575));
        System.out.println("Grand Total:  $" + (subTotal+(subTotal*0.0575)));
    
        }
        
    }
}