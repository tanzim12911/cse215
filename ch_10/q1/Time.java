package ch_10.q1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time() {
        int temp = (int) (System.currentTimeMillis() / 1000);

        hour = temp / 3600;
        minute = (temp % 3600) / 60;
        second = (temp % 3600) % 60;

    }

    Time(long ms) {

    }

    Time(int hour, int minute, int second) {
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

    public int getSecond() {
        return second;
    }

    

}
