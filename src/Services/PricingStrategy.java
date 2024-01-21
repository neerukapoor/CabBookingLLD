package Services;

import Objects.Driver;
import Objects.Rider;

public abstract class PricingStrategy {

    public PricingStrategy() {
    }

    abstract public Integer calculatePrice(Rider rider, Driver driver);
}
