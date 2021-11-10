public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number =  java.lang.Math.abs(number);
        int reverse = 0;
        int compare = number;
        while (number &gt; 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = (reverse + lastDigit);
            number = number / 10;
        }
        if (compare == reverse) {
            return true;
        }
        return false;
    }
 
}
