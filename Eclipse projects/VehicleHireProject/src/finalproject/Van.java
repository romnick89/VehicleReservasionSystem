package finalproject;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends Commercial
{
    // instance variables 
    private double loadVolume;
    private Boolean slidingSideDoor;

    /**
     * Constructor for objects of class Van
     */
    public Van()
    {
        // initialise instance variables
        super();
        slidingSideDoor = false;
        loadVolume = 0.0;
    }

    /**
     * Returns the load volume value of a van vehicle
     */
    public double getLoadVolume()
    {
        return this.loadVolume = loadVolume;
    }
    
    /**
     * Returns a Boolean value if a van has a sliding door
     */
    public Boolean getSlidingSideDoor()
    {
        return this.slidingSideDoor = slidingSideDoor;
    }
    
    /**
     * Checks the van has a sliding door if it has 
     * returns "Yes" otherwise returns "No"
     */
    public String checkSlidingSideDoor()
    {
        slidingSideDoor = getSlidingSideDoor();
        if(slidingSideDoor == true)
        
        return "Yes";
        else
        return "No";
    }
    
    /**
     * Read the other details of a van vehicle data
     * Calls both super class commercial and vehicle
     * @param	scanner object
     */
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        loadVolume = scanner.nextDouble();
        String sDoor = scanner.next();
        if(sDoor.equalsIgnoreCase("Yes"))
        {
            slidingSideDoor = true;
        }
        
    }
    
    /**
     * 
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Load  Volume: " + loadVolume + "     Sliding Side Door: " 
                           + checkSlidingSideDoor());
        System.out.println();
    }    
}

