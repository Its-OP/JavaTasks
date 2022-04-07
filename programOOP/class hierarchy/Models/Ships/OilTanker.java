package Models.Ships;

public class OilTanker extends Ship {
    private int maxVolume;

    public OilTanker(int displacement, String flag, int maxVolume) {
        super(displacement, flag);
        this.maxVolume = maxVolume;
    }

    @Override
    public String toString() {
        return "{" +
            " displacement='" + getDisplacement() + "'" +
            ", flag='" + getFlag() + "'" +
            " maxVolume='" + getMaxVolume() + "'" +
            "}";
    }


    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}
