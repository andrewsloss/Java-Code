import java.util.*;
import java.io.*;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {

    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter Text: ");
    	String text = scanner.nextLine();
        File file = new File("writing_to_files_test.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(text);

        pw.close();
        scanner.close();

    }
}