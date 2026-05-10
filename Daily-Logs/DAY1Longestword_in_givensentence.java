public class DAY1Longestword_in_givensentence {
    public static void main(String[] args) {
        // Approach 1
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String[] words = s.split(" ");
        // System.out.println(Arrays.toString(words));
        // String longest_word = "";
        // for(String word : words){
        // if(word.length() > longest_word.length()){
        // longest_word = word;
        // }
        // }
        // System.out.println(longest_word);

        // Approach 2
        String sentence = "Welcome to the TakshashilaUniversity";
        String word = "";
        String longestword = "";
        sentence = sentence + " "; // here by adding the space at last of sentence
        // only we can enter into the else block after the last word in sentence...
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > longestword.length()) {
                    longestword = word;
                }
                word = "";
            }
        }
        System.out.println(longestword);
    }
}
