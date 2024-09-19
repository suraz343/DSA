public class ReverseAString {
    public static void main(String[] args) {
        String s = "apple";
        int len = s.length();
        String reverse = "";
        for(int i=len-1; i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);


    }
    
}
