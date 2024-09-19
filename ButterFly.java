public class ButterFly{
    public static void main(String[] args) {
        int n = 10;  // Size of the butterfly (you can change this for different sizes)
        
        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces between the wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
