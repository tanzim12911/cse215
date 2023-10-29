package ch_17.q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Exercise17_02.dat");

        if (!f1.exists()) {
            try {
                f1.createNewFile();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream output = new FileOutputStream(f1, true);

            for (int i = 0; i < 100; i++) {
                int value = (int) (Math.random() * 200);

                output.write(value);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream input = new FileInputStream(f1);

            while(input.read() != -1) {
                System.out.print(input.read() + " ");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
