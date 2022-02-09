class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor";
        String subString = "DEL";
        int requiredLength = 7;
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll(String.format("(?<=^.{%s})", requiredLength), subString);
        }
        String newString = String.join(" ", words);
        System.out.println(newString);
	}
}