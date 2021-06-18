package finalproject;

import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public Test()
    {                        
                        
//        ReservationSystem rSystem = new ReservationSystem();
//                                                                           
//        rSystem.readVehicleData();
//        rSystem.printAllVehicles();
//        
//        
//        Vehicle vehicle = new Car();
//        Vehicle vehicle2 = new Van();
//        Vehicle vehicle3 = new Truck();
//        
//        rSystem.storeVehicle(vehicle);                
//        rSystem.storeVehicle(vehicle2);
//        rSystem.storeVehicle(vehicle3);
//        
//        rSystem.printAllVehicles();
//        
//        vehicle.printDetails();        
//        vehicle2.printDetails();
//        vehicle3.printDetails();
//        
//        System.out.println(vehicle.checkAircon());
        
        
        Date startDate = DateUtil.convertStringToDate("23-03-2019");
        Date endDate = DateUtil.convertStringToDate("28-03-2019");
        int noOfDaysRented = DateUtil.daysBetween(startDate, endDate);
        System.out.println(DateUtil.convertDateToShortString(startDate));
        System.out.println(DateUtil.convertDateToLongString(endDate));
        System.out.println(noOfDaysRented);
        //VehicleReservation vRes = new VehicleReservation("test", "test", "test", 5, "25-03-2019");
        
    }
}

