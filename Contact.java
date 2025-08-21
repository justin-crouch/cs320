/* Contact.java
 *
 * Description: This is the contact class. It creates and stores information related to a contact.
 *
 * Author: Justin Crouch
 * Date: 2025-07-19
 * Course: CS320
 */

package mobile.app;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Class that stores contact information
 */
public class Contact
{
    // Contract ID that should not be mutable
    private final String id;

    // Initialize one incremental number generator for all objects of this class
    // to ensure each object has unique ID
    private static AtomicLong idGenerator = new AtomicLong();

    // Store mutable variables
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    /**
     * Constructor
     *
     * @param String first name for contact
     * @param String last name for contact
     * @param String phone number for contact
     * @param String address for contact
     */
    public Contact(final String firstName, final String lastName, final String phone, final String address)
    {
        // Generate new ID and cast to string
        this.id = String.valueOf(idGenerator.getAndIncrement());

        // Call setters to set needed attributes
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setAddress(address);
    }

    /**
     * Get contact id
     *
     * @return contact id
     */
    public String getId()
    {
        return this.id;
    }

    /**
     * Get contact first name
     *
     * @return first name
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Get contact last name
     *
     * @return last name
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Get contact phone number
     *
     * @return phone number
     */
    public String getPhone()
    {
        return this.phone;
    }

    /**
     * Get contact address
     *
     * @return address
     */
    public String getAddress()
    {
	    return this.address;
    }

    /**
     * Set contract's first name
     *
     * @param String requested first name
     */
    public void setFirstName(final String firstName)
    {
        // Set first name to "NULL" if it is null, empty, or over 10 characters
        if(firstName == null || firstName.length() > 10 || firstName.isEmpty())
        {
            this.firstName = "NULL";

        // Otherwise, set first name to requested name
        } else
        {
            this.firstName = firstName;
        }
    }

    /**
     * Set contract's last name
     *
     * @param String requested last name
     */
    public void setLastName(final String lastName)
    {
        // Set last name to "NULL" if it is null, empty, or over 10 characters
        if(lastName == null || lastName.length() > 10 || lastName.isEmpty())
        {
            this.lastName = "NULL";

        // Otherwise, set last name to requested name
        } else
        {
            this.lastName = lastName;
        }
    }

    /**
     * Set contract's phone number
     *
     * @param String requested phone number
     */
    public void setPhone(final String phone)
    {
        // Set phone number to "2222222222" if it is null, empty, or not 10 characters
        if(phone == null || phone.length() != 10 || phone.isEmpty())
        {
            this.phone = "2222222222";

        // Otherwise, set phone number to requested number
        } else
        {
            this.phone = phone;
        }
    }

    /**
     * Set contract's address
     *
     * @param String requested address
     */
    public void setAddress(final String address)
    {
        // Set address to "NULL" if it is null, empty, or over 30 characters
        if(address == null || address.length() > 30 || address.isEmpty())
	    {
	        this.address = "NULL";

        // Otherwise, set address to requested address
	    } else
	    {
	        this.address = address;
	    }
    }
}
