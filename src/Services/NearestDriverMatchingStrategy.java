package Services;

import java.util.HashMap;
import java.util.Map;

import Objects.Driver;
import Objects.Rider;

public class NearestDriverMatchingStrategy extends DriverMatchingStrategy {

    public NearestDriverMatchingStrategy() {
    }

    public Driver matchDriver(Rider rider) {
        HashMap<Integer, Driver> existingDrivers = driverManagementSystem.drivers;
        Double nearestDistance = Double.MAX_VALUE;
        Integer xRider = rider.getxCordinate();
        Integer yRider = rider.getyCordinate();
        Driver finalDriver=null;
        for (Map.Entry<Integer,Driver> driverData : existingDrivers.entrySet()) {
            Driver driver = driverData.getValue();
            Integer xdriver = driver.getxCordinate();
            Integer ydriver = driver.getyCordinate();
            Double x = Double.valueOf(Math.pow(xRider-xdriver,2));
            Double y = Double.valueOf(Math.pow(yRider-ydriver,2));
            Double z = x+y;
            Double distance = Math.sqrt(z);
            System.out.println("Driver: " + driver.getName()+ " distance is " + distance);
            if(nearestDistance>distance) {
                nearestDistance = distance;
                finalDriver = driver;
            }
        }
        System.out.println("Nearest distance is: " + nearestDistance);
        return finalDriver;
    }
}
