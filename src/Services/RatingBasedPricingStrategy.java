package Services;

import java.util.HashMap;
import java.util.Map;

import Objects.Driver;
import Objects.Rating;
import Objects.Rider;

public class RatingBasedPricingStrategy extends PricingStrategy{
    

    public Integer calculatePrice(Rider rider, Driver driver) {
        Integer price=0;
        Integer xRider = rider.getxCordinate();
        Integer yRider = rider.getyCordinate();
        Integer xdriver = driver.getxCordinate();
        Integer ydriver = driver.getyCordinate();
        Double x = Double.valueOf(Math.pow(xRider-xdriver,2));
        Double y = Double.valueOf(Math.pow(yRider-ydriver,2));
        Double z = x+y;
        Double distance = Math.sqrt(z);
        if(distance<100)
            price = 30;
        else if(distance>100)
            price=80;
        if(driver.getRating()==Rating.FIVE)
            return price+55;
        else if(driver.getRating() == Rating.FOUR)
            return price+50;
        else if(driver.getRating() == Rating.THREE) 
            return price+45;
        else if(driver.getRating() == Rating.TWO)
            return price+40;
        else 
            return price+30;
    }

}
