import java.util.ArrayList;
import java.util.Scanner;

public class ContactListManager
{
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();
    
    private static final int DISPLAY_ALL_CONTACTS = 1;
    private static final int SEARCH_CONTACTS = 2;
    private static final int ADD_CONTACT = 3;
    private static final int DELETE_CONTACTS = 4;
    private static final int QUIT = 5;

    static
    {
        contactList.add(new Contact ("Amy Morgan", "(473) 555-9189", "amy@amymorgan.com"));
        contactList.add(new Contact ("Hector Tillman", "(406) 555-7109", "gravylover@poutine.com"));
        contactList.add(new Contact ("James Westen", "(617) 555-3441", "jimmyjams@musica.com"));
        contactList.add(new Contact ("Jin Wei", "(212) 555-2575", "jin1999@hotmail.com"));
        contactList.add(new Contact ("Miles Jamestown", "(310) 555-6872", "milesonthego@yahoo.com"));
    }

    public static void main(String[] args)
    {
        int input = 1;
        
        while (input != QUIT)
        {
            displayMenu();
            input = getUserInput();
        
            if (input == DISPLAY_ALL_CONTACTS)
                displayAllContacts();
            else if (input == SEARCH_CONTACTS)
                searchContacts();
            else if (input == ADD_CONTACT)
                addContact();
            else if (input == DELETE_CONTACTS)
                deleteContacts();
        }
        System.out.println("\nGoodbye");
    }

    private static void displayMenu()
    {
        System.out.println("****************************");
        System.out.println("*   Contact List Manager   *");
        System.out.println("****************************");
        System.out.println("* 1)  Display all contacts *");
        System.out.println("* 2)  Search contacts      *");
        System.out.println("* 3)  Add a contact        *");
        System.out.println("* 4)  Delete contacts      *");
        System.out.println("* 5)  Quit                 *");
        System.out.println("****************************\n");
    }

    /**
     * getUserInput will ask the user to enter in a number between 1 and 5.  The method will
     * continue to ask them for input until they successfully enter in a valid number.
     * 
     * Once a valid integer has been entered, getUserInput will return that value.
     * 
     * @return a user-entered value in the range [1, 5].
     */
    private static int getUserInput()
    {
        return 0;  //This line needs to be changed.  It is here so the class will compile.
    }

    /**
     * Using a for-each loop, this method will display all of the contacts to the screen,
     * one blank line in-between each Contact.
     */
    private static void displayAllContacts()
    {

    }
    
    /**
     * searchContacts will ask the user what they are looking for, then display every contact
     * which matches that search String.  The output will display the whole contact information,
     * not just the part that matched.
     * 
     * The search will look for a match in the name, phone number and/or email.  Case doesn't matter.  
     * 
     * The method will report "No matches found.", if the search was fruitless.
     */
    private static void searchContacts()
    {

    }

    /**
     * addContact asks the user for a name, a phone number, and an email.
     * 
     * Once all three pieces of information have been gathered, then create a Contact and
     * add it to the list.
     */
    private static void addContact()
    {

    }

    /**
     * Ask the user to enter in who you want to delete.  This method, like searchContacts, will 
     * match name, phone number, and/or email.
     * 
     * When a match is found, the contact is displayed and then the method will ask for  
     * confirmation whether they really want to delete it.  If they confirm "yes" (capitalized 
     * any way), then delete the contact off of the ArrayList.
     * 
     * Keep going until you have gone through all of the matches, asking at each match whether
     * they really want it deleted.
     * 
     * The method will report "No matches found.", if the search was fruitless.
     */
    private static void deleteContacts()
    {

    }
}
