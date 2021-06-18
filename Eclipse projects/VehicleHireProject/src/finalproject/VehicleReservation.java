package finalproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
/**
 * Write a description of class Customer here.
 *
 * @author (Romnick Agsaoay)
 * @version (V2)
 * @group (1)
 */
public class VehicleReservation 
{
	//instance variables
	private String reservationNo, vehID, customerID;
	private Date startDate;
	private int noOfDays;
	
	/**
	 * Constructor for VehicleReservation Class
	 */
	public VehicleReservation(String reservationNo, String vehID, String customerID, String startDate, int noOfDays) 
	{
		this.reservationNo = reservationNo;
		this.vehID = vehID;
		this.customerID = customerID;		
		this.startDate= DateUtil.convertStringToDate(startDate);
		this.noOfDays = noOfDays;
	}
	
	public VehicleReservation() 
	{
		reservationNo = null;
		vehID = null;
		customerID = null;		
		startDate= null;
		noOfDays = 0;
	}
	
	/**
	 * Returns the reservation number
	 */
	public String getReservationNo() 
	{
		return this.reservationNo = reservationNo;
	}
	
	/**
	 * Returns the vehicle ID
	 */
	public String getVehID() 
	{
		return this.vehID = vehID;
	}
	
	/**
	 * returns the customer ID
	 */
	public String getCustomerID() 
	{
		return this.customerID = customerID;
	}
	
	/**
	 * returns the start date of reservation
	 */
	public Date getStartDate() 
	{
		return this.startDate = startDate;
	}	
	
	/**
	 * Returns the number of reservation days
	 */
	
	public int getNoOfDays() 
	{
		return this.noOfDays = noOfDays;
	}
	
	public void readData(Scanner scanner)
    {
        reservationNo = scanner.next();
        vehID = scanner.next();
		customerID = scanner.next();
		String date = scanner.next();
		startDate = DateUtil.convertStringToDate(date);
		noOfDays = scanner.nextInt();		
    }
	
	/**
	 * Prints details of a vehicle reservation
	 */
	public void printDetails() 
	{
		System.out.println("Reservation number: " + reservationNo);
		System.out.println("Vehicle ID: " + vehID);
		System.out.println("Customer ID: " + customerID);
		System.out.println("Start Date: " + DateUtil.convertDateToShortString(startDate));
		System.out.println("Number of days rented: " + noOfDays);
		System.out.println();
	}
	
	public void writeData(PrintWriter pWriter) throws FileNotFoundException
    {
        String lineOfOutput = reservationNo + ", " + vehID + ", " +
                customerID + ", " + DateUtil.convertDateToShortString(startDate) + ", " + noOfDays;                
        pWriter.println(lineOfOutput);
    }
}
