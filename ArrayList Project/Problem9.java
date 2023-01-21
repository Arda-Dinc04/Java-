
import java.util.ArrayList;
public class Problem9
{
    public static void main(String[] args)
    {
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       
    for(int i = 0; i <= (int)(Math.random()*23)+8; i++){
         numbers.add((int)(Math.random()*1000) + 1);
        
    }
    System.out.println("\nArrayList numbers: "); 
    for(Integer num: numbers){
    System.out.print(num + " ");
    }
    
    int[] array = new int[numbers.size()];
    System.out.println("\nArrayList numbers: ");
    for(int i = 0; i < numbers.size(); i++)
    {
         array[i] = numbers.get(i);
    }
    

    
    System.out.println("Array numbers: ");
    for(int temp:array){
    System.out.print(temp + " ");
    }
}
}
