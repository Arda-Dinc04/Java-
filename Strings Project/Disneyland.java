import java.util.Scanner;

public class Disneyland
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        //System.out.println("Please enter a line: ");
        //String line = userInput.nextLine();
        String line = "Welcome to Disneyland";
        
        System.out.println("\"Welcome to Disneyland\" in lowercase is " + line.toLowerCase());
        System.out.println("\"Welcome to Disneyland\" in uppercase is " + line.toUpperCase());
        System.out.println("\"" + line + "\" camelfied is \"" + camelfy(line) + "\".");
    }
    public static String camelfy(String line){
    String temp = "";
    int numOfLetters = line.length();
    for (int i = 0; i < numOfLetters; i++){
        if(i%2 == 0)
            temp += line.substring(i,i+1).toLowerCase();
        else
            temp += line.substring(i,i+1).toUpperCase();
    }
    System.out.println(temp);
    return temp;
    }
}
