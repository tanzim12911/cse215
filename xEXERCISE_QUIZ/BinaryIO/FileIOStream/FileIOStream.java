package xEXERCISE_QUIZ.BinaryIO.FileIOStream;

import java.io.*;

public class FileIOStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("temp.dat");

        for(int i = 1; i <= 10; i++) {
            output.write(i);
        }

        FileInputStream input = new FileInputStream("temp.dat");

        int value;

        while((value = input.read()) != -1) {
            System.out.println(value + " ");
        }
    }
}
