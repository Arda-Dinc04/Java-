
/**
 * Write a description of class mystery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mystery
{
    public static void main (String[] args){
    mystery("Bruins");
    
    }
    public static void mystery(String str) 
{ 
    if (str.length() <= 1) 
    { 
        System.out.println(str); 
    } 
    else 
    { 
       int loc = str.length()/2;
       mystery(str.substring(loc));
       mystery(str.substring(0,loc));
    } 
} 
}
