package Models.Vehicles;

public class Car extends Vehicle {
    private double gasConsumption;
    public String model;
    public String owner;
    public int price;
    public int produceYear;

    public Car(int maxVelocity, String VIN, double gasConsumption, int price) {
        super(maxVelocity, VIN);
        this.gasConsumption = gasConsumption;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " maxVelocity='" + getMaxVelocity() + "'" +
            ", VIN='" + getVIN() + "'" +
            " gasConsumption='" + getGasConsumption() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    public double getGasConsumption() {
        return this.gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
