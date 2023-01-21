import java.util.Scanner;
public class FindAllEs{
   
    
    
    
    //find all e's in a given string
    public static void main(String[] args){
        String string = "This is a test sentence with exactly 6 e's";
        int count = 0, totalNumberOfLetters = 0, i;
        String letter = "";
        totalNumberOfLetters = string.length();
        
        for(int k = 0; k < totalNumberOfLetters; k++ ){
            letter = string.substring(k, k+1);
            if (letter.equalsIgnoreCase("e"))
                count++;
        }
        System.out.println("Total number of E's in the sentence are " + count);
    }
}