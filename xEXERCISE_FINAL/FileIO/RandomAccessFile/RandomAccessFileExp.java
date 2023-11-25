package xEXERCISE_FINAL.FileIO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExp {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f1 = new RandomAccessFile("random.dat", "rw");

        f1.setLength(0);

        for(int i = 1; i <= 100; i++) {
            f1.writeInt(i);
        }

        System.out.println(f1.length());
        
        f1.seek(0);
        System.out.println("1st Num: " + f1.readInt());

        f1.seek(5 * 4);
        System.out.println("6th Num: " + f1.readInt());

        f1.seek(6 * 4);
        System.out.println("7th Num: " + f1.readInt());

        f1.writeInt(700);

        f1.seek(f1.length());
        f1.writeInt(101);

        System.out.println("New Size: " + f1.length());

        f1.seek(6 * 4);
        System.out.println("Modified 7th Num: " + f1.readInt());

        
    }
}
