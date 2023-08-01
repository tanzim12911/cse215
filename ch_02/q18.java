package ch_02;

public class q18 {
    public static void main(String[] args) {
        System.out.print("a    b    pow(a, b)");

        for (int i = 1; i <= 6; i++)
        {
            System.out.println(i + "    " + (i + 1) + "    " + (int) Math.pow(i, i + 1));
        }
    }
    
}
