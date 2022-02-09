class Program{
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amaet, consectetur adipiscing elit. Sed vitae felis congue turpis lacinia porttitor";
        String subString = "DEL";
        int requiredLength = 7;
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= requiredLength){
                words[i] = words[i].substring(0, requiredLength-1) + subString + words[i].substring(Math.min(words[i].length()-1, requiredLength), words[i].length()-1);
            }
        }
        String newString = String.join(" ", words);
        System.out.println(newString);
	}
}