package Models.Vehicles;

public class Vehicle{
    private int maxVelocity;
    private String VIN;

    @Override
    public String toString() {
        return "{" +
            " maxVelocity='" + getMaxVelocity() + "'" +
            ", VIN='" + getVIN() + "'" +
            "}";
    }

    public Vehicle(int maxVelocity, String VIN) {
        this.maxVelocity = maxVelocity;
        this.VIN = VIN;
    }

    public int getMaxVelocity() {
        return this.maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public String getVIN() {
        return this.VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}