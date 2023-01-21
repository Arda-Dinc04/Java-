
/**
 * A class to help with the Dog class exercises
 *
 * @author Derek Carlson
 * @version 1.0
 */
public class DogHelper
{

    /**
     * The getRandomName method returns a name randomly selected from a list of 20.
     * These names happen to be the top 10 male and top 10 female dog names of 2017.
     * 
     * @return A String randomly selected from a list of 20 possible names.
     */
    public static String getRandomName()
    {
        int randomNum = (int)(Math.random() * 20);
        String name = "";

        if (randomNum == 0)
            name = "Bella";
        else if (randomNum == 1)
            name = "Lucy";
        else if (randomNum == 2)
            name = "Daisy";
        else if (randomNum == 3)
            name = "Luna";
        else if (randomNum == 4)
            name = "Lola";
        else if (randomNum == 5)
            name = "Sadie";
        else if (randomNum == 6)
            name = "Molly";
        else if (randomNum == 7)
            name = "Maggie";
        else if (randomNum == 8)
            name = "Bailey";
        else if (randomNum == 9)
            name = "Sophie";
        else if (randomNum == 10)
            name = "Max";
        else if (randomNum == 11)
            name = "Charlie";
        else if (randomNum == 12)
            name = "Cooper";
        else if (randomNum == 13)
            name = "Buddy";
        else if (randomNum == 14)
            name = "Jack";
        else if (randomNum == 15)
            name = "Rocky";
        else if (randomNum == 16)
            name = "Oliver";
        else if (randomNum == 17)
            name = "Bear";
        else if (randomNum == 18)
            name = "Duke";
        else 
            name = "Tucker";

        return name;
    }

    /**
     * The getRandomColor method returns a color randomly selected from a list of 6.
     * 
     * @return A String randomly selected from a list of 6 possible colors.
     */
    public static String getRandomColor()
    {
        int randomNum = (int)(Math.random() * 6);
        String color = "";

        if (randomNum == 0)
            color = "white";
        else if (randomNum == 1)
            color = "black";
        else if (randomNum == 2)
            color = "brown";
        else if (randomNum == 3)
            color = "gray";
        else if (randomNum == 4)
            color = "brindle";
        else
            color = "tan";

        return color;
    }

    /**
     * The getRandomBreed method returns a breed randomly selected from a list of 30.
     * These happen to be the top 30 most popular dog breeds (in order) in the U.S. 
     * in 2018, according to the AKC.
     * 
     * @return A String randomly selected from a list of 30 possible breeds.
     */
    public static String getRandomBreed()
    {
        int randomNum = (int)(Math.random() * 30);
        String breed = "";

        if (randomNum == 0)
            breed = "Labrador Retriever";
        else if (randomNum == 1)
            breed = "German Shepherd";
        else if (randomNum == 2)
            breed = "Golden Retriever";
        else if (randomNum == 3)
            breed = "French Bulldog";
        else if (randomNum == 4)
            breed = "Bulldog";
        else if (randomNum == 5)
            breed = "Beagle";
        else if (randomNum == 6)
            breed = "Poodle";
        else if (randomNum == 7)
            breed = "Rottweiler";
        else if (randomNum == 8)
            breed = "Yorkshire Terrier";
        else if (randomNum == 9)
            breed = "German Shorthaired Pointer";
        else if (randomNum == 10)
            breed = "Boxer";
        else if (randomNum == 11)
            breed = "Siberian Husky";
        else if (randomNum == 12)
            breed = "Dachshund";
        else if (randomNum == 13)
            breed = "Great Dane";
        else if (randomNum == 14)
            breed = "Pembroke Welsh Corgi";
        else if (randomNum == 15)
            breed = "Doberman Pinscher";
        else if (randomNum == 16)
            breed = "Australian Shepherd";
        else if (randomNum == 17)
            breed = "Miniature Schnauzer";
        else if (randomNum == 18)
            breed = "Cavalier King Charles Spaniel";
        else if (randomNum == 19)
            breed = "Shih Tzu";
        else if (randomNum == 20)
            breed = "Boston Terrier";
        else if (randomNum == 21)
            breed = "Pomeranian";
        else if (randomNum == 22)
            breed = "Havanese";
        else if (randomNum == 23)
            breed = "Shetland Sheepdog";
        else if (randomNum == 24)
            breed = "Bernese Mountain Dog";
        else if (randomNum == 25)
            breed = "Brittany";
        else if (randomNum == 26)
            breed = "English Springer Spaniel";
        else if (randomNum == 27)
            breed = "Mastiff";
        else if (randomNum == 28)
            breed = "Cocker Spaniel";
        else
            breed = "Vizslas";

        return breed;
    }
}
