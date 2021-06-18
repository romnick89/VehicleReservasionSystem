package finalproject;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Customer here.
 *
 * @author (Romnick Agsaoay)
 * @version (V2)
 * @group (1)
 */
public class Customer
{
    // instance variables 
    private String customerID, surname, firstName, otherInitials, title;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String surname, String firstName, String otherInitials, String title)
    {
        //resSys.printAllCustomers();
    	// initialise instance variables
        customerID = "unknown";
        this.surname = surname;
        this.firstName = firstName;
        this.otherInitials = otherInitials;
        this.title = title;
    }
    
    /**
     * No parameter constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        customerID = null;        
        surname = null;
        firstName = null;
        otherInitials = null;
        title = null;
    }
    
    /**
     * Returns the customerID of a customer 
     */
    public String getCustomerID()
    {
        return this.customerID = customerID;
    }
    
    public void setCustomerID(String customerID) 
    {
    	this.customerID = customerID;
    }
    
    /**
     * Returns the surname of a customer 
     */
    public String getSurname()
    {
        return this.surname = surname;
    }

    /**
     * Returns the firstName of a customer 
     */
    public String getFirstName()
    {
        return this.firstName = firstName;
    }
    
    /**
     * Returns the otherInitials of a customer 
     */
    public String getOtherInitials()
    {
        return this.otherInitials = otherInitials;
    }
    
    /**
     * Returns the title of a customer 
     */
    public String getTitle()
    {
        return this.title = title;
    }
    
    /**
     * Print details of each customer
     */
    public void printDetails()
    {
        System.out.println("CustomerID: " + customerID);
        System.out.println("Customer details: " + title + " " + firstName +
         " " + otherInitials + " " + surname);        
        System.out.println();        
    }
    
    /**
     * Reads data passed to the scanner and
     * stored in the fields
     * @param scanner
     */
    public void readData(Scanner scanner)
    {
       customerID = scanner.next();
       surname = scanner.next();
       firstName = scanner.next();
       otherInitials = scanner.next();
       title = scanner.next();
    }
    
    /**
     * Writes data stored in the String lineOfOutput
     * @param printWriter
     */
    public void writeData(PrintWriter pWriter) throws FileNotFoundException
    {
        String lineOfOutput = customerID + ", " + surname + ", " +
                firstName + ", " + otherInitials + ", " + title;                
        pWriter.println(lineOfOutput);
    }
}
