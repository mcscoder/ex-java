package mytime;
// Done
public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    private static boolean isValidTime(int hour, int minute, int second) {
        return (0 <= hour   && hour   <= 23 &&
                0 <= minute && minute <= 59 &&
                0 <= second && second <= 59);
    }
    public MyTime() {}
    public MyTime(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second) == false){
            System.out.println("Invalid hour, minute or second");
            return;
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int second() {
        return second;
    }

    public void setHour(int hour) {
        if (isValidTime(hour, minute, second) == false) {
            System.out.println("Invalid hour");
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (isValidTime(hour, minute, second) == false) {
            System.out.println("Invalid minute");
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (isValidTime(hour, minute, second) == false) {
            System.out.println("Invalid second");
            return;
        }
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (isValidTime(hour, minute, second + 1)) {
            second += 1;
            return this;
        }
        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute() {
        if (isValidTime(hour, minute + 1, second)) {
            minute += 1;
            return this;
        }
        minute = 0;
        return nextHour();
    }

    public MyTime nextHour() {
        if (isValidTime(hour + 1, minute, second)) {
            hour += 1;
            return this;
        }
        hour = 0;
        return this;
    }

    public MyTime previousSecond() {
        if (isValidTime(hour, minute, second - 1)) {
            second -= 1;
            return this;
        }
        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        if (isValidTime(hour, minute - 1, second)) {
            minute -= 1;
            return this;
        }
        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {  
        if (isValidTime(hour - 1, minute, second)) {
            hour -= 1;
            return this;
        }
        hour = 23;
        return this;
    }
}