package Services;
import java.util.HashMap;

import Objects.Rider;


public class RiderManagementSystem {
    static RiderManagementSystem riderManagementSystem;
    HashMap<Integer, Rider> riders;
    public static RiderManagementSystem getInstance() {
        if(riderManagementSystem==null)
            riderManagementSystem = new RiderManagementSystem();
        return riderManagementSystem;
    }

    private RiderManagementSystem() {
        riders = new HashMap<>();
    }

    public void addRider(Rider rider) {
        if(riders.containsKey(rider.getId())) {
            System.out.println("Rider already present ");
            return;
        }
        riders.put(rider.getId(), rider);
        System.out.println("Rider added successfully");
    }

    public void removeRider(Rider rider) {
        if(!riders.containsKey(rider.getId()))
        {
            System.out.println("Rider does not exist");
            return;
        }
        riders.remove(rider.getId());
        System.out.println("Rider removed successfully");
    }

}
