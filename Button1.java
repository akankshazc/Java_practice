import javax.swing.*;
import java.awt.*;

public class Button1 {

    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button1 = new JButton("click like you mean it");
        frame.getContentPane().add(BorderLayout.EAST, button1);
        frame.setSize(200, 200);
        frame.setVisible(true);

        JButton button2 = new JButton("There is no spoon...");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button2.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}