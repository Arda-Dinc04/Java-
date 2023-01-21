public class ShortestPath
{
    public static void main (String [] args)
    {
        //Get user input
        
        System.out.print("\n\nThe shortest cost through the game ");
        System.out.print("board is " + calculatePath(gameBoard, 0));
        System.out.println(".");
    } 

    /**
     * The calculatePath method will figure out the shortest route through our gameboard.
     * 
     * As a hint, this is the basic structure/thinking that you need.
     * 
     * Simple Case:     If you are two squares away from the end or one square
     *                  away from the end, then you can finish this turn.
     *                  
     * Recursive Case:  Check what the cost is for each option you have (going one step vs.
     *                  going two steps), and choose the smaller number of those two options.
     *                  Hmmm...what function of the Math class would be helpful with choosing
     *                  the better of the two options???
     *                  
     * @param  board            An int[] holding the game board we are currently playing on.
     * @param  currentLocation  An int holding where I currently am (the index) on the array
     * 
     * @return                  An int with the cost of the shortest path from this location.
     */
    public static int calculatePath(int[] board, int currentLocation)
    {

    }
}
