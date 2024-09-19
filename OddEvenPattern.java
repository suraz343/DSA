public class OddEvenPattern {
    public static void main(String[] args) {
        int odd = 1;
        int even = 2;
        for(int i = 5; i >= 1; i--) { // Corrected loop condition
            if(i % 2 == 0) { // Even case
                for(int j = 0; j < 5 - i; j++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < i; j++) {
                    System.out.print(even + " "); // Using print instead of println
                    even += 2;
                }
            } else { // Odd case
                for(int j = 0; j < 5 - i; j++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < i; j++) {
                    System.out.print(odd + " "); // Using print instead of println
                    odd += 2;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
