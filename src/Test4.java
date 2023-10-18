/**
 * Prime number
 */

public class Test4 {
    public static void main(String[] args) {
        int[] n = {91, 62, 313, 50, 5, 0};
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                System.out.println("prime number is " + n[i] + " ");
            } else {
                System.out.println("isn't prime number " + n[i] + " ");
            }
        }
    }
}