package com.bytecode.awt;

import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Example");

        // Grid with 2 rows and 3 columns
        frame.setLayout(new GridLayout(2, 3, 10, 10)); // 10px horizontal & vertical gaps

        // Add buttons
        for (int i = 1; i <= 6; i++) {
            frame.add(new Button("Button " + i));
        }

        frame.setSize(400, 200);
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                frame.dispose();
            }
        });
    }
}

