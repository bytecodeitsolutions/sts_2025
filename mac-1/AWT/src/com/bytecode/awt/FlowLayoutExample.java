package com.bytecode.awt;

import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create frame
        Frame frame = new Frame("FlowLayout Example");

        // Set FlowLayout
        frame.setLayout(new FlowLayout());

        // Add buttons
        for (int i = 1; i <= 5; i++) {
            frame.add(new Button("Button " + i));
        }

        frame.setSize(400, 200);
        frame.setVisible(true);

        // Close window properly
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                frame.dispose();
            }
        });
    }
}

