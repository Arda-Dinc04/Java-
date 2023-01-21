import java.util.Scanner;

public class Sentence{
    public static void main(String args[]){
    Scanner userInput = new Scanner(System.in); 

    System.out.print("Please enter a sentence:  "); 
    String text = userInput.nextLine(); 

    text = text.toLowerCase(); // make all text lowercase
    text = text.substring(0,1).toUpperCase() + text.substring(1); //change first letter to upper case and then change add rest of the setence

    //Make sure you get comfortable using BOTH types of substring!!! 

    System.out.print("\n" + text); 

    if (!text.substring(text.length() - 1).equals(".")) //if the last value is not equal to a period add one
    System.out.println("."); 
}
}