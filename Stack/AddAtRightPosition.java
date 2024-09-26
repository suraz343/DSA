import java.util.Stack;

public class AddAtRightPosition {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push some elements to stack s1
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(8);

        int insertElement = 7;

        
        while (!s1.isEmpty() && s1.peek() > insertElement) {
            s2.push(s1.pop());
        }

        s1.push(insertElement);
        
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        // Output the stack to see the result
        System.out.println("Stack after inserting " + insertElement + ":");
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}
