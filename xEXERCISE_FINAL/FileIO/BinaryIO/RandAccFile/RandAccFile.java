package xEXERCISE_QUIZ.BinaryIO.RandAccFile;
// Create a random access file
// Clear the file to destroy the old contents if exists
// Write new integers to the file
// Display the current length of the file
// Retrieve the first number
// Retrieve the second number
// Retrieve the sixth number
// Modify the seventh number
// Append a new number
// Display the new length
// Retrieve the new seventh number

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandAccFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile f1 = new RandomAccessFile("inout.dat", "rw");

        f1.setLength(0);

        for (int i = 1; i <= 100; i++) {
            f1.writeInt(i);
        }

        System.out.println("Length: " + f1.length());

        f1.seek(0);
        System.out.println("1st number: " + f1.readInt());

        f1.seek(1 * 4);
        System.out.println("2nd number: " + f1.readInt());

        f1.seek(5 * 4);
        System.out.println("6th number: " + f1.readInt());

        f1.seek(6 * 4);
        f1.writeInt(700);

        f1.seek(f1.length());
        f1.writeInt(101);

        System.out.println("New Length: " + f1.length());

        f1.seek(6 * 4);
        System.out.println("Modified 7th number: " + f1.readInt());
    }
}
