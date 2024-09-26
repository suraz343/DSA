package Stack;

import java.util.Stack;

public class TrappingRainWater {
    
    public static int trapRainWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            // While stack is not empty and the current height is greater than the height of the top of the stack
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();  // Get the index of the building at the top of the stack
                
                if (stack.isEmpty()) {
                    break;  // If the stack is empty after popping, break out (no left boundary)
                }

                int leftBound = stack.peek();  // The index of the left boundary building
                int width = i - leftBound - 1;  // Width between the left boundary and the current building
                int heightOfWater = Math.min(height[i], height[leftBound]) - height[top];  // Height of trapped water
                
                trappedWater += width * heightOfWater;  // Add trapped water in this bounded region
            }
            
            stack.push(i);  // Push the current building's index onto the stack
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trapRainWater(height);
        System.out.println("The amount of trapped rainwater is: " + result + " units");
    }
}
