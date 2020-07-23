package IoTest;

import javax.imageio.IIOException;
import java.io.*;

public class StanderIn {
    //将标准输入流 重定向到 FileOutPutStream
    public static void main(String[] args) {
        try {
            String fp = "C:/Users/29596/Desktop/data.txt";
            String s;
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream(fp)));
            System.setOut(out);
            while(true){
                s = bf.readLine();
                if(s.equals("EOF")) break;
                System.out.println(s);
            }


            out.close();
            // PrintStream ps = System.out;

        }
        catch (IOException e){

        }


    }
}
