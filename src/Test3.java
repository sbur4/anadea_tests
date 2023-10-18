/**
 * Palindrome
 */

public class Test3 {
    private static int number = 12321;
//    private static int number = 123421;

    public static void main(String[] args) {
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }
}