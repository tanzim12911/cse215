package ch_09.q8;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        String result;
        if(on) {
            result = speed + " , " +  color + " , " + radius;
        }
        else
            result = color + " , " + radius + " , fan is off";
        

        return result;
    }
}
