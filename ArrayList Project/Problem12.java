
import java.util.ArrayList;
public class Problem12
{

    public static void main(String[] args)
    {
        int[] data = {15, 9, 7, -3, 5, 0, 28, 42, -54, 20, -35, 10, 23, -90};
        ArrayList<Integer> output = multiplesOf5Only(data);
        System.out.println("Output below should be:  [15, 5, 0, 20, -35, 10, -90]");
        System.out.println(output);
        
        data = new int[0];
        output = multiplesOf5Only(data);
        System.out.println("\nOutput below should be:  []");
        System.out.println(output);
        
        data = null;
        output = multiplesOf5Only(data);
        System.out.println("\nOutput below should be:  null");
        System.out.println(output);
    }
    
    /**
     * multiplesOf5Only takes an incoming int array and returns an
     * ArrayList<Integer> with only the multiples of 5 from the input on
     * the list.
     * 
     * @param  input  An int[], possibly filled with values.
     * 
     * @return null if input is null;
     *         otherwise an ArrayList<Integer> filled with all multiples of
     *         5 from input
     */
    private static ArrayList<Integer> multiplesOf5Only(int[] input){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        if(input == null){
        return null;
        }
        else{
        }
        for(int i = 0; i< input.length; i++){
        if(input[i]%5 == 0){
            temp.add(input[i]);
        }
        else{
            
        }
    }
    return temp;
    }
}
