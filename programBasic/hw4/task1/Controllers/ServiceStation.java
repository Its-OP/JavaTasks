package Controllers;
import Models.Car;
public class ServiceStation {
    public static void fixCar(Car car){
        if(car.needsFixing){
            car.needsFixing = false;
            System.out.println("Car was fixed");
        }
        else{
            System.out.println("Car does not need fixing");
        }
    }
}
