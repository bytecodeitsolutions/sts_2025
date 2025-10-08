package com.bytecode.swing;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Swing Example");
        
        
        // Create JLabel
        JLabel label = new JLabel("Hello, this is Swing!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Add label to frame
        frame.add(label);

        // Set frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

