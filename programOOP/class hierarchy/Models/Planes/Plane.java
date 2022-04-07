package Models.Planes;

public class Plane {
    private double maxFuelLoad;
    private int price;

    public Plane(double maxFuelLoad, int price) {
        this.maxFuelLoad = maxFuelLoad;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " maxFuelLoad='" + getMaxFuelLoad() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    public double getMaxFuelLoad() {
        return this.maxFuelLoad;
    }

    public void setMaxFuelLoad(double maxFuelLoad) {
        this.maxFuelLoad = maxFuelLoad;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
