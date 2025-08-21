/* ContactService.java
 *
 * Description: This is the contact service class. It stores and modifies contact objects.
 *
 * Author: Justin Crouch
 * Date: 2025-07-19
 * Course: CS320
 */

package mobile.app;

import java.util.HashMap;

/**
 * Class to store and handle multiple contacts
 */
public class ContactService
{
    // Store all contacts with their ID in a hashmap for fast lookup
    private HashMap<String, Contact> contactsMap = new HashMap();

    // Empty constructor
    public ContactService()
    {}

    /**
     * Return a contact given its ID
     *
     * @param String id of wanted contract
     * @return respective contract object, or null if not found
     */
    public Contact getContact(final String contactId)
    {
        // Return requested contact if it exists within hashmap
        if(this.contactsMap.containsKey(contactId))
        {
            return this.contactsMap.get(contactId);
        }

        return null;
    }

    /**
     * Add a contact object
     *
     * @param Contact a contact object to insert into the service
     * @return true if contact is added, false if contact already exists
     */
    public boolean addContact(final Contact newContact)
    {
        // Return false if it exists within hashmap
        if(this.contactsMap.containsKey(newContact.getId()))
        {
            return false;
        }

        // Add contact with its ID to the hashmap
        this.contactsMap.put(newContact.getId(), newContact);
        return true;
    }

    /**
     * Remove a contact
     *
     * @param String id of a contact
     * @return true if contact is successfully removed, false if id not found
     */
    public boolean removeContact(final String contactId)
    {
        // Remove contact if it exists within hashmap
        if(this.contactsMap.containsKey(contactId))
        {
            this.contactsMap.remove(contactId);
            return true;
        }

        return false;
    }

    /**
     * Update first name of contact
     *
     * @param String id of a contact
     * @param String new first name for contact
     */
    public void updateFirstName(final String contactId, final String firstName)
    {
        // Get contact
        Contact requestedContact = this.getContact(contactId);

        // If the contact exists, set its first name
        if(requestedContact != null)
        {
            requestedContact.setFirstName(firstName);
        }
    }

    /**
     * Update last name of contact
     *
     * @param String id of a contact
     * @param String new last name for contact
     */
    public void updateLastName(final String contactId, final String lastName)
    {
        // Get contact
        Contact requestedContact = this.getContact(contactId);

        // If the contact exists, set its last name
        if(requestedContact != null)
        {
            requestedContact.setLastName(lastName);
        }
    }

    /**
     * Update address of contact
     *
     * @param String id of a contact
     * @param String new address for contact
     */
    public void updateAddress(final String contactId, final String address)
    {
        // Get contact
        Contact requestedContact = this.getContact(contactId);

        // If the contact exists, set its address
        if(requestedContact != null)
        {
            requestedContact.setAddress(address);
        }
    }

    /**
     * Update phone of contact
     *
     * @param String id of a contact
     * @param String new phone for contact
     */
    public void updatePhone(final String contactId, final String phone)
    {
        // Get contact
        Contact requestedContact = this.getContact(contactId);

        // If the contact exists, set its phone
        if(requestedContact != null)
        {
            requestedContact.setPhone(phone);
        }
    }
}
