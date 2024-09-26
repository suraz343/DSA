import java.util.Stack;

public class CheckBalancedParanthesis {
    public static void main(String[] args) {
        String expression = "{[()]}";  // Example input, can be modified as needed

        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }

    // Method to check if the parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If current character is an opening bracket, push it to the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // If current character is a closing bracket, check if it matches the top of the stack
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If stack is empty, it means there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                // Check if the popped bracket matches the current closing bracket
                if (!isMatchingPair(top, currentChar)) {
                    return false;
                }
            }
        }

        // If the stack is empty after processing, the parentheses are balanced
        return stack.isEmpty();
    }

    // Helper method to check if two characters are matching opening and closing brackets
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
