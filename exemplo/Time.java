public class Time {
    static private long ticks = 0;
    static final long secondTicks = 1000;
    static final long minuteTicks = secondTicks * 60;
    static final long hourTicks = minuteTicks * 60;
    static final long dayTicks = hourTicks * 24;
    static final long yearTicks = dayTicks * 365;

    public Time(int year, int dayOfYear, int hour, int minute, int second) {
        this.ticks = yearTicks * year + dayTicks * dayOfYear + hourTicks * hour + minuteTicks * minute + secondTicks * second;
    }

    public int getYear() {
        return (int)(ticks / yearTicks) + 1970 ;
    }

    public int getDay() {
        int rest = (int)(ticks % yearTicks);
        return (int)(rest / dayTicks);
    }

    public static long getHourticks() {
        long rest = (int)(ticks % dayTicks);
        return (int)(rest / hourTicks);
    }

    public int getMinute() {
        long rest = ticks % hourTicks;
        return (int)(rest / minuteTicks);
    }

    public int getSeconds() {
        long rest = ticks % minuteTicks;
        return (int)(rest / secondTicks);
    }

    public void addSeconds(int seconds) {
        this.ticks += secondTicks * seconds;
    }

    public boolean isBiggerThan(Time other) {
        return this.ticks > other.ticks;
    }

    public static Time now() {
        return null;
    } 
}
