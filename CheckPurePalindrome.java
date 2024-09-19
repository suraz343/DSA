public class CheckPurePalindrome {
    public static void main(String[] args) {
        String s = "madam";
        int len = s.length();
        boolean isPalindrome = true;

        // Check characters from start and end simultaneously
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                isPalindrome = false;  // Not a palindrome if mismatch found
                break;
            }
        }

        // Print the result after checking the entire string
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
