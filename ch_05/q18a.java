package ch_05;

public class q18a {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++)
        {
            System.out.print(i + " ");
            for (int j = 1; j <= i - 1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
