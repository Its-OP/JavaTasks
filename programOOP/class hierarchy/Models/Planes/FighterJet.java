package Models.Planes;

public class FighterJet extends Plane{
    private double maxSpeed;
    private String[] payload;

    public FighterJet(double maxFuelLoad, int price, double maxSpeed, String[] payload) {
        super(maxFuelLoad, price);
        this.maxSpeed = maxSpeed;
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "{" +
            " maxFuelLoad='" + getMaxFuelLoad() + "'" +
            ", price='" + getPrice() + "'" +
            " maxSpeed='" + getMaxSpeed() + "'" +
            ", payload='" + getPayload() + "'" +
            "}";
    }

    void setMaxSpeed(double value){
        maxSpeed = value;
    }

    protected double getMaxSpeed(){
        return maxSpeed;
    }

    void setPayload(String[] value){
        payload = value;
    }

    protected String[] getPayload(){
        return payload;
    }
}
