package Stack;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = nextGreaterElements(arr);
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Next Greater Element Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] nextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
