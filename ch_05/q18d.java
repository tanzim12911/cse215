package ch_05;

public class q18d {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
