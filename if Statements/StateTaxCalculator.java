import java.util.Scanner;

public class StateTaxCalculator
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to the State Tax Calculator");
        System.out.println("-----------------------------------");
        
        System.out.print("Please enter a net income:  $");
        double income = userInput.nextDouble();
        double tax; // values

        double y;
    
               
        if (income<=15000)
        {   //No tax paid here
            System.out.println("No tax paid for the first $15,000!");
        }
        else if (income>15000 && income<=30000)  // // check 15000 < income < 30000
        {   // Pay 6% tax here for amount of money
          y = income - 15000; // Find differnce to calculate x*0.06
          tax = y*0.06;
          System.out.printf("The state tax due on income = $ %3.2f  \n ", income);
          System.out.printf("is $ %3.2f and it is the Tax for low bracket \n", tax);
          //----------------------------------------------------------------
        }
         else      // income >  30000
        {   
            // Pay 12% tax here for amount of money
          y = income - 30000; // Find differnce to calculate x * 0.12
          tax = y*0.12;    // find tax on the top bracket, a will = 12% tax
          System.out.printf("The state tax due on income = $ %3.2f  \n ", income);
          System.out.printf("is $ %3.2f and it is the Tax for upper bracket \n", tax);
          //----------------------------------------------------------------      
        }
        
  
        
        
    }
}