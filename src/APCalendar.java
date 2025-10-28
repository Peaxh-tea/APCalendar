public class APCalendar {
    private int year;
    public APCalendar(int year){
        this.year = year;
    }
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
    private static int firstDayOfYear(int year){
        return 0;
    }
    private static int dayOfYear(int month, int day, int year){
        return 0;
    }
    public static int dayOfWeek(int month, int day, int year){
        return 0;
    }
}
