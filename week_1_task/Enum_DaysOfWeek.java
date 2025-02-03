package week_1_task;

public class Enum_DaysOfWeek {
	 // Method to check if the day is a holiday
    static void checkHoliday(DaysOfWeek day) {
        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
            System.out.println(day + ": Holiday");
        } else {
            System.out.println(day + ": Not Holiday");
        }
    }

    public static void main(String[] args) {
        // Testing the checkHoliday method with different days
        checkHoliday(DaysOfWeek.MONDAY);
        checkHoliday(DaysOfWeek.SATURDAY);
        checkHoliday(DaysOfWeek.SUNDAY);
        checkHoliday(DaysOfWeek.WEDNESDAY);
    }
    

}
