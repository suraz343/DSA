public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "play";
        String str2 = "lapy";

        System.out.println(checkAnagram(str1, str2));
    }

    static boolean checkAnagram(String str1, String str2) {
        String newStr1 = removeSpecialCharacter(str1.toLowerCase());
        String newStr2 = removeSpecialCharacter(str2.toLowerCase());

        // If lengths are different, the strings cannot be anagrams
        if (newStr1.length() != newStr2.length()) {
            return false;
        }

        int[] arr = new int[26];  // Array to track character counts

        // Increment for str1 characters, decrement for str2 characters
        for (int i = 0; i < newStr1.length(); i++) {
            arr[newStr1.charAt(i) - 'a']++;
            arr[newStr2.charAt(i) - 'a']--;
        }

        // If any value in arr is not zero, they are not anagrams
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    static String removeSpecialCharacter(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
