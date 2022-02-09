class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor.";
        String subString = "substring";
        int requiredLength = 5;
        String newString = input.replaceAll(String.format("\\b\\w{%s}\\b", requiredLength), subString);
        System.out.println(newString);
	}
}
