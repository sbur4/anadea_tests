/**
 * Factorial
 */

public class Test2 {
    private static int start = 1;
    private static int end = 5;
    private static int fact = 1;

    public static void main(String[] args) {
        countFactorial(start, end, fact);
    }

    private static void countFactorial(int start, int end, int fact) {
        for (int i = start; i <= end; ++i) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}