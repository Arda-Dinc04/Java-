import java.util.ArrayList;

public class MadLibs
{

    public static void main(String[] args)
    {

    }

    private static String getRandomPerson()
    {
        ArrayList<String> people = new ArrayList<String>();
        people.add("fireman");
        people.add("teacher");
        people.add("actor");
        people.add("veterinarian");
        people.add("lawyer");
        
        return people.get(1);
    }

    private static String getRandomPlace()
    {
        ArrayList<String> places = new ArrayList<String>();
        places.add("Empire State Building");
        places.add("bathroom");
        places.add("Chicago");
        places.add("cabin");
        places.add("park");

    }

    private static String getRandomThing()
    {
        ArrayList<String> things = new ArrayList<String>();
        things.add("underwear");
        things.add("test");
        things.add("rock");
        things.add("soda can");
        things.add("calculator");

    }

    private static String getRandomAdjective()
    {
        ArrayList<String> adjectives = new ArrayList<String>();
        adjectives.add("sticky");
        adjectives.add("stinky");
        adjectives.add("ugly");
        adjectives.add("blue");
        adjectives.add("tiny");

    }

    private static String getRandomAdverb()
    {
        ArrayList<String> adverbs = new ArrayList<String>();
        adverbs.add("slowly");
        adverbs.add("quickly");
        adverbs.add("haphazardly");
        adverbs.add("stealthily");
        adverbs.add("quietly");

    }

    private static String getRandomVerb()
    {
        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("kick");
        verbs.add("lick");
        verbs.add("call");
        verbs.add("play");
        verbs.add("open");

    }

}
