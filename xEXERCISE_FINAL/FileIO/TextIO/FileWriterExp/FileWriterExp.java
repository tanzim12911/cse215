package xEXERCISE_FINAL.FileIO.TextIO.FileWriterExp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExp {
    public static void main(String[] args) throws IOException {
        File f1 = new File("marksheet.txt");

        FileWriter fw = new FileWriter(f1);

        fw.write("Van Dijk 89");
        fw.write("Alisson Becker 90");
        fw.write("Mo Salah 89");

        fw.close();

        Scanner read = new Scanner(f1);

        while(read.hasNext()) {
            System.out.println("First Name: " + read.next() + " | Last Name: " + read.next() + " | Score: " + read.nextInt());
        }


    }
}
