
/**
 * Use random letter generator to  generate a random word with a length between 1-13.
 * Use that random word to create a random phrase
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWord
{
    public static void main(String args[]){
        String sentence = "";
        sentence = randomPhrase(5);
        System.out.println(sentence);

    }

    public static String randomLetterGenerator(){ 

        String letter = "Ia-";
        return letter;
    }

    public static String randomWordGenerator(){
        String word = "";  // word string is empty
        int randomNum = (int)(Math.random()*13)+1;
        for(int i = 0; i <= randomNum; i++){//for loop random int from 1-13
            word += randomLetterGenerator();        // call a randomelettergenerator how many times
        }
        return word;
    }
    public static String randomPhrase(int howManyWords){
        String phrase = "";
        for(int k =0; k < howManyWords; k++ ){
        phrase +=  randomWordGenerator() + " ";
        }
        phrase = phrase.trim();
        return phrase;
    }
}
