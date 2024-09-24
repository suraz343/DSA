public class CompareTwoString {
    public static void main(String[] args) {
        String s1 = "Appl";
        String s2 = "Apple";
        boolean result = compare(s1, s2);
        System.out.println("Are the two strings equal? " + result);
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // If no mismatch is found, return true
    }
}
