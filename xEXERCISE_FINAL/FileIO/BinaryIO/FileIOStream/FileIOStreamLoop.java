package xEXERCISE_FINAL.FileIO.BinaryIO.FileIOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOStreamLoop {
    public static void main(String[] args) throws IOException{
        FileOutputStream outfile = new FileOutputStream("temp1.dat");
        DataOutputStream output = new DataOutputStream(outfile);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Student: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Student " + i + " Name: ");
            output.writeUTF(sc.next());
            output.writeInt(sc.nextInt());
        }

        FileInputStream infile = new FileInputStream("temp1.dat");
        DataInputStream input = new DataInputStream(infile);

        for (int i = 1; i <= n; i++) {
            System.out.println("Name: " + input.readUTF() + " | Score: " + input.readInt());
        }
        
        
        
    }
}
