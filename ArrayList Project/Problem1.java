import java.util.ArrayList;

public class Problem1
{
    private static ArrayList<Double> global = new ArrayList<Double>();
    private ArrayList<Double> instance;
    static{
        global.add(5.6);
        global.add(-7.9);
        global.add(3.4);
        global.add(-9.13);
    
    }
    public Problem1()
    {
        instance = new ArrayList<Double>();
        instance.add(5.6);
        instance.add(-7.9);
        instance.add(3.4);
        instance.add(-9.13);

    }
    
    public void createLocalVariablesHere(String[] args)
    {
        ArrayList<Double> local = new ArrayList<Double>();
        local.add(5.6);
        local.add(-7.9);
        local.add(3.4);
        local.add(-9.13);
        
        instance = new ArrayList<Double>();
        instance.add(5.6);
        instance.add(-7.9);
        instance.add(3.4);
        instance.add(-9.13);
        
        System.out.println(global);
        System.out.println(local);
        System.out.println(instance);
    }
}
