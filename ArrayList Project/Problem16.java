import java.util.ArrayList;

public class Problem16
{

    public static void main(String[] args)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(-7);
        scores.add(0);
        scores.add(1);
        scores.add(13);
        scores.add(47);
        
        addScore(scores, -6);
        addScore(scores, 107);
        addScore(scores, 13);
        addScore(scores, -981);
        addScore(scores, 25);
        addScore(scores, 17);
        addScore(scores, 17);
        
        System.out.println("The final output should be [-981, -7, -6, 0, 1, 13, 13, 17, 17, 25, 47, 107]");
        System.out.println(scores);
    }
    
    /**
     * The addScore method is supposed to take num and insert it into sortedList so that sortedList
     * remains sorted.  
     * 
     * Duplicate values okay.
     * 
     * @param  sortedList  An ArrayList<Integer> sorted from low to high.
     * @param  num  An Integer to be inserted into sortedList
     * 
     * Precondition:  sortedList and num are both not null
     * 
     * Postcondition:  sortedList remains sorted from low to high after num has been inserted.
     */
    private static void addScore(ArrayList<Integer> sortedList, Integer num){
    
        int count = 0;
        while(count < sortedList.size() && num > sortedList.get(count)){
            count++;
        }
            sortedList.add(count, num);
        
        }
    }

