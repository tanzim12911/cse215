package xEXERCISE_FINAL.GUI.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Border extends JFrame{
    private Container x;

    Border() {
        allComponant();
    }

    void allComponant() {
        x = this.getContentPane();

        BorderLayout bl = new BorderLayout(5, 5);

        x.setLayout(bl);
        x.setBackground(Color.BLUE);

        JLabel jl1 = new JLabel("Name: ");
        x.add(jl1);
        JTextField jt1 = new JTextField(24);
        x.add(jt1);


    }
}
