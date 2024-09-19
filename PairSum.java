

public class PairSum {
    public static void main(String[] args) {
        int sum = 9;
        int arr[] = {2,2,2,3};
        boolean flag = false;
        // int sum = sc.nextInt();
        for(int i=0; i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] + arr[j-1] == sum) {
                    flag=true;
                    System.out.println(arr[j] + " "+ arr[j-1]);
                }
            }
        }
        if(!flag){
            System.out.println("no pair exist");
        }

       
    }
    
}
