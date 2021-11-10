public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		firstNum *= 1000.00d;
		secondNum *= 1000.00d;
		int firstRounded = (int) firstNum;
		int secondRounded = (int) secondNum;
		
		if (firstRounded == secondRounded) {
			return true;
		} else {
			return false;
		}
	}
}
