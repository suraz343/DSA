import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        Stack <Character> s1 = new Stack<>();
        String text = "suraj";
        for(int i=0; i<text.length();i++){
            s1.push(text.charAt(i));

        }
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }  
    } 
}
