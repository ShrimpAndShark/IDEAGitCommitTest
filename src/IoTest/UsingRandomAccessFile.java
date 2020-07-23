package IoTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
    static String filePath = "C:/Users/29596/Desktop/data.txt";
    public static void main (String[] args) throws IOException {
        RandomAccessFile  rf = new RandomAccessFile(filePath, "rw");
        for(int i = 0; i<7; i++)
            rf.writeUTF("end of file");


        rf.close();
        RandomAccessFile rfr = new RandomAccessFile(filePath, "r");
        System.out.println(rfr.readUTF());
        rfr.close();

    }

}
