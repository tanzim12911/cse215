package xEXERCISE_FINAL.GUI.FlowLayout;

import java.awt.*;
import javax.swing.*;

public class Flow extends JFrame {
    private Container x;

    Flow() {
        allComponant();
    }

    void allComponant() {
        x =this.getContentPane();
        
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 20, 10);

        x.setLayout(f1);

        x.setBackground(Color.CYAN);

        JLabel jl1 = new JLabel("Name");
        x.add(jl1);

        JTextField jt1 = new JTextField("Field");
        x.add(jt1);
    }
}
