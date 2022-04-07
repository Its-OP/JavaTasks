package Models.Ships;

public class CruiseShip extends Ship {
    private String[] crew;
    private int numberOfPassengers;

    public CruiseShip(int displacement, String flag, String[] crew, int numberOfPassengers) {
        super(displacement, flag);
        this.crew = crew;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "{" +
            " displacement='" + getDisplacement() + "'" +
            ", flag='" + getFlag() + "'" +
            " crew='" + getCrew() + "'" +
            ", numberOfPassengers='" + getNumberOfPassengers() + "'" +
            "}";
    }


    public String[] getCrew() {
        return this.crew;
    }

    public void setCrew(String[] crew) {
        this.crew = crew;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
