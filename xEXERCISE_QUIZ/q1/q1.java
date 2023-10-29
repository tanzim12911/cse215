package xEXERCISE_QUIZ.q1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("marksheet.txt", true);
            file.write("Tamim 29\n"); // Add a newline character after each entry
            file.write("Shakib 75\n");
            file.write("Mahmudullah 30\n");
            file.close();

            // Create a Scanner to read from the file
            Scanner read = new Scanner(new File("marksheet.txt"));

            while (read.hasNext()) {
                String name = read.next();
                int score = read.nextInt();

                System.out.println("Name: " + name + "  Score: " + score);
            }

            read.close(); // Close the Scanner
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
