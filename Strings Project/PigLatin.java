import java.util.Scanner;
/**
 * create only one word
 * take the first lettter and add it to the end and add ay to it.
 * @author (your name)
 * @version (a version number or a date)
 */
public class PigLatin
{

    public static void main(String args[]){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = obj1.nextLine();
        
        String PigLatin = pigLatin(word);
        System.out.println("Piglatin is :" + PigLatin);
    }
    public static String pigLatin(String word)
    {
        String pigLatinWord;   
        String firstLetter = word.substring(0,1);   //get first letter of Greg so G
        String secondLetter = word.substring(1,2).toUpperCase();;
        pigLatinWord = word.substring(2);
        pigLatinWord = secondLetter +  pigLatinWord + firstLetter + "ay";
        pigLatinWord.trim();
        
        return pigLatinWord;
    }
}