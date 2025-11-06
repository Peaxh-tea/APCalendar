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
    private static int firstDayOfYear(int year){
        int leapYears = (int) ((year-1)/4);
        return ((((year-leapYears-1)*365)+(leapYears*366)) % 7);
    }
    private static int dayOfYear(int month, int day, int year){
        int endDay = 0;
        for (int i = 1; i<= month; i++){
            if (i < 7){
                if (i == 2){
                    endDay += 28;
                    if (isLeapYear(year)) endDay++;
                } else if (i%2 == 0){
                    endDay += 30;
                } else {
                    endDay += 31;
                }
            } else if (i<=12){
                if (i%2 == 1){
                    endDay += 30;
                } else {
                    endDay += 31;
                }
            }
        }
        endDay += day;
        return (endDay);
    }
    public static int dayOfWeek(int month, int day, int year){
        int endDay = dayOfYear(month, day, year) + firstDayOfYear(year);
        return (endDay % 7);
    }
}
