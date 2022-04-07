package Models.Ships;

public class Tow extends Ship {
    private int power;

    public Tow(int displacement, String flag, int power) {
        super(displacement, flag);
        this.power = power;
    }

    @Override
    public String toString() {
        return "{" +
            " displacement='" + getDisplacement() + "'" +
            ", flag='" + getFlag() + "'" +
            " power='" + getPower() + "'" +
            "}";
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
