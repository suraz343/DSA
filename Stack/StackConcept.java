package Stack;
import java.util.Stack;

public class StackConcept {
    public static void main(String[] args) {
        Stack <Integer> s1= new Stack<>();

    s1.push(10);

    int i = 0 ;
    int count = 4;

    while(!s1.isEmpty()) {
        while(i != count) {
            s1.push(i + 3);
            i++;
        }
        break;
    }

    System.out.print(s1.peek());
    }
    

}
