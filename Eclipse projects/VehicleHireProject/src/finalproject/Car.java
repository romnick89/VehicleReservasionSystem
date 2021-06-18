package finalproject;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    // instance variables 
    private String bodyType;
    private int noOfDoors;
    private int noOfSeats;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        super();
        bodyType = null;
        noOfDoors = 0;
        noOfSeats = 0;
    }

    /**
     * Returns body type of a car object
     */
    public String getBodyType()
    {
        return this.bodyType = bodyType;
    }
    
    /**
     * Returns the number of doors of a car object
     */
    public int getNoOfDoors()
    {
        return this.noOfDoors = noOfDoors;
    }
    
    /**
     * Returns the number of seats of a car object
     */
    public int getNoOfSeats()
    {
        return this.noOfSeats = noOfSeats;
    }
    
    /**
     * Prints the other details of a car vehicle
     * Calls the super class method printDetails()
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Body type: " + bodyType + "     Number of Doors: " 
                           + noOfDoors);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println();
    }    
    
    /**
     * Reads the other details of a car object
     * Calls the super class method readData()
     * @param	scanner object
     */
    public void readData(Scanner scanner)
    {                        
        super.readData(scanner);
        bodyType = scanner.next();
        noOfDoors = scanner.nextInt();
        noOfSeats = scanner.nextInt();                   
    }
}

