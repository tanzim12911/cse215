package xEXERCISE_FINAL.FileIO.TextIO.ReplaceString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) throws IOException {
        File f1 = new File("courseFile.txt");
        File f2 = new File("newCourseFile");

        try {
            FileWriter fw = new FileWriter(f1);

            fw.write("CSE115\n");
            fw.write("CSE215\n");
            fw.write("CSE173\n");

            fw.close();
        } catch (IOException e) {
            
        }

        try {
            Scanner reader = new Scanner(f1);

            FileWriter fw2 = new FileWriter(f2);
            
            while (reader.hasNext()) {
                String s1 = reader.next();
                String s2 = s1.replaceAll("CSE", "EEE");

                fw2.write(s2 + "\n");
            }

            fw2.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
