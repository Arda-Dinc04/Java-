1import java.util.Scanner;
public class BackwardsWriter{
    //=======================================================  
    public static void main(String[] args)

    {
        String word ;

        String strNew = " ";
        String temp;  
        int NumberOfLetters; 

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter new word:");
        word = myObj.nextLine(); 

        

        NumberOfLetters = word.length();

        for (int n = NumberOfLetters;  n > 0 ; n--){// as long as their are letters subtract them one by one

            temp = word.substring(n-1, n);   // get last  char one at a time

            strNew = strNew + temp ; 

        }

        // trim both ends in case there is blank space
        strNew = strNew.trim();

        System.out.println(" word =  " + word);
        System.out.println("Reversed word =  " + strNew);

        //=======================================================
    }
}

