/* ContactServiceTest.java
 *
 * Description: This is the contact service test class. It tests functionality related to the contact service class.
 *
 * Author: Justin Crouch
 * Date: 2025-07-19
 * Course: CS320
 */

package mobile.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for Contact Service class.
 */
public class ContactServiceTest
{
    /**
     * Test getContact method functionality in Contact Service class
     */
    // Test if existing contact object is returned given its id
    @Test
    @DisplayName("Contact Service returns existing contact given its contact id")
    public void getContact_ExistingContactIdString_ReturnsCorrespondingContactObject()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        // Get contact object given an id
        service.addContact(contact1);
        Contact returnedContact = service.getContact(contact1.getId());

        // Test if returned contact equals expected contact
        assertEquals(contact1, returnedContact, "Contact Service did not return existing contact object given its id");
    }

    // Test if null is returned given nonexisting contact id
    @Test
    @DisplayName("Contact Service returns null given nonexisting contact id")
    public void getContact_NonExistingContactIdString_ReturnsNull()
    {
        // Initialize contact service object
        ContactService service = new ContactService();

        // Get contact object given a nonexisting id
        Contact returnedContact = service.getContact("-1");

        // Test if returned contact equals null
        assertEquals(null, returnedContact, "Contact Service did not return null given nonexisting contact id");
    }

    /** 
     * Test addContact method functionality in Contact Service class
     */
    // Test that no contact object can be added more than once
    @Test
    @DisplayName("Contact Service cannot add contact objects more than once")
    public void addContact_SameContactObject_ReturnFalse()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact once to service
        service.addContact(contact1);

        // Attempt to add contact again
        assertFalse(service.addContact(contact1), "Contact Service allowed same contact object to be added twice");
    }

    // Test that multiple contact objects can be added
    @Test
    @DisplayName("Contact Service can add different contact objects")
    public void addContact_DifferentContactObjects_ReturnsTrue()
    {
        // Initialize contacts and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        Contact contact2 = new Contact("John", "Cena", "1234567891", "456 Can't See Me");
        ContactService service = new ContactService();

        // Add one contact to service
        service.addContact(contact1);

        // Add another contact to service
        assertTrue(service.addContact(contact2), "Contact Service did not allow different contact objects to be added");
    }

    /**
     * Test removeContact method functionality in Contact Service class
     */
    // Test that an existing contact can be removed given its id
    @Test
    @DisplayName("Contact Service can remove contact object given its id")
    public void removeContact_ExistingContactObjectId_ReturnTrueAndContactObjectRemoved()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        service.addContact(contact1);

        // Remove the contact once to verify return type
        // Remove the contact twice to verify it was actually removed
        assertTrue(service.removeContact(contact1.getId()), "Contact Service did not return true when removing an existing contact");
        assertFalse(service.removeContact(contact1.getId()), "Contact Service did not remove an existing contact");
    }

    // Test that removing a nonexisting contact returns false
    @Test
    @DisplayName("Contact Service returns false when removing a non-existent contact id")
    public void removeContact_NonExistingContactObjectId_ReturnFalse()
    {
        // Initialize contact service object
        ContactService service = new ContactService();

        // Attempt to remove nonexisting contact
        assertFalse(service.removeContact("-1"), "Contact Service did not return false when removing a non-existing contact");
    }

    /**
     * Test updateFirstName method functionality in Contact Service class
     */
    // Test that an existing contact object can have its first name changed given its id
    @Test
    @DisplayName("Contact Service can update an existing contact's first name attribute")
    public void updateFirstName_ExistingContactObjectIdAndString_SetFirstNameToString()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        service.addContact(contact1);

        // Update contact's first name and store its first name after the change
        service.updateFirstName(contact1.getId(), "New Name");
        String contactFirstName = service.getContact(contact1.getId()).getFirstName();

        // Test if the first name actually changed
        assertEquals("New Name", contactFirstName, "Contact Service did not update existing contact's first name");
    }

    /**
     * Test updateLastName method functionality in Contact Service class
     */
    // Test that an existing contact object can have its last name changed given its id
    @Test
    @DisplayName("Contact Service can update an existing contact's last name attribute")
    public void updateLastName_ExistingContactObjectIdAndString_SetLastNameToString()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        service.addContact(contact1);

        // Update contact's last name and store its last name after the change
        service.updateLastName(contact1.getId(), "New Name");
        String contactLastName = service.getContact(contact1.getId()).getLastName();

        // Test if the last name actually changed
        assertEquals("New Name", contactLastName, "Contact Service did not update existing contact's last name");
    }

    /**
     * Test updateAddress method functionality in Contact Service class
     */
    // Test that an existing contact object can have its address changed given its id
    @Test
    @DisplayName("Contact Service can update an existing contact's last name attribute")
    public void updateAddress_ExistingContactObjectIdAndString_SetAddressToString()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        service.addContact(contact1);

        // Update contact's address and store its address after the change
        service.updateAddress(contact1.getId(), "New Name");
        String contactAddress = service.getContact(contact1.getId()).getAddress();

        // Test if the address actually changed
        assertEquals("New Name", contactAddress, "Contact Service did not update existing contact's address");
    }

    /**
     * Test updatePhone method functionality in Contact Service class
     */
    // Test that an existing contact object can have its phone changed given its id
    @Test
    @DisplayName("Contact Service can update an existing contact's last name attribute")
    public void updatePhone_ExistingContactObjectIdAndString_SetPhoneToString()
    {
        // Initialize contact and contact service objects
        Contact contact1 = new Contact("First", "Last", "1234567890", "123 Test It");
        ContactService service = new ContactService();

        // Add contact to service
        service.addContact(contact1);

        // Update contact's phone and store its address after the change
        service.updatePhone(contact1.getId(), "0987654321");
        String contactPhone = service.getContact(contact1.getId()).getPhone();

        // Test if the phone actually changed
        assertEquals("0987654321", contactPhone, "Contact Service did not update existing contact's phone");
    }
}
