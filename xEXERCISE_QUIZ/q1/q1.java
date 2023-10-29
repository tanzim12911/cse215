package xEXERCISE_QUIZ.q1;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("marksheet.txt", true);

        try {
            file.write("Tamim 29");
            file.write("Shakib 75");
            file.write("Mahmudullah 30");
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Scanner read = new Scanner(new File("/marksheet.txt"));

        try {
            while (read.hasNext()) {
            String name = read.next();
            int score = read.nextInt();

            System.out.println("Name: " + name + "  Score: " + score);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
