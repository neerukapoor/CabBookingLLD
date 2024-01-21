import Objects.Driver;
import Objects.Rating;
import Objects.Rider;
import Objects.User;
import Services.DriverManagementSystem;
import Services.NearestDriverMatchingStrategy;
import Services.RatingBasedPricingStrategy;
import Services.RiderManagementSystem;
import Services.TripManager;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cab booking LLD");

        RiderManagementSystem riderManagementSystem = RiderManagementSystem.getInstance();
        DriverManagementSystem driverManagementSystem = DriverManagementSystem.getInstance();

        Rider rider = new Rider("Neeru",1,0,2);
        riderManagementSystem.addRider(rider);

        Driver driver1 = new Driver("Dheeraj", 1, 5, 10);
        driver1.setRating(Rating.FIVE);
        driverManagementSystem.addRider(driver1);

        Driver driver2 = new Driver("Ram", 2, 3, 11);
        driver2.setRating(Rating.FOUR);
        driverManagementSystem.addRider(driver2);

        Driver driver3 = new Driver("Rani", 3, -6, 0);
        driver3.setRating(Rating.THREE);
        driverManagementSystem.addRider(driver3);

        //driverManagementSystem.getAllDriversDetails();

        TripManager tripManager = TripManager.getInstance(new NearestDriverMatchingStrategy(), new RatingBasedPricingStrategy());
        tripManager.createTrip(rider);
    }
}
