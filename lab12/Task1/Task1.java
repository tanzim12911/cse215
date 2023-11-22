package lab12.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        System.out.println("Enter 10 positive number:");

        do {
            try{
                int n = sc.nextInt();

                if(n < 1) {
                    throw new Exception("Input positive integer only");
                }
                else {
                    sum += n;
                    count++;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        } while(count < 10);

        System.out.println("Sum =" + sum);
    }
}
