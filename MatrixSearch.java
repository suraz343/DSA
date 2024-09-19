public class MatrixSearch {

    // Efficient search in a sorted matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Start from the top-right corner
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;       // Starting row
        int col = cols - 1; // Starting column (top-right)

        // Traverse the matrix
        while (row < rows && col >= 0) {
            // If the target is found
            if (matrix[row][col] == target) {
                return true;
            }
            // If the current element is greater than the target, move left
            else if (matrix[row][col] > target) {
                col--;  // Move left
            }
            // If the current element is smaller than the target, move down
            else {
                row++;  // Move down
            }
        }

        // Return false if the element is not found
        return false;
    }

    public static void main(String[] args) {
        // Example sorted matrix
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;

        // Search for the target in the matrix
        if (searchMatrix(matrix, target)) {
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }
}
