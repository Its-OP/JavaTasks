class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor.";
        String newString = input;
        for (String word : input.split(" ")) {
            newString = newString.replaceAll(word, word.substring(0, 1).toUpperCase() + word.substring(Math.min(1, word.length()-1), word.length()));
        }
        System.out.println(newString);
	}
}