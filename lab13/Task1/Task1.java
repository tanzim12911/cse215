package lab13.Task1;

import java.util.Scanner;
import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        File f1 = new File("integers.txt");

        FileWriter fw = new FileWriter(f1);

        System.out.print("Enter integers: ");

        int num;

        while((num = sc.nextInt()) > -1) {
            fw.write(num + "\n");
        }

        fw.close();

        Scanner reader = new Scanner(f1);

        while (reader.hasNext()) {
            int n = reader.nextInt();

            System.out.println(n + " ");
        }

    }
}
