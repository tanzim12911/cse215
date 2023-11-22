package xEXERCISE_FINAL.FileIO.BinaryIO.FileIOStream;

import java.io.*;

public class FileIOStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream outfile = new FileOutputStream("temp1.dat");
        DataOutputStream output = new DataOutputStream(outfile);

        output.writeUTF("Van Dijk");
        output.writeInt(89);
        output.writeUTF("Alisson Becker");
        output.writeInt(90);
        output.writeUTF("Mo Salah");
        output.writeInt(89);

        FileInputStream infile = new FileInputStream("temp1.dat");
        DataInputStream input = new DataInputStream(infile);

        System.out.println("Name: " + input.readUTF() + "Score: " + input.readInt());
        System.out.println("Name: " + input.readUTF() + "Score: " + input.readInt());
        System.out.println("Name: " + input.readUTF() + "Score: " + input.readInt());
    }
}
