public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number &lt; 0) {
            return -1;
        }
        if (number &lt; 10) {
            return (2 * number);
        }
        int lastDigit = number % 10;
        while (number &gt; 9) {
            number = number / 10;
            
        }
        return (lastDigit + number);
    }
}
