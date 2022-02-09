class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor";
        String subString = "et";
        String additionalWord = "DEL";
        String newString = input.replaceAll(String.format("%s\\b", subString), String.format("%s %s", subString, additionalWord));
        System.out.println(newString);
	}
}