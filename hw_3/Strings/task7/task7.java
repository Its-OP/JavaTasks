class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor.";
        String[] sentences = input.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();
            String[] words = sentence.split("\\b");
            String temp = words[0];
            words[0] = words[words.length-1];
            words[words.length-1] = temp;
            sentences[i] = String.join("", words) + ".";
        }
        String newString = String.join(" ", sentences);
        System.out.println(newString);
	}
}