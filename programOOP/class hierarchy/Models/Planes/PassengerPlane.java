package Models.Planes;

public class PassengerPlane extends Plane {
    private int numberOfSeats;
    private int landings;

    public PassengerPlane(double maxFuelLoad, int price, int numberOfSeats, int landings) {
        super(maxFuelLoad, price);
        this.numberOfSeats = numberOfSeats;
        this.landings = landings;
    }

    @Override
    public String toString() {
        return "{" +
            " maxFuelLoad='" + getMaxFuelLoad() + "'" +
            ", price='" + getPrice() + "'" +
            " numberOfSeats='" + getNumberOfSeats() + "'" +
            ", landings='" + getLandings() + "'" +
            "}";
    }

    public int getLandings() {
        return this.landings;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public void setNumberOfSeats(int value){
        numberOfSeats = value;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }
}
