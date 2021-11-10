public class SumOddRange {
    public static boolean isOdd(int number) {
        if ((number &lt;= 0) || (number % 2 == 0)) {
            return false;
        }
        return true;
    }
    
    public static int sumOdd(int start, int end) {
        if ((end &lt; start) || (end &lt;= 0) || (start &lt;=0)) {
            return -1;
        }
        int sum = 0;
        for(int i = start;i &lt;= end;i++) {
            if (isOdd(i)) {
                sum += i;
                
            }
        }
        return sum;
    }
 
}
