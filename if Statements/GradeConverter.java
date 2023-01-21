import java.util.Scanner;

public class GradeConverter
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Please enter a grade from 1 to 100:  ");
        int x = userInput.nextInt();
        String y = "text";
        if (x>=90 && x<=100)
        {
             y = "A" ;
        }
        else if(x>=80)
        {
            y = "F";        
        }
        else if(x>=70 )
        {
            y = "C";         
        }
        else if(x>=60)
        {
            y = "D";         
        }
        else if(x>=50)
        {
            y = "F";         
        }
        
        System.out.print("A grade of " + x + " is equal to a " + y + ".");
        
        
        
        
        
        
        
        
        /*
        if (x>=90 && x<=100)
        {
            System.out.print("A grade of " + x + " is equal to an A");
        }
        else if(x>=80 && x<90)
        {
            System.out.print("A grade of " + x + " is equal to an B");
        }
        else if(x>=70 && x<80)
        {
            System.out.print("A grade of " + x + " is equal to an C");
        }
        else if(x>=60 && x<70)
        {
            System.out.print("A grade of " + x + " is equal to an D");
        }
        else if(x>=50 && x<60)
        {
            System.out.print("A grade of " + x + " is equal to an F");
        }
        else 
        {
            System.out.print("Not a viable grade");
        }
        */
    }
}