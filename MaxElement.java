public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {5, 8, 10, 6, 9 , 0};

        int m1 = arr[0];
        int m2 = arr[0];
        int m3 = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > m1) {
                m3=m2;
                m2 = m1;
                m1 = arr[i];
                
            }
            else if(arr[i] > m2){
                m3 = m2;
                m2 = arr[i];
            }
            
            else if(arr[i] > m3){
                m3 = arr[i];
            }
            
        }
        sum = m1 +m2 + m3;
    System.out.println("The sum of the greatest elements are:"+ sum);
        
    }
}
