package xEXERCISE_FINAL.FileIO.BinaryIO.DataIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        
        try {
            FileOutputStream output = new FileOutputStream("temp.dat");

            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        try {
            FileInputStream input = new FileInputStream("temp.dat");

            int value;

            while ((value = input.read()) != -1) {
                System.out.println(value + " ");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
