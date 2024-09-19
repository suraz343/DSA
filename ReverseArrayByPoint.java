import java.util.Arrays;

public class ReverseArrayByPoint {
    public static void main(String[] args) {
        int index = 5;
        int temp[] = new int[8];
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        
        for (int i = index + 1; i < arr.length; i++) {
            temp[i - index - 1] = arr[i];
        }

        for (int i = 0; i <= index; i++) {
            temp[arr.length - index-1+i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
