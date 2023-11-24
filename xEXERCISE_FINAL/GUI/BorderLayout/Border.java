package xEXERCISE_FINAL.GUI.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Border extends JFrame {
    private Container x;

    Border() {
        allComponant();
    }

    void allComponant() {
        x = this.getContentPane();

        GridLayout gl = new GridLayout(2, 3, 10, 10);

        x.setLayout(gl);

        x.setBackground(Color.RED);

        JLabel jl1 = new JLabel("Name: ");
        x.add(jl1);
        JTextField jt1 = new JTextField(24);
        x.add(jt1);

        JLabel jl2 = new JLabel("ID: ");
        x.add(jl2);
        JTextField jt2 = new JTextField(24);
        x.add(jt2);

    }
} 
