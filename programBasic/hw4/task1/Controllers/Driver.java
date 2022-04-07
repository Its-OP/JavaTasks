package Controllers;
import Models.Car;

public class Driver {
    public Car personalCar;
    public Driver(Car car){
        personalCar = car;
    }
    public void fixCar(){
        if(personalCar.needsFixing){
            personalCar.needsFixing = false;
            System.out.println("Car was fixed");
        }
        else{
            System.out.println("Car does not need fixing");
        }
    }
}
