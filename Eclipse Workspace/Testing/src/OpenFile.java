import java.io.*;
import java.awt.*;

class OpenFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/My Drive/Eclipse Workspace/Testing/open_file_test.txt");
        //"G:/My Drive/Eclipse Workspace/Testing/open_file_test.txt"
        if(!Desktop.isDesktopSupported()) {
            System.out.println("desktop is not supported");
            return;
        }

        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) {
            desktop.open(file);

        }
    }
}