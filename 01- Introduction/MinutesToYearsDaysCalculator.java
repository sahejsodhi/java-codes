public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0l) {
            System.out.println("Invalid Value");
        } else {
        long year = minutes / (365l * 24l * 60l);
        long day = (minutes % (365l * 24l * 60l)) / (24l * 60l);
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
