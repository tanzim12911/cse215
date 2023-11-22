package xEXERCISE_QUIZ.TextIO.FileWriterExp;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class FileWriterExp {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Marksheet.txt");
        FileWriter file = new FileWriter(f1);

        file.write("Alisson Becker 91\n");
        file.write("Van Dijk 89\n");
        file.write("Mo Salah 89\n");
        file.close();

        try {
            Scanner sc = new Scanner(f1);

            while(sc.hasNext()) {
                String first_name = sc.next();
                String last_name = sc.next();
                int score = sc.nextInt();

                System.out.println("Name: " + first_name + " " + last_name + "      | Score: " + score);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
