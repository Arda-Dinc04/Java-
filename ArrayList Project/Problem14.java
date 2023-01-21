import java.util.Scanner;
import java.util.ArrayList;

public class Problem14
{
    private static ArrayList<String> names = new ArrayList<String>();
    
    static
    {
        names.add("William");
        names.add("Iman");
        names.add("Farooq");
        names.add("Anika");
        names.add("Ava");
        names.add("Aria");
        names.add("Jack");
        names.add("Aaron");
        names.add("Halah");
        names.add("Nick");
        names.add("Rachel");
        names.add("John");
        names.add("Maya");
        names.add("Ashton");
        names.add("Yanran");
        names.add("Elizabeth");
        names.add("Alex");
        names.add("Yena");
        names.add("Margo");
        names.add("Nicole");
        names.add("Brian");
        names.add("Eliza");
        names.add("Eric");
        names.add("Jerry");
        names.add("Anna");
        names.add("Ilya");
        names.add("David");
        names.add("Ben");
        names.add("Genesis");
        names.add("Ian");
        names.add("Ryan");
        names.add("Madison");
        names.add("Ian");
        names.add("Lukasz");
        names.add("Emir");
        names.add("Johnny");
        names.add("Lawrence");
        names.add("Austin");
        names.add("Sharon");
        names.add("Hsiang-Ting");
        names.add("Jordan");
        names.add("Daniel");
        names.add("Chenghao");
        names.add("Manu");
        names.add("Luke");
        names.add("Jiajun");
        names.add("Jackie");
        names.add("Donia");
        names.add("Anuli");
        names.add("Nikan");
        names.add("Kristen");
        names.add("Spencer");
        names.add("Nia");
        names.add("Kylen");
        names.add("Sahir");
        names.add("Cammi");
        names.add("Lauren");
        names.add("Amrit");
        names.add("Emma");
        names.add("Karishma");
        names.add("Niva");
        names.add("Chase");
        names.add("Hannah");
        names.add("Alfonso");
        names.add("Vinod");
        names.add("Madeline");
        names.add("Grant");
        names.add("Andrew");
        names.add("Emin");
        names.add("Brandon");
        names.add("Michael");
        names.add("Matthew");
        names.add("Shuyi");
        names.add("Gin");
        names.add("Jeffrey");
        names.add("Ashley");
    }
    
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What name do you want to search for or do you want to quit?  ");
        String name = userInput.nextLine();
        while (!name.equalsIgnoreCase("quit"))
        {
            System.out.println("\n" + findName(name));
            
            System.out.print("\nWhat name do you want to search for or do you want to quit?  ");
            name = userInput.nextLine(); 
        }
    }
    
    /**
     * The findName method searches for name inside of names, and reports
     * whether or not it was found.
     * 
     * @param  name  A String holding the name to search for.
     * 
     * @return "Found <name> at index <num>." where <name> is the parameter and
     *             <num> is the first index where it was located.;
     *         Otherwise return "<name> not found." where <name> is the
     *             parameter.
     */
    private static String findName(String name){
        
            if(names.contains(name)){
                return "Found " + name + " at index " + names.indexOf(name) + ".";
            }
            else{
            return name + " not found.";
            }
        
    }
}
