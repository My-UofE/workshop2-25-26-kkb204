public class SumAverageInt {
    public static void main(String[] args) {
        int sum = 0; 
        double average; // The accumulated sum, init to 0
        // average in double
        int lowerbound = 1;
        int upperbound = 100;
        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number; // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int/int produces int!
        int newAverage = sum / upperbound;

        // Print sum and average
        System.out.println(newAverage);
        System.out.println(sum);

     }
}
