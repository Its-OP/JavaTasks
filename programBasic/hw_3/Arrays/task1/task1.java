import java.util.LinkedList;
import java.util.List;

class Program{
    public static void main(String[] args) {
        Integer[] numbers = {-54, 32,-33, 57,-80, 24,-100, -10,-76, 54,-68, 14,-44, -23,-91, 72,24, 92,-61, -5};
        List<Integer> positives = new LinkedList<>();
        List<Integer> negatives = new LinkedList<>();
        for (Integer number : numbers) {
            if(number < 0){
                negatives.add(number);
            }
            else{
                positives.add(number);
            }
        }
        for (Integer number : positives) {System.out.print(number + " ");}
        System.out.println();
        for (Integer number : negatives) {System.out.print(number + " ");}
	}
}
