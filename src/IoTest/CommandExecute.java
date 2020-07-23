package IoTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandExecute {
    public static void command(String command) throws IOException {
        Process process = new ProcessBuilder(command.split(" ")).start();
        BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream(),"UTF-8"));
        String s;
        while((s = results.readLine())!= null){
            System.out.println(s);

        }
    }
    public static void main(String[] args) throws IOException {
        CommandExecute.command("cmd /c ipconfig");
    }
}
