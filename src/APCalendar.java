public class APCalendar {
    private int year;
    private static boolean isLeapYear(int year){
        return (year % 4 == 0);
    }
    public static int numberOfLeapYears(int year1, int year2){
        int leapYears = 0;
        if (year1 % 4 == 0) {
            leapYears++;
        }
        if (year2 % 4 == 0) {
            leapYears++;
        }
        int diff = year2 - year1 - 1;
        leapYears = leapYears + (diff/4);
        return leapYears;
    }
    public static int firstDayOfYear(int year){
        int leapYears = (int) ((year-1)/4);
        return ((((year-leapYears-1)*365)+(leapYears*366)) % 7);
    }
    private static int dayOfYear(int month, int day, int year){
        return (month* 4) + firstDayOfYear(year);
    }
    public static int dayOfWeek(int month, int day, int year){
        return 0;
    }
}
