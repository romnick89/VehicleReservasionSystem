package finalproject;

import java.io.FileNotFoundException;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ReservationSystem resSys = new ReservationSystem();
		
		//new Test();
		resSys.readVehicleData();
//		
		resSys.printAllVehicles();
//		
//		resSys.getVehicle("TF-63403");		
		
		//resSys.readCustomerData();
		
		//resSys.readVehicleReservationData();
		
		//resSys.printAllCustomers();
		
		//Customer customer = new Customer("Quixote", "Flamingo", "K", "Don");
		//resSys.storeCustomer(customer);
		
		//resSys.printAllCustomers();
		
		//resSys.generateCustomerID("AB-", 6);
		//resSys.writeCustomerData("F:\\Semester 2\\Programming 2\\VehicleHirePart2_Step6 - v2\\test_customer.txt");
		//resSys.writeCustomerData("C:\\Users\\romnick13\\Desktop\\test_customer.txt");
		
		//VehicleReservation vRes = new VehicleReservation("test", "test", "test", 5, "25-03-2019");
		
		//DateUtil d = new DateUtil();
		
		//System.out.println(d.setshortDatePattern("2019/05/03"));
		
		//resSys.makeVehicleReservation("AB-406427", "GH-68135", "23-04-2019", 5);
		//resSys.makeVehicleReservation("AB-760279", "JK-69991", "30-04-2019", 7);
		
		//resSys.printAllVehicleReservations();
		
		//resSys.writeVehicleReservationData("C:\\Users\\romnick13\\Desktop\\test_vehicleReservation.txt");
	}

}
