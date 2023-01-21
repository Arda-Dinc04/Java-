public class Contact
{
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String newName, String newPhoneNumber, String newEmail)
    {
        name = newName;
        phoneNumber = newPhoneNumber;
        email = newEmail;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setPhoneNumber(String newPhoneNumber)
    {
        phoneNumber = newPhoneNumber;
    }

    public void setEmail(String newEmail)
    {
        email = newEmail;
    }

    public String toString()
    {
        return "Name:  " + name + "\nPhone Number:  " + phoneNumber + "\nEmail:  " + email;
    }
}
