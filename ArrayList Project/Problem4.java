 import java.util.ArrayList;

public class Problem4
{
    private static ArrayList<Lion> pride = new ArrayList<Lion>();

    public static void main(String[] args)
    {
        fillArrayList();
        shuffleArrayList();
        
        for(int i = 0; i < pride.size(); i++){
        System.out.println(pride.get(i).getName());
        }
        
        for (Lion temp : pride){
            temp.roar();
        }
        
        pride.add(0, pride.remove(pride.size() - 1));
        
        int flag = 0;
        for(int i = 0; i < pride.size(); i++){
            if(pride.get(i).getName().equals("Leo"))
                flag = i;
        }
        Lion King = pride.get(flag);
    }
    
    private static void fillArrayList()
    {
        pride.add(new Lion("Leo"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Leon"));
        if ((int)(Math.random() * 2) == 1) 
            pride.add(new Lion("Leona"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Leonard"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Leonidas"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Leonora"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Mufasa"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Simba"));
        if ((int)(Math.random() * 2) == 1)        
            pride.add(new Lion("Nala"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Surabi"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Sarafina"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Kiara"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Kion"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Kopa"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Ahadi"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Uru"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Mohatu"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Vitani"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Kula"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Zira"));
        if ((int)(Math.random() * 2) == 1)
            pride.add(new Lion("Scar"));         
    }
    
    private static void shuffleArrayList()
    {
        for (int i = 0; i < 10000; i++)
        {
            int rand = (int)(Math.random() * pride.size());
            pride.add(rand, pride.remove(0));
        }
    }
}
