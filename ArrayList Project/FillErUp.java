import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class FillErUp
{
    private static final int TOTAL = 118320;
    private static ArrayList<String> dictionary = new ArrayList<String>();

    static
    {
        try
        {            
            File file = new File("dictionary.txt");
            Scanner readFile = new Scanner(file);
            for (int i = 0; i < TOTAL; i++)
            {
                dictionary.add(readFile.nextLine());
            }
            readFile.close();
        }
        catch (Exception error)
        {
            error.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> column1 = new ArrayList<String>();
        column1.add("co____l");
        column1.add("p____la");
        column1.add("re____ch");
        column1.add("fi____ty");
        column1.add("ba____lle");
        column1.add("k____t");
        column1.add("sen____nt");
        column1.add("d____le");
        column1.add("ac____ic");
        column1.add("s____ch");
        column1.add("a____on");
        column1.add("mot____de");
        column1.add("ch____at");
        column1.add("fo____all");
        column1.add("r____ue");
        column1.add("c____se");
        column1.add("ma____e");
        column1.add("pre____nt");
        column1.add("f____y");
        column1.add("c____on");

        ArrayList<String> column2 = new ArrayList<String>();
        column2.add("deli");
        column2.add("even");
        column2.add("nigh");
        column2.add("vale");
        column2.add("band");
        column2.add("sear");
        column2.add("rest");
        column2.add("orca");
        column2.add("gate");
        column2.add("tine");
        column2.add("lone");
        column2.add("rout");
        column2.add("lean");
        column2.add("wind");
        column2.add("oust");
        column2.add("lash");
        column2.add("ergo");
        column2.add("itch");
        column2.add("plot");
        column2.add("time");
        for (int i = 0; i < column1.size(); i++) 
        { 
            for (int j = 0; j < column2.size(); j++) 
            { 
                String merged = column1.get(i).replaceAll("____", column2.get(j)); 
                if (dictionary.indexOf(merged) >= 0) 
                    System.out.println(merged); 
            } 
        } 

    }

}
