public class StockPick {
    public static void main(String[] args) {
        int arr[] = {10,20,40,50,30,70,75};
        int start =0;
        int end = arr.length-1;
        int mid;
        boolean flag = false;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid-1] < mid && arr[mid+1]<mid){
                System.out.println(mid);
            }
            else if(arr[mid-1]> mid){
                
            }
        }
    }

    
}
