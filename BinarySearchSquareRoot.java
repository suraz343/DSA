public class BinarySearchSquareRoot {
    
    // Method to find the square root using binary search
    static double squareRoot(double number, double precision) {
        if (number < 0) {
            return -1; // Square root of negative number is not defined for real numbers
        }
        
        double low = 0;
        double high = number;
        double mid = 0;
        
        while ((high - low) > precision) {
            mid = (low + high) / 2;
            
            double midSquared = mid * mid;
            
            // If mid*mid is close enough to the number
            if (Math.abs(midSquared - number) < precision) {
                return mid;
            } else if (midSquared < number) {
                low = mid;
            } else {
                high = mid;
            }
        }
        
        return mid;
    }

    public static void main(String[] args) {
        double number = 16;
        double precision = 0.0001;  // Define the precision
        
        double sqrt = squareRoot(number, precision);
        
        System.out.println("Square root of " + number + " is: " + sqrt);
    }
}
