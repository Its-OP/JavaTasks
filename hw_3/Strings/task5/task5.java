import java.util.ArrayList;
import java.util.List;

class Program{
    public static void main(String[] args) {
        String input = "Lorel ipsuI dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor.";
        List<String> matchingWords = new ArrayList<>();
        for (String word : input.split("\\b")) {
            if(word.matches("^(?i)(.).*\\1$")){
                matchingWords.add(word);
            }
        }
        for (String word : matchingWords) {System.out.println(word);}
	}
}
