package finalproject;

import java.util.*;
import java.awt.*;
import java.io.*;
import java.util.Random;
/**
 * Write a description of class ReservationSystem here.
 *
 * @author (Romnick Agsaoay)
 * @version (V2)
 * @group (1)
 */
public class ReservationSystem
{
    // instance variables - replace the example below with your own	  
    private Map<String, Vehicle> vehicleMap;
    private Map<String, Customer> customerMap;
    private Map<String, VehicleReservation> vehicleReservationMap;
    private Random randomGenerator;
    private Boolean firstCallToGenerateReservationNo;
    private int lastReservationNumber;
    private String lastNumberGeneratedFileName;

    /**
     * Constructor for objects of class ReservationSystem
     */
    public ReservationSystem()
    {
        //initialise instance variables
        vehicleMap = new HashMap<String, Vehicle>();
        customerMap = new HashMap<String, Customer>();
        vehicleReservationMap = new HashMap<String, VehicleReservation>();
        randomGenerator = new Random();
        //generate vehicleReservationID fields
        firstCallToGenerateReservationNo = true;
        lastReservationNumber = 0;
        lastNumberGeneratedFileName = "LastNumberGenerated.txt";
        //
        //readVehicleData("vhicle_data2.txt");
    }

    /**
     * Return a HashMap vehicleMap
     */
    public Map<String, Vehicle> getVehicleMap()
    {
        return vehicleMap;
    }
    
    /**
     * Return a HashMap customerMap
     */
    public Map<String,Customer> getCustomerMap()
    {
    	return customerMap;
    }
    
    /**
     * Return a HashMap vehicleReservationMap
     */
    public Map<String, VehicleReservation> getVehicleReservationMap()
    {
    	return vehicleReservationMap;
    }
    
    /**
     * Return randomGenerator
     */
    public Random getRandomGenerator() 
    {
    	return randomGenerator;
    }
    
    /**
     * 
     */
    public Boolean getFirstCallToGenerateReservationNo() 
    {    	     	
    	return firstCallToGenerateReservationNo;    	
    }
    
    /**
     * 
     */
    public int getLastReservationNumber() 
    {
    	return lastReservationNumber;
    }
    
    /**
     * 
     */
    public String getLastNumberGeneratedFileName() 
    {
    	return lastNumberGeneratedFileName;
    }

    /**
     * Print all details for each vehicle 
     * stored in the arraylist "vehicleList"
     * 
     * calls method printDetails in Vehicle class
     */
    public void printAllVehicles()
    {
        for (Vehicle vehicle : vehicleMap.values())
        {
            vehicle.printDetails();
        }
    }

    /**
     * Print all details for each customer
     * stored in cutomerList 
     * 
     * calls method printDetails in Customer class
     */
    public void printAllCustomers()
    {
        for (Customer customer : customerMap.values())
        {
            customer.printDetails();
        }
    }
    
    /**
     * Prints all vehicle reservations 
     */
    public void printAllVehicleReservations() 
    {
    	for (VehicleReservation vehicleReservation : vehicleReservationMap.values()) 
    	{
    		vehicleReservation.printDetails();
    	}
    }
    
    /**
     * Generate a unique customerID for each customer
     */
    private String generateCustomerID(String generateLetters , int numberLength) 
    {   
    	//generate specific length of numbers using Math class
    	int generateNumber = (int) Math.pow(10, numberLength-1);
    	generateNumber = randomGenerator.nextInt(generateNumber*9);
    	   	
    	return   generateLetters + generateNumber;   	
    }
    
    /**
     * 
     */
    private String generateReservationNo()
    {   	
    	String reservationNumber = "";
    	
    	lastReservationNumber++;
    	reservationNumber = String.format("%06d", lastReservationNumber);
    	    	
    	lastNumberGeneratedFileName = reservationNumber;    	    	
    	
    	
    	    	
    	return reservationNumber;
    }

    /**
     * Adds customers to the HashMap customerMap
     */
    public void storeCustomer(Customer customer)
    {    	
    	if (customer.getCustomerID().equalsIgnoreCase("unknown") == true) 
    	{    		
    		String newCustomerID = generateCustomerID("AB-", 6);
    		    		    			    			    			
    		do 
    		{
    			newCustomerID = generateCustomerID("AB-", 6); 
			} 
    		while (customerMap.containsKey(newCustomerID) == true); 
    		
    		customer.setCustomerID(newCustomerID);
    		customerMap.put(customer.getCustomerID(), customer);
    	}
    	else	
    	{    		
    		customerMap.put(customer.getCustomerID(), customer);    		
    	}
    }

