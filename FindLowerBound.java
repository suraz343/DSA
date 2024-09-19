public class FindLowerBound {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 6, 8, 10, 12, 14, 16};
        int target = 9; 
        
        int lowerBoundIndex = findLowerBound(arr, target);
        
        if (lowerBoundIndex == -1) {
            System.out.println("No lower bound found for the given target.");
        } else {
            System.out.println("Lower bound of " + target + " is: " + arr[lowerBoundIndex]);
        }
    }

    
    static int findLowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int lowerBoundIndex = -1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                lowerBoundIndex = mid; 
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return lowerBoundIndex; 
    }
}
