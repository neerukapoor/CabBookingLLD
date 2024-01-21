package Objects;

public class Rider extends User {
    
    public Rider(String riderName, Integer id, Integer xCordinate, Integer yCordinate) {
        this.id = id;
        this.userName = riderName;
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
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
