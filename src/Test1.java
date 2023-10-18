import java.util.Arrays;

/**
 * Fibonacci series
 */

public class Test1 {
    private static int n1 = 5;
    private static int n2 = 8;
    private static int size = 10;
    private static int[] fiboArr = new int[size];
    private static int count_even;
    private static int count_odd;
    private static float avgEven;
    private static float avgOdd;

    public static void main(String[] args) {
        createFiboArr(n1, n2, fiboArr);
        System.out.print("Fibonacci digits " + Arrays.toString(fiboArr) + System.lineSeparator());
        countEven(fiboArr);
        System.out.print("count even is " + count_even + System.lineSeparator());
        countOdd(fiboArr);
        System.out.print("count odd is " + count_odd + System.lineSeparator());
        countAvgEven(size, count_even);
        System.out.print("percent even digits is " + avgEven + System.lineSeparator());
        countAvgOdd(size, count_odd);
        System.out.print("percent odd digits is " + avgOdd);
    }

    private static int[] createFiboArr(int n1, int n2, int[] fiboArr) {
        fiboArr[0] = n1;
        fiboArr[1] = n2;
        for (int i = 2; i < fiboArr.length; i++) {
            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
        }
        return fiboArr;
    }

    private static int countEven(int[] fiboArr) {
        count_even = 0;
        for (int i = 0; i < fiboArr.length; i++) {
            if (fiboArr[i] % 2 == 0 && fiboArr[i] != 0) {
                count_even++;
                System.out.print(fiboArr[i] + " ");
            }
        }
        return count_even;
    }

    private static int countOdd(int[] fiboArr) {
        count_odd = 0;
        for (int i = 0; i < fiboArr.length; i++) {
            if (fiboArr[i] % 2 != 0 && fiboArr[i] != 0) {
                count_odd++;
                System.out.print(fiboArr[i] + " ");
            }
        }
        return count_odd;
    }

    private static double countAvgEven(int size, int count_even) {
        avgEven = (count_even * 100.0f) / size;
        return avgEven;
    }

    private static double countAvgOdd(int size, int count_odd) {
        avgOdd = (count_odd * 100.0f) / size;
        return avgOdd;
    }
}