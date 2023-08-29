package ch_09.q6;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    void start() {
        startTime = System.currentTimeMillis();   
    }

    void stop() {
        endTime = System.currentTimeMillis();   
    }

    long getElaspedTime () {
        return (startTime - endTime);
    }
}
