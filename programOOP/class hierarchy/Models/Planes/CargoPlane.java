package Models.Planes;

public class CargoPlane extends Plane{
    private int maxCargoWeight;
    private byte type;

    public CargoPlane(double maxFuelLoad, int price, int maxCargoWeight, byte type) {
        super(maxFuelLoad, price);
        this.maxCargoWeight = maxCargoWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
            " maxFuelLoad='" + getMaxFuelLoad() + "'" +
            ", price='" + getPrice() + "'" +
            " maxCargoWeight='" + getMaxCargoWeight() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }

    public void setMaxCargoWeight(int value){
        maxCargoWeight = value;
    }

    public int getMaxCargoWeight(){
        return maxCargoWeight;
    }

    public void setType(byte value){
        maxCargoWeight = value;
    }

    public byte getType(){
        return type;
    }
}
