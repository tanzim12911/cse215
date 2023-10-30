package xEXERCISE_QUIZ.TextIO.ReplaceString;

import java.util.Scanner;
import java.io.*;

public class ReplaceString {
    public static void main(String[] args) throws IOException {
        File f1 = new File("CourseFile.txt");
        
        FileWriter file = new FileWriter(f1);
        
        file.write("CSE115\n");
        file.write("CSE215\n");
        file.write("CSE173\n");
        file.close();

        File f2 = new File("NewCourseFile.txt");
        FileWriter file2 = new FileWriter(f2);

        try {
            Scanner sc = new Scanner(f1);

            while(sc.hasNext()) {
                String s1 = sc.next();
                String s2 = s1.replaceAll("CSE", "EEE");
                file2.write(s2 + "\n");
                file2.close();
            }
            Scanner sc2 = new Scanner(f2);
            
            while (sc2.hasNext()) {
                String n_s1 = sc2.next();

                System.out.println(n_s1 + "\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
