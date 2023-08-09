package ch_05;

public class q20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++)
        {
            for (int j = i / 2; j <= 100; j++)
            {
                if (i % j != 0)
                {
                    System.out.print(i + " ");
                    count++;

                    if (count == 8)
                    {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }
}
