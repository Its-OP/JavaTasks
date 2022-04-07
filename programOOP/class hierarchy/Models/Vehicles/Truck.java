package Models.Vehicles;

public class Truck extends Vehicle {
    private int maxLoad;
    private int numberOfWheels;

    public Truck(int maxVelocity, String VIN, int maxLoad, int numberOfWheels) {
        super(maxVelocity, VIN);
        this.maxLoad = maxLoad;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "{" +
            " maxVelocity='" + getMaxVelocity() + "'" +
            ", VIN='" + getVIN() + "'" +
            " maxLoad='" + getMaxLoad() + "'" +
            ", numberOfWheels='" + getNumberOfWheels() + "'" +
            "}";
    }

    public int getMaxLoad() {
        return this.maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
