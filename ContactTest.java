/* ContactTest.java
 *
 * Description: This is the contact test class. It tests functionality related to the contact class.
 *
 * Author: Justin Crouch
 * Date: 2025-07-19
 * Course: CS320
 */

package mobile.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit tests for Contact class.
 */
public class ContactTest
{
    /**
     * Test contact ID requirements
     */
    // Test that returned contact id is no more than 10 characters
    @Test
    @DisplayName("Contact ID cannot be longer than 10 characters.")
    public void getId_None_ReturnStringUpToTenChars()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "1234567890", "123 Test Lane");

        // Test if contact id length is no more than 10 characters
        assertTrue(contact.getId().length() <= 10, "Contact ID is longer than 10 characters.");
    }
    
    /**
     * Test first name requirements
     */
    // Test that a supplied first name with 10 characters is accepted
    @Test
    @DisplayName("First name argument up to 10 characters should be valid.")
    public void contactFirstName_Washington_FirstNameSetToWashington()
    {
        // Initialize contact object
        Contact contact = new Contact("Washington", "Last Name", "1234567890", "123 Test Lane");

        // Test if actual first name equals supplied first name
        assertEquals("Washington", contact.getFirstName(), "First name argument with 10 characters does not return itself.");
    }

    // Test that a supplied first name with 11 characters is not accepted
    @Test
    @DisplayName("First name argument more than 10 characters should be set to \"NULL\".")
    public void contactFirstName_Over10Chars_FirstNameSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("Over10Chars", "Last Name", "1234567890", "123 Test Lane");

        // Test if actual first name equals "NULL"
        assertEquals("NULL", contact.getFirstName(), "First name argument with 11 characters does not return \"NULL\".");
    }

    // Test that a null supplied first name is not accepted
    @Test
    @DisplayName("null first name argument should be set to \"NULL\".")
    public void contactFirstName_Null_FirstNameSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact(null, "Last Name", "1234567890", "123 Test Lane");

        // Test if actual first name equals "NULL"
        assertEquals("NULL", contact.getFirstName(), "Null First name argument does not return \"NULL\".");
    }

    // Test that an empty supplied first name is not accepted
    @Test
    @DisplayName("empty first name argument should be set to \"NULL\".")
    public void contactFirstName_Empty_FirstNameSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("", "Last Name", "1234567890", "123 Test Lane");

        // Test if actual first name equals "NULL"
        assertEquals("NULL", contact.getFirstName(), "Empty First name argument does not return \"NULL\".");
    }

    /**
     * Test last name requirements
     */
    // Test that a supplied last name with 10 characters is accepted
    @Test
    @DisplayName("Last name argument up to 10 characters should be valid.")
    public void contactLastName_Under10_LastNameSetToUnder10()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Under10", "1234567890", "123 Test Lane");

        // Test if actual last name equals supplied last name
        assertEquals("Under10", contact.getLastName(), "Last name argument with 10 characters does not return itself.");
    }

    // Test that a supplied last name with 11 characters is not accepted
    @Test
    @DisplayName("Last name argument more than 10 characters should be set to \"NULL\".")
    public void contactLastName_Over10Chars_LastNameSetToOver10Chars()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Over10Chars", "1234567890", "123 Test Lane");

        // Test if actual last name equals "NULL"
        assertEquals("NULL", contact.getLastName(), "Last name argument with 11 characters does not return \"NULL\".");
    }

    // Test that a null supplied last name is not accepted
    @Test
    @DisplayName("null last name argument should be set to \"NULL\".")
    public void contactLastName_Null_LastNameSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", null, "1234567890", "123 Test Lane");

        // Test if actual last name equals "NULL"
        assertEquals("NULL", contact.getLastName(), "Null last name argument does not return \"NULL\".");
    }

    // Test that an empty supplied last name is not accepted
    @Test
    @DisplayName("empty last name argument should be set to \"NULL\".")
    public void contactLastName_Empty_LastNameSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "", "1234567890", "123 Test Lane");

        // Test if actual last name equals "NULL"
        assertEquals("NULL", contact.getLastName(), "Empty last name argument does not return \"NULL\".");
    }

    /**
     * Test phone number requirements
     */
    // Test that a supplied phone with 10 characters is accepted
    @Test
    @DisplayName("Phone number argument at 10 characters should be valid.")
    public void contactPhone_1234567890_PhoneSetTo1234567890()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "1234567890", "123 Test Lane");

        // Test if actual phone equals supplied phone
        assertEquals("1234567890", contact.getPhone(), "Phone argument with 10 characters does not return itself.");
    }

    // Test that a supplied phone with 9 characters is not accepted
    @Test
    @DisplayName("Phone number argument less than 10 characters should be set to \"2222222222\".")
    public void contactPhone_123456789_PhoneSetTo2222222222()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "123456789", "123 Test Lane");

        // Test if actual phone equals "2222222222"
        assertEquals("2222222222", contact.getPhone(), "Phone argument with 9 characters does not return \"2222222222\".");
    }

    // Test that a supplied phone with 11 characters is not accepted
    @Test
    @DisplayName("Phone number argument more than 10 characters should be set to \"2222222222\".")
    public void contactPhone_12345678901_PhoneSetTo2222222222()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "12345678901", "123 Test Lane");

        // Test if actual phone equals "2222222222"
        assertEquals("2222222222", contact.getPhone(), "Phone argument with 11 characters does not return \"2222222222\".");
    }

    // Test that a null supplied phone is not accepted
    @Test
    @DisplayName("null phone number argument should be set to \"2222222222\".")
    public void contactPhone_Null_PhoneSetTo2222222222()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", null, "123 Test Lane");

        // Test if actual phone equals "2222222222"
        assertEquals("2222222222", contact.getPhone(), "Null phone argument does not return \"2222222222\".");
    }

    // Test that an empty supplied phone is not accepted
    @Test
    @DisplayName("empty phone number argument should be set to \"2222222222\".")
    public void contactPhone_Empty_PhoneSetTo2222222222()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "", "123 Test Lane");

        // Test if actual phone equals "2222222222"
        assertEquals("2222222222", contact.getPhone(), "Empty Phone argument does not return \"2222222222\".");
    }

    /**
     * Test address field requirements
     */
    // Test that a supplied address up to 30 characters is accepted
    @Test
    @DisplayName("Address argument up to 30 characters should be valid.")
    public void contactAddress_ThirtyCharString_AddressSetToThirtyCharString()
    {
        // Create address string with 30 "a" and initialize contact object
        String thirtyCharAddress = "a".repeat(30);
        Contact contact = new Contact("First Name", "Last Name", "1234567890", thirtyCharAddress);

        // Test if actual address equals supplied address
        assertEquals(thirtyCharAddress, contact.getAddress(), "Address argument with 30 characters does not return itself.");
    }

    // Test that a supplied address of 31 characters is not accepted
    @Test
    @DisplayName("Address argument more than 30 characters should be set to \"NULL\".")
    public void contactAddress_ThirtyOneCharString_AddressSetToNULL()
    {
        // Create address string with 31 "a" and initialize contact object
        String thirtyOneCharAddress = "a".repeat(31);
        Contact contact = new Contact("First Name", "Last Name", "1234567890", thirtyOneCharAddress);

        // Test if actual address equals "NULL"
        assertEquals("NULL", contact.getAddress(), "Address argument with 31 characters does not return \"NULL\".");
    }

    // Test that a null supplied address is not accepted
    @Test
    @DisplayName("null address argument should be set to \"NULL\".")
    public void contactAddress_Null_AddressSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "1234567890", null);

        // Test if actual address equals "NULL"
        assertEquals("NULL", contact.getAddress(), "Null address argument does not return \"NULL\".");
    }

    // Test that an empty supplied address is not accepted
    @Test
    @DisplayName("empty address argument should be set to \"NULL\".")
    public void contactAddress_Empty_AddressSetToNULL()
    {
        // Initialize contact object
        Contact contact = new Contact("First Name", "Last Name", "1234567890", "");

        // Test if actual address equals "NULL"
        assertEquals("NULL", contact.getAddress(), "Empty address argument does not return \"NULL\".");
    }
}
