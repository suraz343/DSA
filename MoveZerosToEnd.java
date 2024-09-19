import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 2, 0, 3, 4, 0, 5};
        
        // Call the function to move zeros to the end
        moveZerosToEnd(arr);
        
        // Print the modified array
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0; // This will track the position of non-zero elements

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i]; // Place non-zero element at the correct index
                nonZeroIndex++; // Move index for next non-zero element
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
}
