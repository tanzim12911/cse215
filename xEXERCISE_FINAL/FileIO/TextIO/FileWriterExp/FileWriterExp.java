package xEXERCISE_FINAL.FileIO.TextIO.FileWriterExp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExp {
    public static void main(String[] args) throws IOException {
        File f1 = new File("marksheet.txt");

        FileWriter fw = new FileWriter(f1);

        fw.write("Van Dijk 89\n");
        fw.write("Alisson Becker 90\n");
        fw.write("Mo Salah 89\n");

        fw.close();

        Scanner read = new Scanner(f1);

        while(read.hasNext()) {
            String first_name = read.next();
            String last_name = read.next();
            int score = read.nextInt();
            
            System.out.println("First Name: " + first_name + " | Last Name: " + last_name + " | Score: " + score);
        }


    }
}
