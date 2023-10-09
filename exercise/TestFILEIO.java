package exercise;

import java.io.File;

public class TestFILEIO {
    public static void main(String[] args) {
        File f1 = new File("testfile.txt");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
    }
}
