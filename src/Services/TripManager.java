package Services;

import Objects.Driver;
import Objects.Rider;

public class TripManager {
    public static TripManager tripManager;
    RiderManagementSystem riderManagementSystem;

    DriverMatchingStrategy driverMatchingStrategy;
    PricingStrategy pricingStrategy;

    public static TripManager getInstance(DriverMatchingStrategy driverMatchingStrategy, PricingStrategy pricingStrategy) {
        if(tripManager==null)
            tripManager = new TripManager(driverMatchingStrategy, pricingStrategy);
        return tripManager;
    }
    private TripManager(DriverMatchingStrategy driverMatchingStrategy, PricingStrategy pricingStrategy) {
        riderManagementSystem = RiderManagementSystem.getInstance();

        this.driverMatchingStrategy = driverMatchingStrategy;
        this.pricingStrategy = pricingStrategy;
    }

    public void setDriverMatchingStrategy(DriverMatchingStrategy driverMatchingStrategy) {
        this.driverMatchingStrategy = driverMatchingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void createTrip(Rider rider) {
        if(!riderManagementSystem.riders.containsKey(rider.getId())) {
            System.out.println("This Rider does not exist in our database");
        }
        Driver driver = driverMatchingStrategy.matchDriver(rider);
        System.out.println("Driver Name: " + driver.getName() + " is allocated for your ride "); 
        Integer price = pricingStrategy.calculatePrice(rider, driver);
        System.out.println("Please Pay: " + price);
    }
}
