package Services;

import java.util.HashMap;
import java.util.Map;

import Objects.Driver;
import Objects.Rating;
import Objects.Rider;

public class RatingBasedDriverMatchingStrategy extends DriverMatchingStrategy {
    public RatingBasedDriverMatchingStrategy() {
    }

    public Driver matchDriver(Rider rider) {
        HashMap<Integer, Driver> existingDrivers = driverManagementSystem.drivers;
        Driver finalDriver=null;
        for (Map.Entry<Integer,Driver> driverData : existingDrivers.entrySet()) {
            Driver driver = driverData.getValue();
            Rating rating = driver.getRating();
            if(rating==Rating.FIVE) {
                finalDriver = driver;
                break;
            }
        }
        return finalDriver;
    }
}
