package ch_01;

public class q12 {
    public static void main(String[] args) {
        double distance, time, speed;
        distance = 24 * 1.6;
        time = 1 + (40/60.0) + (35/3600.0);
        speed = distance / time;

        System.out.println("Average speed: " + speed);
    }
}
