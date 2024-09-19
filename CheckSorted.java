public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 4, 5};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                if(arr[i+1] < arr[i]){
                    return false;
                }
            }
           
            
        }
        return true;
    }
    
}
