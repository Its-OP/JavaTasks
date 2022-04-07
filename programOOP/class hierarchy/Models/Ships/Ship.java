package Models.Ships;

public class Ship {
    private int displacement;
    private String flag;

    public Ship(int displacement, String flag) {
        this.displacement = displacement;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "{" +
            " displacement='" + getDisplacement() + "'" +
            ", flag='" + getFlag() + "'" +
            "}";
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
