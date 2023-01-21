public class TestBookClass
{
    public static void main(String[] args)
    {
        Book ancient = new Book("The Epic of Gilgamesh");
        Book roman = new Book("Natural History", "Pliny the Elder");
        Book lotr3 = new Book("The Return of the King", "J.R.R. Tolkien", 1955);

        System.out.println("Let's see if the three examples I gave in the problem are created correctly.");
        System.out.println("****************************************************************************");
        System.out.println("\n" + ancient);
        System.out.println("\n" + roman);
        System.out.println("\n" + lotr3);
        
        System.out.println("\nChecking out The Return of the King.");
        System.out.println("**********************************");
        lotr3.checkBookOut();
        System.out.println("\n" + lotr3);
        
        System.out.println("\nTrying to check out The Return of the King again (should generate an error).");
        System.out.println("**************************************************************************\n");
        lotr3.checkBookOut();
        
        System.out.println("\nChecking in The Return of the King.");
        System.out.println("*********************************");
        lotr3.checkBookIn();
        System.out.println("\n" + lotr3);
        
        System.out.println("\nChecking out and then back in Natural History 8 times.");
        System.out.println("******************************************************");
        roman.checkBookOut();
        roman.checkBookIn();
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn();        
        roman.checkBookOut();
        roman.checkBookIn(); 
        System.out.println("\n" + roman);
        
        System.out.println("\nTesting out the accessors using Natural History:");
        System.out.println("************************************************");
        System.out.println("The author of Natural History is " + roman.getAuthor() + ".");
        System.out.println("The title of Natural History is " + roman.getTitle() + ".");
        System.out.println("Natural History is checked out:  " + roman.getCheckedOut() + ".");
        System.out.println("Natural History has been checked out " + roman.getTimesCheckedOut() + " times.");
        System.out.println("\nThere has been a total of " + Book.getNumberOfBooks() + " books created.");
        
        System.out.println("\nAttempting to change the year published for The Return of the King to 76 B.C.E.");
        System.out.println("*******************************************************************************");
        lotr3.setYearPublished(-76);
        System.out.println("\n" + lotr3);
        
        System.out.println("\nAttempting to change the year published for The Return of the King to 0.");
        lotr3.setYearPublished(0);
        System.out.println("\n" + lotr3);
        System.out.println("\nNote:  The output above should NOT have B.C.E. or C.E. after 0.");
        
        System.out.println("\nAttempting to change the year published for The Return of the King to 1514.");
        System.out.println("***************************************************************************");
        lotr3.setYearPublished(1514);
        System.out.println("\n" + lotr3);
        
        System.out.println("\nAttempting to change the year published for The Return of the King to 2871.");
        System.out.println("This SHOULD generate an error message.");
        System.out.println("**************************************\n");
        lotr3.setYearPublished(2871);
        
        System.out.println("\nAttempting to change the year published for The Return of the King to Unknown.");
        System.out.println("*******************************************************************************");
        lotr3.setYearPublished(1000000000);
        System.out.println("\n" + lotr3);
    }
}
