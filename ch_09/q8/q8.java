package ch_09.q8;

public class q8 {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(3);
        f1.setRadius(10);
        f1.color = "yellow";
        f1.setOn(true);

        f2.setSpeed(3);
        f2.setRadius(5);
        f2.color = "blue";
        f2.setOn(false);

        System.out.println("Fan 1: " + f1.toString());
        System.out.println("Fan 2: " + f2.toString());


    }
}
