package IoTest;

import java.io.*;

public class FileTest {
    final static String filePath = "C:/Users/29596/Desktop/Pi.txt";
    public static void main(String[] args) throws IOException {

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filePath)));
        while(in.available() != 0)
            System.out.print( (char) in.readByte());
        in.close();
        System.out.println();
    }


}
