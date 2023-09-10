package lab_03;

public class task5a {
    public static void main(String[] args) {
        int upper = (int) (1 + Math.random() * (1000 - 1 + 1));
        int lower = (int) (1 + Math.random() * (1000 - 1 + 1));

        if (upper < lower) {
            int temp = upper;
            upper = lower;
            lower = temp;
        }

        System.out.println(upper);
        System.out.println(lower);
    }
}
