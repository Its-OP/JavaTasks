import java.util.ArrayList;
import java.util.List;

class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor";
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(String word : input.split("\\b")){
            if(!word.matches("^\\w*$")){
                continue;
            }
            if(word.length() < min){
                min = word.length();
            }
            if(word.length() > max){
                max = word.length();
            }
        }
        List<String> minLengths = new ArrayList<>();
        List<String> maxLengths = new ArrayList<>();
        for (String word : input.split("\\b")) {
            if(word.length() == max){
                maxLengths.add(word);
            }
            if(word.length() == min){
                minLengths.add(word);
            }
        }
        for (String word : maxLengths) {System.out.print(word + " ");}
        System.out.println();
        for (String word : minLengths) {System.out.print(word + " ");}
	}
}