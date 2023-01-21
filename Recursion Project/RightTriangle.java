
public class RightTriangle
{
    public static void main(String[] args)
    {
        System.out.println("Printing out triangle(5):\n");
        triangle(5);        
        System.out.println("\nPrinting out triangle(7):\n");
        triangle(7);
        System.out.println("\nPrinting out triangle(1):\n");
        triangle(1);
        System.out.println("\nPrinting out triangle(4):\n");
        triangle(4);
        System.out.println("\nPrinting out triangle(22):\n");
        triangle(22);
        
    }

    /**  The triangle method is supposed to take a number, and then print to the screen a right
     *  triangle with the first row equal to the number given, the next row equal to the 
     *  number given - 1, and so on until the whole triangle has been printed to the screen.
     *  
     *  The implementation must use recursion.
     *  
     *  @param  num  The size of the triangle to print out.
     *  
     *  Precondition:  num >= 1
     */
    public static String triangle(int num){
        if(num == 0){
            return "";
        }
        else{
            for(int i = 0; i < num; i++){
            System.out.print("*");
            }
            System.out.println();
            return triangle(num-1);
        }
    }
}

