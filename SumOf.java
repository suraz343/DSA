public class SumOf {
    public static void main(String[] args) {
        int arr[] = {5, 8, 10, 6, 9 , 0};

        int m1 = arr[0];
        int m2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > m1) {
                m2 = m1;
                m1 = arr[i];
                
            }
            else if(arr[i] < m1 && arr[i] > m2){
                m2 = arr[i];
            }
        
            
        }
        System.out.println("The greatest element is:"+ m1);
        System.out.println("The second greatest element is:" + m2);
    }
}
