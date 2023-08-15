package ch07;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100: ");
        Scanner sc = new Scanner(System.in);
        int i = 0, count = 0;
        int [] numList = new int[100];
        
        while (true)
        {
            numList[i] = sc.nextInt();
            
            if (numList[i] == 0)
                break;  
            i++;
        }

        for (int j = 1; j <= 100; j++) 
        {
            for (int k = 0; k < i; k++) 
            {
                if (j == numList[k])
                    count++;
            }

            if (count != 0)
            {
                System.out.printf("%d occurs %d %s\n" j, count, (count > 1) ? "times" : "time");
            }
            
        }
        
    }
}
