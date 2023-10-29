package ch_12.q14;

import java.io.File;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file: ");

        String location = "C:/Workspace/cse215/cse215/ch_12/q14"+ "/sc.nextLine()";

        File f1 = new File(location);

        Scanner input = new Scanner(f1);

        double sum = 0;
        int count = 0;

        while(input.hasNext()) {
            sum += input.nextDouble();
            count++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum / count);

    }
}
