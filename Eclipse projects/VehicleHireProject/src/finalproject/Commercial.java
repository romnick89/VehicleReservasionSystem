package finalproject;

import java.util.*;
/**
 * Write a description of class Commercial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Commercial extends Vehicle
{
    // instance variables 
    private int payload;

    /**
     * Constructor for objects of class Commercial
     */
    public Commercial()
    {
        // initialise instance variables
        super();
        payload = 0;
    }

    /**
     * Returns the payload of a commercial type vehicle
     */
    public int getPayload()
    {
        return this.payload = payload;
    }
    
    /**
     * Prints the payload of a commercial type vehicle
     * Calls the super class method printDetails()
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Payload: " + payload + "kg");
    }
    
    /**
     * Reads the payload of a data file
     * Calls the super class method readData()
     * @param 	scanner object
     */
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        payload = scanner.nextInt();                     
    }
}

