package Strings;

public class LowerToUpper {
    public static void main(String[] args) {
        String s1 = "asDfRwQ";
        String ans = UpperCase(s1);
        System.out.println(ans); // Output: ASDFRWQ
    }

    static String UpperCase(String str) {
        String result = ""; // Start with an empty string
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                result += (char)(ch - 32);
            } else {
                // If it's not a lowercase character, append it as it is
                result += ch;
            }
        }

        return result;
    }
}
