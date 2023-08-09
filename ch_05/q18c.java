package ch_05;

public class q18c {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6; ++k)
            {
                System.out.print(i + " " + k);
            }
            System.out.println();
        }
    }
}
