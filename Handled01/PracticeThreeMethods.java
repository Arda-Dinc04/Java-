public class PracticeThreeMethods
{
    public static void main(String[] args)
    {
        int lowest, sum, avg;
        String Grade = "";
        lowest = tester(92, 56, 85, 98);
        
        sum = 92+ 56+ 85+ 98 - lowest;
        
        avg = sum/3;
        
        Grade = grade(avg);
        
        
        System.out.println(Grade);

    
    }
    public static String grade(int avg)
    {
        String output = "";
        if (avg > 80)
        output = "B";
        else
        output = "You failed";
        
        
        return output;
    
    }
    
    
    public static int tester(int a, int b, int c ,int d)
    {
        int x, y, z;
        
        x = Math.min(a,b);
        y = Math.min(c, d);
        z = Math.min(x, y);
        
        return z;
    
    
    
    }



}