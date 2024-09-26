package Stack;
import java.util.Stack;
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push elements into stack1
        stack1.push(2);
        stack1.push(6);
        stack1.push(1);
        stack1.push(5);
        stack1.push(4);

        System.out.println("Original Stack: " + stack1);

        // Sort the stack
        sortStack(stack1, stack2);

        System.out.println("Sorted Stack: " + stack1);
    }

    // Function to sort stack1 using stack2 as the temporary stack
    public static void sortStack(Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.isEmpty()) {
            // Pop the top element from stack1
            int temp = stack1.pop();

            // While stack2 is not empty and the top of stack2 is greater than temp
            while (!stack2.isEmpty() && stack2.peek() > temp) {
                // Move the elements back to stack1
                stack1.push(stack2.pop());
            }

            // Push the current element into stack2
            stack2.push(temp);
        }

        // Transfer the sorted elements back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
}
