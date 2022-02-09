import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.element.Element;

class Program{
    public static void main(String[] args) {
        Integer[] numbers = {-54, 32,-33, 57,-80, 24,-100, -100, -10,-76, 54,-68, 14,-44, -23,-91, 72,24, 92, 92, -61, -5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbers));
        int duplicateMin = 0;
        int duplicateMax = 0;
        for (Integer number : numbers) {
            if(number == max && duplicateMax == 0){
                duplicateMax++;
            }
            else if(number == min && duplicateMin == 0){
                duplicateMin++;
            }
            else if((number == min && duplicateMin == 1) || (number == max && duplicateMax == 1)){
                numbersList.remove(numbersList.indexOf(number));
            }
        }
        numbers = numbersList.toArray(new Integer[numbersList.size()]);
        for (Integer number : numbers) {System.out.print(number + " ");}
	}
}