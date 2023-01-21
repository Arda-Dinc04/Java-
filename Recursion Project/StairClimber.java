import java.util.Scanner;

public class StairClimber
{
    
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int choice = 1;
        
        while (choice >= 1)
        {
            System.out.println("Please enter how many steps are in your staircase, or");
            System.out.print("enter in 0 or a negative number to quit:  ");
            choice = userInput.nextInt();
            
            if (choice >= 1)
                System.out.println("\nThe child can climb the staircase in " + countSteps(choice) + " ways.\n");
           
        }
        
    }
    /**
     * The countSteps method counts the number of different ways a child can run up a staircase of length n steps,
     * assuming the child can successfully hop up 1, 2, or 3 steps at a time on his/her way up to the top.
     * 
     * @param  n  The number of steps in our virtual staircase.
     * 
     * @return    The number of ways the child can ascend a staircase of height n.
     * 
     * Precondition:  n >= 1
     */
    private static int countSteps(int n)
    {
     
        if(n == 1){
        return 1;
        }
        else if(n ==2){
        return 2;
        }
        else if(n==3){
        return 4;
        }  
        else{
        return countSteps(n-1) + countSteps(n-2) + countSteps(n-3);
        
    }    
    }

}
