public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year &lt;1 || year &gt; 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if (((month &lt; 1) || (month &gt; 12)) || ((year &lt; 1) || (year &gt; 9999))) {
            return -1;
        }
        
        
        if(isLeapYear(year)) {
            switch(month) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
                case 4:case 6:case 9:case 11:
                    return 30;
                case 2:
                    return 29;
                default:
                    return -1;
            }
        }else {
            switch(month) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    return 31;
                case 4:case 6:case 9:case 11:
                    return 30;
                case 2:
                    return 28;
                default:
                    return -1;
            }
        }
        //return 0;
    }
}
