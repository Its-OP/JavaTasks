package Models.Vehicles;

public class Bus extends Vehicle{
    private int numberOfSeats;
    private String carrier;

    public Bus(int maxVelocity, String VIN, int numberOfSeats, String carrier) {
        super(maxVelocity, VIN);
        this.numberOfSeats = numberOfSeats;
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "{" +
            " maxVelocity='" + getMaxVelocity() + "'" +
            ", VIN='" + getVIN() + "'" +
            " numberOfSeats='" + getNumberOfSeats() + "'" +
            ", carrier='" + getCarrier() + "'" +
            "}";
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
