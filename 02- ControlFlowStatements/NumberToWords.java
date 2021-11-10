public class NumberToWords {
    public static int reverse(int number) {
        //number = java.lang.Math.abs(number);
        int reverse = 0;
        while(number!=0) {
            int dig = number % 10;
            reverse *= 10;
            reverse+=dig;
            number/=10;
        }
        return reverse;
    }
    
    public static int getDigitCount(int number) {
        if(number&lt;0) {
            return -1;
        }
        int count = 1;
        while(number&gt;9) {
            number/=10;
            count++;
        }
        return count;
    }
    
    public static void numberToWords(int number) {
        if(number&lt;0) {
            System.out.println("Invalid Value");
        }
        int revnumber = reverse(number);
        int count = 0;
        int digitCount = getDigitCount(number);
        while (count &lt; digitCount) {
            int digit = revnumber % 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
                    
            }
            revnumber = revnumber / 10;
            count++;
        }
    }
}
