
import java.util.ArrayList;
public class Problem10
{
    
    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("I");
        myList.add( "like");
        myList.add( "eggs");
        myList.add(2, "hard boiled");
        myList.set(2, "green");
        
         myList.remove(myList.indexOf("eggs"));
        System.out.print(myList);
    }
}
