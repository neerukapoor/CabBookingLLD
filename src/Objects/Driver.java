package Objects;

public class Driver extends User{

    public Driver(String driverName, Integer id, Integer xCordinate, Integer yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.id = id;
        this.userName = driverName;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.userName;
    }

    public Rating getRating() {
        return this.rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Integer getxCordinate() {
        return this.xCordinate;
    }

    public Integer getyCordinate() {
        return this.yCordinate;
    }

    public void updateCordninates(Integer xCordinate, Integer yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }
}
