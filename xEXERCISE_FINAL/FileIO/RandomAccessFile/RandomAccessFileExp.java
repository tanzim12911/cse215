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
        
        


        
    }
}
