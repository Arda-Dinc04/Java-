public class Lion
{
    private String name;

    public Lion(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void roar()
    {
        System.out.println("ROOOOOOAAAAAAAAAAAAAAR!!!!!!!!!");
    }
    
    public String toString(){
        return "A lion named " + name + ".";
    }
}
