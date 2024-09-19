public class TargetSortedArray {
    public static void main(String[] args) {
        int target = 12;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        boolean found = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                found = true;
                System.out.println(i);
            }
            
        } 
        if(!found){
            System.out.println(-1);
        }

    }
    
}
