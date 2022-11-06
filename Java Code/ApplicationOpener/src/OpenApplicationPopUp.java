import javax.swing.*;
import java.io.*;
import java.awt.*;

public class OpenApplicationPopUp {
    public static void menu() throws IOException {
        JFrame frame = new JFrame();
        Object result = JOptionPane.showInputDialog(frame, "Enter Command:");
        file(result);
    }

    public static void file(Object result) throws IOException {
        if (result.equals("commands")) {
            File file = new File("/Users/andre/Downloads/File_Opener_Commands.txt");
            if (!Desktop.isDesktopSupported()) {
                System.out.println("desktop is not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
            menu();
        }

        else if (result.equals("google")) {
            File file = new File("/Program Files/Google/Chrome/Application/chrome.exe");
            //"C:\Program Files\Google\Chrome\Application\chrome.exe"
            if (!Desktop.isDesktopSupported()) {
                System.out.println("desktop is not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {
                desktop.open(file);
            }
            menu();
        }

        else if (result.equals("word")) {
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
            menu();
        }

        else if (result.equals("stop")) {
            System.out.println("Program Closed");
            System.exit(0);
        }

        else {
            System.out.println("NOT A COMMAND");
            menu();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("------------------------------File-Opener------------------------------");
        menu();
    }
}