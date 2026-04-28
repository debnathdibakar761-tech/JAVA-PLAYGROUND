package in.kgcoding.challange89;

public enum Day {
    MONDAY(true ),
    TUESDAY(true ),
    WEDDNESDAY(true ),
    THRUSDAY(true ),
    FRIDAY(true ),
    SATURDAY(false ),
    SUNDAY(false );

    private  final boolean isWeekday ;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType () {
        return isWeekday ? "Weekday" : "Weekend";
    }
}
