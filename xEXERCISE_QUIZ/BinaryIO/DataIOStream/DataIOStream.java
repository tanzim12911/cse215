package xEXERCISE_QUIZ.BinaryIO.DataIOStream;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream outFile = new FileOutputStream("temp1.dat");
            DataOutputStream output = new DataOutputStream(outFile);

            output.writeUTF("AlissonBecker");
            output.writeInt(91);
            output.writeUTF("VanDijk");
            output.writeInt(89);
            output.writeUTF("MoSalah");
            output.writeInt(89);

            FileInputStream inpFile = new FileInputStream("temp1.dat");
            DataInputStream input = new DataInputStream(inpFile);

            System.out.println("Name: " + input.readUTF() + "| Score: " + input.readInt());
            System.out.println("Name: " + input.readUTF() + "| Score: " + input.readInt());
            System.out.println("Name: " + input.readUTF() + "| Score: " + input.readInt());

        } 
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
