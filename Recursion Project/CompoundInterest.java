import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter in the initial investment: "); 
        double intial = userInput.nextDouble();
        System.out.println("Please enter in the investment return in percent: ");
        double percent = userInput.nextDouble();
        System.out.println("Please enter in the positive integer number of years: ");
        int numOfYears = userInput.nextInt();
    
        double compounded = calculator(intial, percent, numOfYears);
    
        System.out.println("After " +numOfYears+ " years at " +percent+ " intrest," +intial+ " will have grown to " + compounded);
    }
    
    public static double calculator(double intial, double percent, int years){
    if(years == 0)
        return intial;
    else
        return (1+ percent/100.0) * calculator(intial, percent, years-1);
    
    
    }
}
