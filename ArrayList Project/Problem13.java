
import java.util.ArrayList;
public class Problem13
{

    public static void main(String[] args)
    {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(6.7);
        values.add(5.301);
        values.add(-0.12);
        values.add(5.48);
        values.add(8.61);
        values.add(-2.61);
        values.add(3.22);
        values.add(10.407);
        System.out.println("Original list:");
        System.out.println(values);
        
        for(int i = 0; i < values.size(); i++){
            values.add(0, values.remove(i));
        }
        //Reverse values here
        
        System.out.println("\nReversed list");
        System.out.println(values);
    }
}
