import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {   
        boolean temp = false;
        int flag = 0;
        while(flag == 0){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter a password:  ");
        String input = userInput.nextLine();
        
        temp = passwordCheck(input);
        
        if(temp == true){
            System.out.println("Access Granted");
            flag = 1;
        }
        else
            System.out.println("Locked");
        
        }
    }
    public static boolean passwordCheck(String userPassword){
    if (userPassword.equalsIgnoreCase("theblackknight")){
        return true;}
    else {
        return false;}
    }
}
