public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "iississinngkg";

        char ans = firstNonRepeatingCharacter(str);
        if(ans == 'Z') {
            System.out.println("All character in string are appear once.");
        }
        else{
            System.out.println("The first element which is non repeating is:- " + ans);
        }
        
    }

    static char firstNonRepeatingCharacter(String str) {
       
        // array to store frequency of alphabets
        int[] arrAlphabets = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arrAlphabets[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arrAlphabets[str.charAt(i) - 'a']  == 1) {
                return str.charAt(i);
            }
        }

        return 'Z';
    }
}