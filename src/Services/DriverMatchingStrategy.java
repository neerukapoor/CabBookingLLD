package Services;

import Objects.Driver;
import Objects.Rider;

public abstract class DriverMatchingStrategy {
    
    DriverManagementSystem driverManagementSystem;
    public DriverMatchingStrategy() {
        this.driverManagementSystem = DriverManagementSystem.getInstance();
    }

    abstract public Driver matchDriver(Rider rider); 
    
}
