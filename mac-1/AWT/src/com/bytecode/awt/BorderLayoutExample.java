package com.bytecode.awt;

import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");

        frame.setLayout(new BorderLayout());

        // Add buttons to 5 regions
        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button("East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                frame.dispose();
            }
        });
    }
}

