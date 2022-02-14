package Controllers;
import Models.Car;
public class Operator{

    public static double DoMathFunction(String type, double firstVar, double secondVar){
        switch (type){
            case "div":
                firstVar = firstVar / secondVar;
                break;
            case "log10":
                firstVar = Math.log10(firstVar + secondVar);
                break;
            case "log":
                firstVar = Math.log(firstVar + secondVar);
                break;
            case "pow":
                firstVar = Math.pow(firstVar, secondVar);
                break;
            default:
                firstVar = Math.sqrt(-1.0);
                break;
        }
        return firstVar;
    }

    public static void ProcessCar(String operation, Car car, double factor){
        switch (operation){
            case "price":
                car.price *= factor;
                break;
            case "weight":
                car.weight *= factor;
                break;
            case "speed":
                car.speed *= factor;
                break;
        }
    }
}