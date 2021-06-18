package finalproject;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Truck here.
 *
 * @author (Romnick Agsaoay)
 * @version (V2)
 * @group (1)
 */
public class Truck extends Commercial
{
    // instance variables - replace the example below with your own
    private ArrayList<String> attributes;

    /**
     * Constructor for objects of class Truck
     */
    public Truck()
    {
        // initialise instance variables
        attributes = new ArrayList<String>();
    }

    /**
     * Returns arraylist attributes
     */
    public ArrayList getAttribtes()
    {
        return this.attributes = attributes;
    }
    
    /**
     * Reads the other details of a truck object
     * Calls the super class method readData() in Vehicle and
     * Commercial class
     * @param	scanner object
     */
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        while(scanner.hasNext())
        {
            attributes.add(scanner.next());
        }
    }
    
    /**
     * Print the details of a truck vehicle
     * Calls the method printDetails in both Commercial
     * and Vehicle class
     */
    public void printDetails()
    {
        super.printDetails();        
        StringBuilder sb = new StringBuilder();        
        int index = 1;
        for(String features : attributes)
        {
            if(index < attributes.size())
            {
            	sb.append(features + ", ");
            	index++;
            }
            else 
            {
            	sb.append(features + "");           	
            }                       
        }                
        System.out.println("Features: " + sb);         
        System.out.println();
    }
}

