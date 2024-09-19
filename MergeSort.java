public class MergeSort {

    // Main method to implement Merge Sort
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = low + (high - low) / 2;

            // Sort first and second halves
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] arr, int low, int mid, int high) {
        // Temporary array to store the merged subarrays
        int[] temp = new int[high - low + 1];

        // Pointers for both subarrays and the temp array
        int i = low, j = mid + 1, k = 0;

        // Merge the two sorted subarrays
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy the remaining elements of the left subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of the right subarray, if any
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy the merged subarray back into the original array
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        printArray(arr);

        // Perform merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
