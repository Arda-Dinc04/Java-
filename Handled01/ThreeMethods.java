import java.util.Scanner;

public class ThreeMethods{
public static void main(String[] args)
{
/*
 * 
 */
    Scanner userInput = new Scanner(System.in);
    
    double lowestGrade, avgscore;
    String grade;
    
    System.out.print("Enter in First score on the test: ");
    double a = userInput.nextDouble();   
    System.out.print("Enter in Second score on the test:  ");
    double b = userInput.nextDouble();      
    System.out.print("Enter in Third score on the test:  ");
    double c = userInput.nextDouble();  
    System.out.print("Enter in Fourth score on the test:  ");
    double d = userInput.nextDouble();  
    
   lowestGrade = testScoreInputs(a, b, c ,d);
   grade = testScores(a, b, c ,d);
   
   avgscore = (a + b + c + d)/4;
   
   
    System.out.println("\n\n" + lowestGrade + " is the lowest test score");
    System.out.println(avgscore + "% is the avg test score for all 4 scores");
    System.out.println(grade + " for the class");
    
    
   
    
}

// the return value is a boolean to tell us that if the output of method makes the  
// triangle real or not 
public static String testScores(double a, double b, double c, double d)
{   
    double lowestGrade, sum, avg;
    String grade = "";
    lowestGrade = testScoreInputs(a, b, c ,d);
    
    
    sum = a + b + c + d - lowestGrade;
    avg = sum/3;
    
    if (avg >= 90 && avg <= 100)
        grade = "A";
    else if (avg >= 80 && avg < 90)
        grade = "B";
    else if (avg >= 70 && avg < 80)
        grade = "C";
    else if (avg >= 60 && avg < 70)
        grade = "D";
    else if (avg >= 50 && avg < 60)
        grade = "F";
        
    return grade;
    
    
}

public static double testScoreInputs(double a, double b, double c, double d)
{
    double x, y, z;
    // find the lowest value out of all four
    x = Math.min(a, b);
    y = Math.min(c, d);
    z = Math.min(x, y);
    
    return z;   //Returning the smallest value
}

}