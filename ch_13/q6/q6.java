package ch_13.q6;

public class q6 {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(10);

        if (c1.compareTo(c2) > 0)
            System.out.println("C1 is Larger");
        else if(c1.compareTo(c2) < 0)
            System.out.println("C2 is Larger");
        else
            System.out.println("Both equal");
    }
}
