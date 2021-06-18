package finalproject;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Vehicle here.
 *
 * @author (Romnick Agsaoay)
 * @version (V2)
 * @group (1)
 */
public abstract class Vehicle
{
    // instance variables - replace the example below with your own
    private String group, vehID, regNo, make;
    private String model, fuelType, gearbox, transmission, dateFirstRegistered;
    private Boolean aircon;
    private double engineSize;
    private int mileage;    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        group = null;
        vehID = null;
        regNo = null;
        make = null;
        model = null;
        aircon = false;
        engineSize = 0.0;
        fuelType = null;
        gearbox = null;
        transmission = null;
        mileage = 0;
        dateFirstRegistered = null;
    }
    
    /**
     * Return group of vehicle
     */
    public String getGroup()
    {
        return this.group = group;
    }
    
    /**
     * Return vehicle ID of a vehicle
     */
    public String getVehID()
    {
        return this.vehID = vehID;
    }
    
    /**
     * Return registration number of a vehicle
     */
    public String getRegNo()
    {
        return this.regNo = regNo;
    }
    
    /**
     * Returns the make of a vehicle
     */
    public String getMake()
    {
        return this.make = make;
    }
    
    /**
     * Returns the model of a vehicle
     */
    public String getModel()
    {
        return this.model = model;
    }
    
    /**
     * Returns the fuel type of a vehicle
     */
    public String getFuelType()
    {
        return this.fuelType = fuelType;
    }
    
    /**
     * Returns the gearbox of vehicle
     */
    public String getGearbox()
    {
        return this.gearbox = gearbox;
    }
    
    /**
     * Returns the type of transmission of a vehicle
     */
    public String getTransmission()
    {
        return this.transmission = transmission;
    }
    
    /**
     * Returns the date of a vehicle it was 
     * first registered
     */
    public String getDateFirstRegistered()
    {
        return this.dateFirstRegistered = dateFirstRegistered;
    }
    
    /**
     * Returns the engine size of a vehicle
     */
    public double getEngineSize()
    {
        return this.engineSize = engineSize;
    }
    
    /**
     * Returns the current mileage of a vehicle
     */
    public int getMileage()
    {
        return this.mileage = mileage;
    }    
    
    /**
     * Returns true if a vehicle has aircon or climate
     * control otherwise returns false
     */
    public Boolean getAircon()
    {
        return aircon;
    }    
    
    /**
     * Checks the aircon if it's true 
     * returns a String "Yes" and if it's false
     * returns a String "No"
     */
    public String checkAircon()
    {
        aircon = getAircon();
        if(aircon == true)
        
        return "Yes";
        else
        return "No";
    }
    
    /**
     *  Print all details of a vehicle
     */
    public void printDetails()
    {
        System.out.println(make + " "+ model +" Group: "+ group + "   VehID: "+ vehID+ 
        "   RegNo: "+ regNo);
        System.out.println("Air conditioning/Climate control: " + checkAircon());
        System.out.println("Engine Size: " + engineSize + "       Fuel: " + fuelType);
        System.out.println("Gearbox: " + gearbox + "     Transmission: " + transmission);
        System.out.println("Mileage: " + mileage + "     Date first registered: " 
                           + dateFirstRegistered);        
    }        
    
    /**
     * reads vehicle data and gives the values that is passed to the fields 
     * @param scanner object
     */
    public void readData(Scanner scanner)
    {                                                       
        group = scanner.next();
        vehID = scanner.next();
        regNo = scanner.next();
        make = scanner.next();
        model = scanner.next();                        
        String ac = scanner.next();
        if(ac.equalsIgnoreCase("Yes"))
        {
            aircon = true;
        }                    
        engineSize = scanner.nextDouble();                                                        
        fuelType = scanner.next();                        
        gearbox = scanner.next();            
        transmission = scanner.next();                
        mileage = scanner.nextInt();                                           
        dateFirstRegistered = scanner.next();                    
    }
}

