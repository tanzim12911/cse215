package ch_05;

public class q18b {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++)
        {
            for (int j = 6; j >= i; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
