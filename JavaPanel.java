// Chapter 14

import javax.swing.*;
import java.awt.*;

public class JavaPanel extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);

        g.fillRect(20, 50, 100, 100);
    }
}
