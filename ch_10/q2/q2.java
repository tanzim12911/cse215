package ch_10.q2;

public class q2 {
    public static void main(String[] args) {
        BMI p1 = new BMI("Tanzim", 21, 159, 5, 7);
        System.out.println("BMI: " + p1.getBMI());
        System.out.println("Status: " + p1.getStatus());
    }
}
