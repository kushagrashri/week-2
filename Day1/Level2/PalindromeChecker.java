public class PalindromeChecker {
    // Attribute
    String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase for consistent comparison
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedText.length();

        // Compare characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true; // Is a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Example 1: Palindrome text
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();

        // Example 2: Non-palindrome text
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult();

        // Example 3: Palindrome text with spaces and capitalization
        PalindromeChecker checker3 = new PalindromeChecker("A man a plan a canal Panama");
        checker3.displayResult();
    }
}
