import Controllers.*;
import Models.*;
public class Program {
    public static void main(String[] args) {
        Car oldCar = new Car();
        oldCar.needsFixing = true;

        Driver driver = new Driver(oldCar);
        driver.fixCar();
        driver.fixCar();

        // ServiceStation.fixCar(oldCar);
        // ServiceStation.fixCar(oldCar);
	}
}
