package ch_12.q15;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        File f1 = new File("C:/Workspace/cse215/cse215/ch_12/q15" + "/Exercise12_15.txt");

        try {
            if(!f1.exists()) {
            f1.createNewFile();
        }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileWriter f1w = new FileWriter(f1, true);

            for (int i = 0; i < 100; i++) {
                int randomNum = (int) (Math.random() * 10);
                f1w.write(randomNum + " ");
            }

            f1w.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        int[] numList = new int[100];

        try {
            Scanner input = new Scanner(f1);

            int i = 0;

            while(input.hasNext()) {
                numList[i] = input.nextInt();
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        java.util.Arrays.sort(numList);

        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + " ");
        }



    }
}
