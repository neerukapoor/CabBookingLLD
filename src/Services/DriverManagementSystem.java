package Services;

import java.util.HashMap;
import java.util.Map;

import Objects.Driver;

public class DriverManagementSystem {
    static DriverManagementSystem driverManagementSystem;
    HashMap<Integer, Driver> drivers;

    public static DriverManagementSystem getInstance() {
        if(driverManagementSystem == null)
            driverManagementSystem = new DriverManagementSystem();    
        return driverManagementSystem;
    }

    private DriverManagementSystem() {
        drivers = new HashMap<>();
    }

    public void addRider(Driver driver) {
        if(drivers.containsKey(driver.getId())) {
            System.out.println("Rider already present ");
            return;
        }
        drivers.put(driver.getId(), driver);
        System.out.println("Rider added successfully");
    }

    public void removeRider(Driver driver) {
        if(!drivers.containsKey(driver.getId()))
        {
            System.out.println("Rider does not exist");
            return;
        }
        drivers.remove(driver.getId());
        System.out.println("Rider removed successfully");
    }
    
    public void getAllDriversDetails() {
        for (Map.Entry<Integer,Driver> driverData : drivers.entrySet()) {
            Driver driver = driverData.getValue();
            System.out.println("Driver Name: " + driver.getName() + " driver Rating: " + driver.getRating());
        }
    }

}
