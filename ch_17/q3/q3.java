package ch_17.q3;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) throws IOException {
        FileInputStream infile = new FileInputStream("ch_17/q3/Exercise17_03.dat");
        DataInputStream input = new DataInputStream(infile);

        int sum = 0;
        int numOfInt = input.available();

        try {
            for (int i = 0; i < numOfInt; i++) {
                int n = input.readInt();
                sum += n;
            }
        }
        catch(EOFException e) {
            e.printStackTrace();
        }

        System.out.println("Sum: " + sum);


    }
}
