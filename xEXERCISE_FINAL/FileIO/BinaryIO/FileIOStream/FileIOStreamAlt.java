package xEXERCISE_QUIZ.BinaryIO.FileIOStream;

import java.io.*;

public class FileIOStreamAlt {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("temp.dat");

            for(int i = 1; i <= 10; i++) {
                output.write(i);
            }

            FileInputStream input = new FileInputStream("temp.dat");

            int value;

            while((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
