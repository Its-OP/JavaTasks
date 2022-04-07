import java.util.LinkedList;
import java.util.List;

class Program{
    public static void main(String[] args) {
        Integer[] firstArray = {-68, 14,-44, -23,-91, 72,24, 92,-61, -5};
        Integer[] secondArray = {-54, 32,-33, 57,-80, 24,-100, -10,-76, 54};
        Double firstAvg = GetFlooredAverage(firstArray);
        Double secondAvg = GetFlooredAverage(secondArray);
        List<Integer> numbersInBetween = new LinkedList<>();
        for (Integer number : firstArray) {
            if(number > Math.min(firstAvg, secondAvg) && number < Math.max(firstAvg, secondAvg)){
                numbersInBetween.add(number);
            }
        }
        for (Integer number : secondArray) {
            if(number > Math.min(firstAvg, secondAvg) && number < Math.max(firstAvg, secondAvg)){
                numbersInBetween.add(number);
            }
        }
        for (Integer integer : numbersInBetween) {System.out.println(integer);}
	}
    public static Double GetFlooredAverage(Integer[] arr){
        Double avg = 0.0;
        for (Integer number : arr) {
            avg += number;
        }
        return avg/= arr.length;
    }
}