    /**
     * Adds vehicles to the HashMap vehicleMap
     */
    public void storeVehicle(Vehicle vehicle)
    {
        vehicleMap.put(vehicle.getVehID(), vehicle);
    }
    
    /**
     * Adds a vehicle reservations to the HashMap vehicleReservationMap
     * 
     * @param vehicleReservation
     */
    public void storeVehicleReservation(VehicleReservation vehicleReservation) 
    {
    	vehicleReservationMap.put(vehicleReservation.getReservationNo(), vehicleReservation);
    }

    /**
     * Reads data from vehicles file
     * Scanner reads data as String 
     * Scanner2 reads String Line
     * 
     * @ open file specified file directory
     * @throws file not found exception
     * 
     */
    public void readVehicleData() 
    {                
        Dialog dialog = null;
        FileDialog fileBox = new FileDialog(dialog, "Open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\romni\\Desktop\\Year 1\\Semester 2\\Programming 2\\VehicleHirePart2_Step6 - Copy");
        fileBox.setVisible(true);
        
        String fileName = fileBox.getFile();        
        
        if (fileName != null)
        {
        	String filePath = fileBox.getDirectory() + fileName;
        
        	readVehicleData(filePath);
        }
    }
    
    /**
     * Reads data from vehicles file
     * Scanner reads data as String 
     * Scanner2 reads String Line
     * 
     * @ open file specified file directory
     * @throws file not found exception
     * 
     */
    public void readVehicleData(String fileName) 
    {                              
        try
        {
            File dataFile = new File(fileName);       
            
            Scanner scanner = new Scanner(dataFile);                                                
            //String firstCommentLine = scanner.nextLine();
            //String secondCommentLine = scanner.nextLine();                                               
            String typeOfData = "";
            Vehicle vehicle = null;
            while(scanner.hasNextLine())
            {                                                                                                                                                                          
                String lineOfText = scanner.nextLine().trim();            
                //System.out.println(lineOfText);                
                if (lineOfText.startsWith("["))
                {
                        typeOfData = lineOfText.trim();
                        //System.out.println(typeOfData);                        
                }                                                     
                                    
                else if(!lineOfText.startsWith("//") && !lineOfText.isEmpty())
                {    
                    if(typeOfData.equalsIgnoreCase("[Car data]") == true)
                    {
                        vehicle = new Car();
                    }
                    else if(typeOfData.equalsIgnoreCase("[van data]") == true)
                    {
                        vehicle = new Van();
                    }
                    else if(typeOfData.equalsIgnoreCase("[Truck data]") == true)
                    {
                        vehicle = new Truck();
                    }                                        
                    Scanner scanner2 = new Scanner(lineOfText).useDelimiter("\\s*[,\n]\\s*");                              

                    vehicle.readData(scanner2);                        
                    storeVehicle(vehicle);                                                                                                                                      
                    scanner2.close();                    
                }                    
            }                                  
            scanner.close();            
        }
        catch(FileNotFoundException ex)
        {
            System.err.println("File Not Found Exception");
            System.err.println("Data file" + fileName + " does not exist");
            fileName = null;
        }        
    }        


    /**
     * Reads data from customers file
     * Scanner reads data as String 
     * Scanner2 reads String Line
     * 
     * @        open file specified file directory
     * @throws  file not found exception
     */
    public void readCustomerData()
    {
        Dialog dialog = null;
        FileDialog fileBox = new FileDialog(dialog, "Open", FileDialog.LOAD);
        fileBox.setDirectory(".");
        fileBox.setVisible(true);

        String fileName = fileBox.getDirectory()+fileBox.getFile();
        try
        {
            File dataFile = new File(fileName);       
            Scanner scanner = new Scanner(dataFile);           

            while(scanner.hasNextLine())
            {                                                                                                                                                                          
                String lineOfText = scanner.nextLine().trim();            
                //System.out.println(lineOfText);
                if(!lineOfText.startsWith("//") && !lineOfText.isEmpty())
                {
                    Scanner scanner2 = new Scanner(lineOfText).useDelimiter("\\s*[,\n]\\s*");                                                     
                    Customer customer = new Customer();

                    customer.readData(scanner2);                        
                    storeCustomer(customer);                                                                                                                                      
                    scanner2.close();
                }
            }
            scanner.close(); 
        }        
        catch(FileNotFoundException ex)
        {
            System.err.println("File Not Found Exception");
            System.err.println("Data file" + fileName + " does not exist");
            fileName = null;
        }                
    }
    
