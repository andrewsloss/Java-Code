import java.util.*;
import java.io.*;
import java.awt.*;

public class OpenApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("------------------------------File-Opener------------------------------");
        Scanner s = new Scanner(System.in);
        //System.out.println("Command List = \"commands\"");
        System.out.println("Enter Command Below:");
        System.out.print("> ");
        String input = s.nextLine();

        if (input.equals("google")) {
            File file = new File("/Program Files (x86)/Google/Chrome/Application/chrome.exe");
            //"C:\Program Files\Google\Chrome\Application\chrome.exe"
            if (!Desktop.isDesktopSupported()) {
                System.out.println("desktop is not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
        }

        else if (input.equals("word")) {
            File file = new File("/Program Files/Microsoft Office/root/Office16/WINWORD.exe");
            //"C:\Program Files\Microsoft Office\root\Office16\WINWORD.EXE"
            if (!Desktop.isDesktopSupported()) {
                System.out.println("desktop is not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
        }

        else {
            System.out.println("NOT A COMMAND)");
        }
        s.close();
    }
}