public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 23)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
