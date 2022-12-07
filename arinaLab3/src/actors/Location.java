package actors;

public class Location {
    private String place;
    public Location(String place) {
      this.place = place;
    }
    public String getPlace() {
        return place;
    }

    public Location setPlace(String place) {
        this.place = place;
        return this;
    }

    @Override
    public String toString(){
        return "\nлокация: " + getPlace() + "\n";
    }

}
