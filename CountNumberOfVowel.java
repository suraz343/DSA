public class CountNumberOfVowel {
    public static void main(String[] args) {
        String vowel = "aeiouAEIOU";
        int count =0;
        String s1 = "apple";
        int len = s1.length();
        for(int i=0; i<len;i++){
            if(vowel.indexOf(s1.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
