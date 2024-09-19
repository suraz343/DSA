
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int differ=0;
        int s1=0;
        int s2=0;

        
        System.out.println("Enter the value of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }
       
        for(int i=0; i<(arr.length); i++){
            if(i<(arr.length)/2){
                s1+=arr[i];
            
            }
            else{
                s2+=arr[i];
            }
            
        }
         differ = s2-s1;
        System.out.println("differ:- " + differ);
    }
    
}
