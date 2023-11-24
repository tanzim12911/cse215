package xEXERCISE_FINAL.GUI.Frame;

import java.awt.*;
import javax.swing.*;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Test Frame");

        f1.setSize(600, 400);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBackground(new Color(500));
    }
}
