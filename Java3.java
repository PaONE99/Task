import java.util.HashSet;

public class Java3 {
    public static void main(String[] args) {
        String inputText = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkForPangram(inputText);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkForPangram(String text) {
        text = text.toLowerCase();
        HashSet<Character> uniqueLetters = new HashSet<>();

        for (char character : text.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                uniqueLetters.add(character);
            }
        }

        return uniqueLetters.size() == 26;
    }
}