
public class Cheerleading
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("* Iterative Output *");
        System.out.println("********************");
        System.out.println("\nDoing cheerIteratively(1):");
        cheerIteratively(1);
        System.out.println("\nDoing cheerIteratively(3):");
        cheerIteratively(3);
        System.out.println("\nDoing cheerIteratively(6):");
        cheerIteratively(6);
        System.out.println("\nDoing cheerIteratively(2) followed by cheerIteratively(4).");
        System.out.println("They should end up on different lines of output.");
        cheerIteratively(2);
        cheerIteratively(4);
        System.out.println("\n********************");
        System.out.println("* Recursive Output *");
        System.out.println("********************");
        System.out.println("\nDoing cheerRecursively(1):");
        cheerRecursively(1);
        System.out.println("\nDoing cheerRecursively(2):");
        cheerRecursively(2);
        System.out.println("\nDoing cheerRecursively(5):");
        cheerRecursively(5);
        System.out.println("\nDoing cheerRecursively(3) followed by cheerRecursively(7).");
        System.out.println("They should end up on different lines of output.");
        cheerRecursively(3);
        cheerRecursively(7);
    }
    
    /**
     * The cheerIteratively will repeat "Hip" a number of times equal to num, followed by a "Hooray!".
     * During the course of this method, no recursion is used.
     * 
     * @param  num  The number of times to repeat the word "Hip" before we print out "Hooray!".
     * 
     * Precondition:  num >= 1
     * 
     * Postcondition:  The output is followed by a carriage return so that the cursor ends up on 
     * the line below the output on the screen.
     */
    private static void cheerIteratively(int num)
    {
        for(int i = 0; i < num; i++){
        System.out.print("Hip ");
        }
        System.out.print("Hooray!");
    }
    
    /**
     * The cheerRecursively will repeat "Hip" a number of times equal to num, followed by a "Hooray!".
     * During the course of this method, recursion WILL be used.
     * 
     * @param  num  The number of times to repeat the word "Hip" before we print out "Hooray!".
     * 
     * Precondition:  num >= 1
     * 
     * Postcondition:  The output is followed by a carriage return so that the cursor ends up on 
     * the line below the output on the screen.
     */    
    private static void cheerRecursively(int num)
    {
        if(num == 0){
        System.out.print("Hooray!");
        }
        else{
            System.out.print("Hip ");
            cheerRecursively(num - 1);   
        }
        
    }
}
