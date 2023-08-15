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

        for (int j = 0; j < i; j++) 
        {
            for (int k = 1; j < i; k++) 
            {
                if (numList[j] == numList[k])
                    count++;
                
                if (count > 1)
                    System.out.println(numList[j] + " occurs " + count + " times");
                else   
                  System.out.println(numList[j] + " occurs " + count + " times");
            }
            count = 0;
        }
        
    }
}
