public class SumAverageInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        double average;
        int upperbound = 100;
        int number = lowerbound; // declare and init loop index variable
        while (number <= upperbound) { // test
            sum += number;
            ++number; // update
        }
        int newAverage = sum / upperbound;
        System.out.println(newAverage);
        System.out.println(sum);
     }
}
