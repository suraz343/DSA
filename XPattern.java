public class XPattern {
    public static void main(String[] args) {
        int n = 10; // You can adjust the size here

        // Loop to print the upper part and middle line
        for (int i = 0; i < n; i++) {
            // Left half (Top left diagonal)
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
