import javax.swing.*;

public class PopUp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Object result = JOptionPane.showInputDialog(frame, "Enter Your Name: ");

        System.out.println("Hello " + result);
    }
}