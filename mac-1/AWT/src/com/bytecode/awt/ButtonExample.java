package com.bytecode.awt;

import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Button Example");

        // Create a button
        Button button = new Button("Click Me!");

        // Set button position and size (x, y, width, height)
        button.setBounds(100, 100, 100, 50);

        // Add button to frame
        frame.add(button);

        // Set frame size and layout
        frame.setSize(400, 300);
        frame.setLayout(null); // Using null layout to manually place components

        // Make frame visible
        frame.setVisible(true);

        // Handle button click using ActionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Optional: Close the frame properly when clicking the close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose(); // closes the frame
            }
        });
    }
}

