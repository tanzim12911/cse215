package ch_09.q6;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    void start() {
        startTime = System.currentTimeMillis();   
    }

    void stop() {
        endTime = System.currentTimeMillis();   
    }

    public long getElaspedTime () {
        return (endTime - startTime);
    }
}