    public void readVehicleReservationData()
    {
        Dialog dialog = null;
        FileDialog fileBox = new FileDialog(dialog, "Open", FileDialog.LOAD);
        fileBox.setDirectory(".");
        fileBox.setVisible(true);

        String fileName = fileBox.getDirectory()+fileBox.getFile();
        try
        {
            File dataFile = new File(fileName);       
            Scanner scanner = new Scanner(dataFile);           

            while(scanner.hasNextLine())
            {                                                                                                                                                                          
                String lineOfText = scanner.nextLine().trim();            
                //System.out.println(lineOfText);
                if(!lineOfText.startsWith("//") && !lineOfText.isEmpty())
                {
                    Scanner scanner2 = new Scanner(lineOfText).useDelimiter("\\s*[,\n]\\s*");                                                     
                    VehicleReservation vehicleReservation = new VehicleReservation();

                    vehicleReservation.readData(scanner2);                        
                    storeVehicleReservation(vehicleReservation);                                                                                                                                      
                    scanner2.close();
                }
            }
            scanner.close(); 
        }        
        catch(FileNotFoundException ex)
        {
            System.err.println("File Not Found Exception");
            System.err.println("Data file" + fileName + " does not exist");
            fileName = null;
        }                
    }

    /**
     * Use Printwriter and writes customer data to a file
     * calls a method writeData in Customer class that actually
     * writes the data
     */
    public void writeCustomerData(String fileName) throws FileNotFoundException
    {
        PrintWriter pWriter = new PrintWriter(fileName);
        pWriter.println("// this is a comment, any lines that start with //");
        pWriter.println("// (and blank lines) should be ignored");
        pWriter.println();
        pWriter.println("//New customer data");
        pWriter.println("//data is customerID, surname, firstName, otherInitials, title");
        for(Customer customer : customerMap.values())
        {
            customer.writeData(pWriter);
        }
        pWriter.close();
    }
    
    public void writeVehicleReservationData(String fileName) throws FileNotFoundException
    {
        PrintWriter pWriter = new PrintWriter(fileName);
        pWriter.println("// this is a comment, any lines that start with //");
        pWriter.println("// (and blank lines) should be ignored");
        pWriter.println();
        pWriter.println("//New vehicle reservation data");
        pWriter.println("//data is reservationNumber, vehicleID, customerID, startDate, noOfDays");
        for(VehicleReservation vehicleReservation : vehicleReservationMap.values())
        {
            vehicleReservation.writeData(pWriter);
        }
        pWriter.close();
    }
    
    /**
     * Make a vehicle reservation with a valid details
     * Checks are made if all details given are valid
     * 
     * @param customerID
     * @param vehID
     * @param startDate
     * @param noOfDays
     * @return local variable Boolean allowReservation 
     */
    public Boolean makeVehicleReservation(String customerID, String vehID, String startDate, int noOfDays)
    {
    	Boolean allowReservation = false;
    	if(customerMap.containsKey(customerID) == false)
    	{
    		System.out.println("Please put a valid customerID");
    	}
    	else if(vehicleMap.containsKey(vehID) == false)
    	{
    		System.out.println("Please put a valid vehicleID");
    	}
    	else if(DateUtil.isValidDateString(startDate) == false)
    	{
    		System.out.println("Please put a valid date");
    	}
    	else if(noOfDays <= 0) 
    	{
    		System.out.println("Please put a valid number of reservation days");
    	}
    	else 
    	{
    		allowReservation = true;
    		String reservationNo = generateReservationNo();
    		VehicleReservation vehRes = new VehicleReservation(reservationNo, customerID, vehID, startDate, noOfDays);
    		storeVehicleReservation(vehRes);
    	}    		
    		return allowReservation;    	
    }
    
    /**
     * 
     * @param String vehicleID
     */
    public void getVehicle(String vehicleID) 
    {
    	Vehicle vehicle = vehicleMap.get(vehicleID);
    	vehicle.printDetails();
    }
    
    /**
     * 
     * @param String cutomerID
     */
    public void getCustomer(String customerID) 
    {
    	Customer customer = customerMap.get(customerID);
    	customer.printDetails();
    }
    
    /**
     * 
     * @param String reservationNumber
     */
    public void getVehicleReservation(String reservationNumber) 
    {
    	VehicleReservation vehicleReservation = vehicleReservationMap.get(reservationNumber);
    	vehicleReservation.printDetails();
    }
}

