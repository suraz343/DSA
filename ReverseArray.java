import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {3,4,6,7,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]){
        int last = arr.length-1;
        int temp;  //for removing the space complexity we did this
        for(int i = 0; i<arr.length / 2;i++){ 
            temp = arr[i];
            arr[i] = arr[last];
            arr[last]=temp;
            last--;
        }
    }
}
